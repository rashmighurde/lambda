package testclasses;

import org.testng.annotations.Test;

 interface calculator
{
    int subtract(int i1,int i2);//by default methods in interface are public & abstract
}
public class PracticeForlambda {
    public static void main(String[] args) {

        calculator cl = (i1, i2) ->
        {
            if (i1 < i2) {
                throw new RuntimeException("inappropriate values");
            } else {
                return i2 - i1;
            }
        };
        System.out.println(cl.subtract(30, 20));
    }
}
