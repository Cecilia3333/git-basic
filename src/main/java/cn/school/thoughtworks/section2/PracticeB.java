package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Integer count;
        Map<String,Integer> re = new HashMap<>();
        for(String s : collection1){
            if(s.contains("-")) {
                String [] record=s.split("-");
                re.put(record[0],Integer.valueOf(record[1]));
            }
            else {
                count = re.containsKey(s) ? re.get(s) : 0;
                re.put(s, count + 1);
            }
        }
        return re;
    }
}
