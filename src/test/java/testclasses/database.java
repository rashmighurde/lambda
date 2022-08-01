package testclasses;

import java.util.ArrayList;

public class database {
    public static List<Employee> getEmployees()
    {
        List<Employee> list=new ArrayList();
        list.add(new Employee(176,"roshan","it",600000));
        list.add(new Employee(388,"vikas","civil",800000));
        list.add(new Employee(470,"bimal","difence",500000));
        list.add(new Employee(624,"abc","core",400000));
        list.add(new Employee(136,"saurav","special",1200000));
     return list;
    }
}
