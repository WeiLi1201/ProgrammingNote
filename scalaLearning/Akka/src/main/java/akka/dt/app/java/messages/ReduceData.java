package akka.dt.app.java.messages;

import java.util.HashMap;

/**
 * Created by Variant on 16/4/9.
 */
public class ReduceData {
    private HashMap<String,Integer> reduceDataList;

    public HashMap<String, Integer> getReduceDataList() {
        return reduceDataList;
    }

    public ReduceData(HashMap<String, Integer> reduceDataList) {
        this.reduceDataList = reduceDataList;
    }
}
