package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

/*
Function<T> = Represents a function that accepts one argument
              and produces a result.
BiFunction<T,U> = Represents a function that accepts two arguments
                  and produces a result.
*/
public class _Function {

    public static void main(String[] args) {
        // Function takes 1 argument and produces one result
        int result = incrementByOne(1);
        System.out.println(result);

        Integer result2 = incrementByOneFunction.apply(1);
        System.out.println(result2);

        int result3 = multiplyByTen.apply(result2);
        System.out.println(result3);

        Function<Integer, Integer> addOneANDMultiplyByTen =
                incrementByOneFunction.andThen(multiplyByTen);
        System.out.println(addOneANDMultiplyByTen.apply(4));

        // Bi-Function takes 2 arguments and produces 1 result
        System.out.println(incrementByOneAndMultiplyFunction.apply(4,100));

    }
    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    static Function<Integer, Integer> multiplyByTen =
            number -> number * 10;

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyFunction =
            (numberToIncrementByOne, numberToMultiply)
                    -> (numberToIncrementByOne + 1) * numberToMultiply;
    static int incrementByOne(int num){
        return num + 1;
    }
}
