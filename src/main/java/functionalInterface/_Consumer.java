package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/*
Consumer<T> = Represents an operation that accepts a single input argument
              and returns no result.
BiConsumer<T,U> = Represents an operations that accepts two input arguments
                  and returns no result.
*/
public class _Consumer {
    public static void main(String[] args) {

        Customer leo = new Customer("Leonel Barrientos", "516-960-8086");
        Customer jose = new Customer("Jose Barrientos", "911");
        // Normal Java Function
        greetCustomer(leo);

        // Consumer functional interface
        greetCustomerConsumer.accept(jose);

        // BiConsumer functional interface
        greetCustomerConsumerV2.accept(leo, true);
        greetCustomerConsumerV2.accept(jose, false);
    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName +
                    ", thanks for registering phone number "
                    + (showPhoneNumber ? customer.customerPhone : "*********"));

    // Consumer Functional Interface
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName +
                    ", thanks for registering phone number " +
                    customer.customerPhone);

    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " + customer.customerPhone);
    }

    static class Customer{
        private final String customerName;
        private final String customerPhone;

        Customer(String customerName, String customerPhone) {
            this.customerName = customerName;
            this.customerPhone = customerPhone;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "customerName='" + customerName + '\'' +
                    ", customerPhone='" + customerPhone + '\'' +
                    '}';
        }
    }
}
