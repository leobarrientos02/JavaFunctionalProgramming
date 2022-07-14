package combinatorPattern;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Leonel",
                "leo@gmail.com",
                "+05169608086",
                LocalDate.of(1997,12,18)
        );

        System.out.println(new CustomerValidationService().isValid(customer));
        System.out.println(customer.findAge());

        // If valid We can store customer in db
    }
}
