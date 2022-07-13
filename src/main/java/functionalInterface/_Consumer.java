package functionalInterface;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        // Normal Java Function
        greetCustomer(new Customer("Leonel Barrientos", "516-960-8086"));

        // Consumer functional interface
        greetCustomerConsumer.accept(new Customer("Jose Barrientos", "911"));
    }

    // Consumer Functional Interface
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " + customer.customerPhone);

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
