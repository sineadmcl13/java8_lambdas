package built_in_functional_interfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ImplementingConsumerAndBiConsumer {

    public static void main(String[] args){
        implementingConsumer();
        implementingBiConsumer();
    }

    private static void implementingConsumer(){
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);

        c1.accept("Annie");
        c2.accept("Annie");
    }


    private static void implementingBiConsumer(){

        Map<String, Integer> map = new HashMap<>();
        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);


        b1.accept("chicken", 7);
        b2.accept("chick", 1);

        System.out.println(map);

    }
}
