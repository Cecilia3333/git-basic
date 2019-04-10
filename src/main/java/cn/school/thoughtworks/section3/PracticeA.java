package cn.school.thoughtworks.section3;

import java.util.*;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
       // List<String> re = new ArrayList();
      //  Map<String,Integer> re = new HashMap<>();
        Set<String> hash =new HashSet<>();
        for (String key : object.keySet()) {
            for(String s : object.get(key)) {
                hash.add(s);
            }
        }
        for (String key : collectionA.keySet()) {
          //  System.out.println("map.get(" + key + ") = " + collectionA.get(key));
            if(!hash.add(key)) {
                collectionA.put(key,collectionA.get(key)-1);
            }
        }
        return collectionA;
    }
}
