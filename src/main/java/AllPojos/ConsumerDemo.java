package AllPojos;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ConsumerDemo {
    public static void main(String[] args) {

        //consumer--accept
        //supplier--get
        //predicate--test
        Consumer<Integer> consumer = (t) ->
        {
            System.out.println("printing:" + t);
        };
        consumer.accept(10);


        Supplier<Integer> supplier = () ->
        {
          return 100;
        };
        System.out.println(supplier.get());


        Predicate<Integer> predicate = (t) ->     //conditional check
        {
            if (t > 10) {
                return true;
            }
             else{
            return false;
                 }

        };
        System.out.println(predicate.test(20));

    }
}

