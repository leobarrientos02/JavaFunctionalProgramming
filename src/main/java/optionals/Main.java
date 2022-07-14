package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Object value = Optional.ofNullable(null)
                .orElseGet(() -> "default value");
        System.out.println(value);

        Object value2 = Optional.ofNullable("Hello")
                .orElseThrow(() -> new IllegalStateException("Exception"));
        System.out.println(value2);

        Optional.ofNullable("leo@gmail.com")
                .ifPresent(email -> System.out.println("Sending email to " + email));

        Optional.ofNullable(null)
                .ifPresentOrElse(
                        email -> System.out.println("Send email to " + email),
                        () -> System.out.println("Cannot send email"));
    }
}
