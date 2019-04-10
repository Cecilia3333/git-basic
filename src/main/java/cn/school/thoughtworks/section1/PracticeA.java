package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> re = new ArrayList() ;
        Set<String> hash =new HashSet<>();
        for(String s : collection2){
           // System.out.println(s);
            hash.add(s);
        }
        for(String s: collection1){
            if(!hash.add(s)){
                re.add(s);
            }
        }
        return re;
    }
}
