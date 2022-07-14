package finalSection;

import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {

    public static void main(String[] args) {
        Function<String, String> printName = String::toUpperCase;

        // If you need to perform some extra logic
        Function<String, String> printName2 = name -> {
            // logic
            if(name.isBlank()){
                System.out.println("No name provided");
            }
            return name.toUpperCase();
        };

        BiFunction<String, Integer, String> printName3 = (name, age) -> {
            // logic
            if(name.isBlank()){
                System.out.println("No name provided");
            }
            System.out.println(age);
            return name.toUpperCase();
        };

        System.out.println(printName3.apply("Leonel", 24));
    }
}
