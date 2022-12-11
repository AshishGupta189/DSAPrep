package day17;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class prob1 {
    public static void main(String[] args) {
        Map<String ,String> stateCapital=new HashMap<>();
        stateCapital.put("UP","Lucknow");
        stateCapital.put("MP","Indore");
        stateCapital.put("Manipur","Imphal");
        stateCapital.put("Jammu","Srinagar");
        stateCapital.put("Assam","Dispur");

        stateCapital.forEach((k,v)-> System.out.println(k+" "+v));
    }

}
