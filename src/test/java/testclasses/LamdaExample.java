package testclasses;
interface arithmetic
{
    int operations(int a, int b);
}
public class LamdaExample {
    public static void main(String args[]) {
        arithmetic add = (a, b) -> (a + b);
        System.out.println("Addition is"+add.operations(10,20));

        arithmetic sub=(a,b)->(a-b);
        System.out.println("substraction is"+sub.operations(20,10));


    }
}
