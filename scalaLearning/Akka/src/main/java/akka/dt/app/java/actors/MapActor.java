package akka.dt.app.java.actors;

import akka.actor.ActorRef;
import akka.actor.UntypedActor;
import akka.dt.app.java.messages.MapData;
import akka.dt.app.java.messages.WordCount;
import scala.actors.threadpool.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by Variant on 16/4/9.
 */
public class MapActor extends UntypedActor{

    private ActorRef reduceActor =null;

    String[] STOP_WORDS = {"a","is"};

    private List<String> STOP_WORDS_LIST = Arrays.asList(STOP_WORDS);

    public MapActor(ActorRef reduceActor) {
        this.reduceActor = reduceActor;
    }

    @Override public void onReceive(Object message) throws Exception {
        if(message instanceof String){
            String work = (String) message;
            //map the words in the sentence
            MapData data = evaluationExpression(work);
            //send the reduce to ReduceActor
            reduceActor.tell(data);
        }
    }
    //这样返回的就是(happy,1)(happy,1)
    private MapData evaluationExpression(String line) {
        List<WordCount> datalist =new ArrayList<WordCount>();
        StringTokenizer parser = new StringTokenizer(line);
        while (parser.hasMoreTokens()){
            String word = parser.nextToken().toLowerCase();
            if(!STOP_WORDS_LIST.contains(word)){
                datalist.add(new WordCount(word,1));
            }
        }
        return new MapData(datalist);

    }
}
