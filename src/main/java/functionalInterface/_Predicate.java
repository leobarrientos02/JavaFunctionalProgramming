package functionalInterface;

import java.util.function.Predicate;

/*
Predicate<T> = represents a predicate (boolean-valued function) of one argument
*/
public class _Predicate {

    public static void main(String[] args) {
        System.out.println("Normal Function");
        System.out.println(isPhoneNumberValid("09009877300"));
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("0700000000"));

        // Predicate
        System.out.println("With Predicate");
        System.out.println(isPhoneNumberValidPredicate.test("09009877300"));
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("0700000000"));

        // Chaining Predicate
        System.out.println(
                "Is phone number valid and contains the number 3 = " +
                isPhoneNumberValidPredicate.and(containNumber3).test("07000000000")
        );
        System.out.println(
                "Is phone number valid and contains the number 3 = " +
                        isPhoneNumberValidPredicate.and(containNumber3).test("07000000003")
        );
        System.out.println(
                "Is phone number valid and contains the number 3 = " +
                        isPhoneNumberValidPredicate.or(containNumber3).test("07000000000")
        );
    }

    static Predicate<String> isPhoneNumberValidPredicate = phone ->
            phone.startsWith("07") && phone.length() == 11;

    static boolean isPhoneNumberValid(String phone){
        return phone.startsWith("07") && phone.length() == 11;
    }

    static Predicate<String> containNumber3 = phone ->
            phone.contains("3");
}
