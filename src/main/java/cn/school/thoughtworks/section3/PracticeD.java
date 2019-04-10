package cn.school.thoughtworks.section3;

import java.util.*;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Integer count;
        Map<String,Integer> re = new HashMap<>();
        for(String s : collectionA) {
            if (s.contains("-")) {
                String[] record = s.split("-");
                count = re.containsKey(record[0]) ? re.get(record[0]) : 0;
                re.put(record[0], count + Integer.valueOf(record[1]));
            } else {
                count = re.containsKey(s) ? re.get(s) : 0;
                re.put(s, count + 1);
            }
        }
        Set<String> hash =new HashSet<>();
        for (String key : object.keySet()) {
            for(String s : object.get(key)) {
                hash.add(s);
            }
        }
        for (String key : re.keySet()) {
            //  System.out.println("map.get(" + key + ") = " + collectionA.get(key));
            if(!hash.add(key)) {
                re.put(key,(re.get(key)>=3?(re.get(key)-re.get(key)/3):re.get(key)));
            }
        }
        return re;
    }
}
