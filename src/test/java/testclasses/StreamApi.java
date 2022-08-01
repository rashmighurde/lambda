package testclasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamApi {
    public static void main(String args[])
    {
        List<String> list=new ArrayList();
        list.add("rashmi");
        list.add("ghurde");
        list.add("abc");

        for(String k:list)
        {
            System.out.println(k);
        }
        list.stream().forEach(t-> System.out.println(t));



        Map<Integer,String> map=new HashMap();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.forEach((key, value)-> System.out.println(key+""+value));

        for(String s:list)
        {
            if(s.startsWith("m"))
            {
                System.out.println(s);
            }
        }

        list.stream().filter(t->t.startwith("m")).forEach(t->System.out.println(t));














    }
}
