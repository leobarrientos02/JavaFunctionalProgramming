package functionalInterface;

import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        int result = incrementByOne(1);
        System.out.println(result);

        Integer result2 = incrementByOneFunction.apply(1);
        System.out.println(result2);
    }

    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;
    static int incrementByOne(int num){
        return num + 1;
    }
}
