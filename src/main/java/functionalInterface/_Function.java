package functionalInterface;

import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        int result = incrementByOne(1);
        System.out.println(result);

        Integer result2 = incrementByOneFunction.apply(1);
        System.out.println(result2);

        int result3 = multiplyByTen.apply(result2);
        System.out.println(result3);

        Function<Integer, Integer> addOneANDMultiplyByTen =
                incrementByOneFunction.andThen(multiplyByTen);
        System.out.println(addOneANDMultiplyByTen.apply(4));
    }
    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    static Function<Integer, Integer> multiplyByTen =
            number -> number * 10;
    static int incrementByOne(int num){
        return num + 1;
    }
}
