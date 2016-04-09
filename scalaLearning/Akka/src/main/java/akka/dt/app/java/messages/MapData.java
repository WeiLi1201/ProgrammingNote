package akka.dt.app.java.messages;

import java.util.List;

/**
 * Created by Variant on 16/4/9.
 */
public class MapData {
    private List<WordCount> dataList;

    public List<WordCount> getDataList() {
        return dataList;
    }

    public MapData(List<WordCount> dataList) {
        this.dataList = dataList;
    }
}
