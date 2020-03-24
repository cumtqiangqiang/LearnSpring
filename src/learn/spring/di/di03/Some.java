package learn.spring.di.di03;

import java.util.*;

/**
 * Created by fiona on 2020/3/21.
 */
public class Some {
    private School[] schools;
    private String[] strs;
    private Set<String> mySets;
    private List<String> myList;
    private Map<String, String> myMaps;
    private Properties props;

    public void setSchools(School[] schools) {
        this.schools = schools;
    }

    public void setStrs(String[] strs) {
        this.strs = strs;
    }

    public void setMySets(Set<String> mySets) {
        this.mySets = mySets;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMyMaps(Map<String, String> myMaps) {
        this.myMaps = myMaps;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    @Override
    public String toString() {
        return "schools:" + Arrays.toString(schools) + "->" + "strs:" + Arrays.toString(strs) + "->" +
                "mySets:" + mySets + "->" + "myList:" + myList + "->" + "myMaps:"+myMaps + "->" + "props:"+props ;
    }
}
