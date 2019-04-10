package cn.school.thoughtworks.section1;

import java.util.*;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> re = new ArrayList();
        Set<String> hash =new HashSet<>();
        for (String key : collection2.keySet()) {
            for(String s : collection2.get(key)) {
                hash.add(s);
            }
        }
        for(String s: collection1){
            if(!hash.add(s)){
                re.add(s);
            }
        }
        return re;
    }
}
