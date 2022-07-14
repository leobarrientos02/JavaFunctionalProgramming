package combinatorPattern;

import java.time.LocalDate;
import static combinatorPattern.CustomerRegistrationValidator.*;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Leonel",
                "leo@gmail.com",
                "+05169608086",
                LocalDate.of(2015,12,18)
        );

        System.out.println(new CustomerValidationService().isValid(customer));
        System.out.println(customer.findAge());

        // If valid We can store customer in db

        // Using combinator pattern
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);

        System.out.println(result);
        if(result != ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }
    }
}
