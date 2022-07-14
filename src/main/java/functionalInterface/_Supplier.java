package functionalInterface;

import java.util.function.Supplier;

/*
Supplier<T> = Represents a supplier of results.
*/
public class _Supplier {

    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());

        // Using Supplier
        System.out.println(getDBConnectionUrlSupplier.get());
    }

    static String getDBConnectionUrl(){
        return "jdbc://localhost:8080/users";
    }

    static Supplier<String> getDBConnectionUrlSupplier = ()
            -> "jdbc://localhost:8080/users";
}
