package evaluation26sep.prob4;

import java.util.*;

public class Plants {
    public static void main(String[] args) {
        Map<String,Integer> plantsobj=new HashMap<>();
        plantsobj.put("cactus",200);
        plantsobj.put("Tulsi",180);
        plantsobj.put("Ashwagandha",150);
        plantsobj.put("Cotton",360);
        plantsobj.put("Elaichi",540);

        plantsobj.forEach((k,v)-> System.out.println(k+" "+v));
    }

}
