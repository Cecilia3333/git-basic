package cn.school.thoughtworks.section2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Integer count;
        Map<String,Integer> re = new HashMap<>();
        for(String s : collection1) {
            if (s.contains("-")) {
                String[] record = s.split("-");
                count = re.containsKey(record[0]) ? re.get(record[0]) : 0;
                re.put(record[0], count + Integer.valueOf(record[1]));
            }else if (s.contains("[")&&s.contains("]")){
                Pattern pattern = Pattern.compile("(^\\w)|(?<=\\[)\\S+(?=\\])");
                Matcher m= pattern.matcher(s);
                List<String> List = new ArrayList<String>();
                while(m.find()){
                    List.add(m.group());
                }
                count = re.containsKey(List.get(0)) ? re.get(List.get(0)) : 0;
                re.put(List.get(0), count + Integer.valueOf(List.get(1)));
            }else if (s.contains(":")) {
                String[] record = s.split(":");
               // System.out.println("key:"+s+"value:"+re.get(s));
                count = re.containsKey(record[0]) ? re.get(record[0]) : 0;
                re.put(record[0], count + Integer.valueOf(record[1]));
            }else {
                count = re.containsKey(s) ? re.get(s) : 0;
                re.put(s, count + 1);
            }
        }
        return re;
    }
}
