package akka.dt.app.java.actors;

import akka.actor.ActorRef;
import akka.actor.UntypedActor;
import akka.dt.app.java.messages.MapData;
import akka.dt.app.java.messages.ReduceData;
import akka.dt.app.java.messages.WordCount;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Variant on 16/4/9.
 */
public class ReduceActor extends UntypedActor {

    private ActorRef aggregateAcotr= null;

    public ReduceActor(ActorRef aggregateAcotr) {
        this.aggregateAcotr = aggregateAcotr;
    }

    @Override public void onReceive(Object message) throws Exception {
        if(message instanceof MapData){
            MapData mapData = (MapData) message;
            //reduce the incoming data
            ReduceData reduceData = reduce(mapData.getDataList());
            // forward the result to aggregate Actor
            aggregateAcotr.tell(reduceData);

        }else{
            unhandled(message);
        }
    }

    private ReduceData reduce(List<WordCount> dataList) {
        HashMap<String,Integer> reduceMap = new HashMap<String,Integer>();
        for (WordCount wordcount : dataList) {
            if(reduceMap.containsKey(wordcount.getCount())){
                Integer value = (Integer) reduceMap.get(wordcount.getWord());
                value++;
                reduceMap.put(wordcount.getWord(),value);
            }else{
                reduceMap.put(wordcount.getWord(),1);
            }
        }
        return new ReduceData(reduceMap);
    }
}
