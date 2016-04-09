package akka.dt.app.java.actors;

import akka.actor.UntypedActor;
import akka.dt.app.java.messages.ReduceData;
import akka.dt.app.java.messages.Result;

import java.util.HashMap;

/**
 * Created by Variant on 16/4/9.
 */
public class AggregateActor extends UntypedActor{
    private HashMap<String,Integer> finalReduceMap = new HashMap<String,Integer>();


    @Override public void onReceive(Object message) throws Exception {
        if(message instanceof ReduceData){
            ReduceData reduceData = (ReduceData) message;
            aggregateInMenmoryReduce(reduceData.getReduceDataList());
        }else if(message instanceof Result){
            System.out.println(finalReduceMap.toString());
        }else{
            unhandled(message);
        }
    }

    private void aggregateInMenmoryReduce(HashMap<String, Integer> reducedList) {
        Integer count =null;
        for(String key : reducedList.keySet()){
            if(finalReduceMap.containsKey(key)){
                count = reducedList.get(key)+finalReduceMap.get(key);
                finalReduceMap.put(key,count);
            }else{
                finalReduceMap.put(key,count);
            }
        }
    }

}
