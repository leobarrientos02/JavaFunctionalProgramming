package finalSection;

import java.util.function.Consumer;

public class Callbacks {
    public static void main(String[] args) {
        // Callback
        hello("Leonel", "Barrientos", null);

        hello("Jose", "Barrientos", value -> {
            System.out.println("no lastname provided for " + value);
        });

        hello("Jose", null, value -> {
            System.out.println("no lastname provided for " + value);
        });

        hello2("Jose", null, () -> {
            System.out.println("no lastname provided");
        });
    }

    // Callback function
    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if (lastName != null){
            System.out.println(lastName);
        } else {
          callback.accept(firstName);
        }
    }

    static void hello2(String firstName, String lastName, Runnable callback) {
        System.out.println(firstName);
        if (lastName != null){
            System.out.println(lastName);
        } else {
            callback.run();
        }
    }

    /* JavaScript
    function helloWorld(firstName, lastname, callback) {
        console.log(firstName);
        if(lastName){
            console.log(lastName);
        }else{
            callback();
        }
    }
    */
}
