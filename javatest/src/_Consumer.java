import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        Customer cust1= new Customer("Papai", "400");
       // greetCustomer(cust1);
        //greetConsumerCustomer.accept(new Customer("Papai12", "400"));
        multiplyTwoNum.accept(5,10);
    }
    static void greetCustomer(Customer customer){
        System.out.println(customer.custName + " , " + customer.custNo);
    }
    static BiConsumer<Integer,Integer> multiplyTwoNum= (num1,num2)-> System.out.println(num1*num2);
    static Consumer<Customer> greetConsumerCustomer= customer -> {
        System.out.println(customer.custName + " , " + customer.custNo);
        System.out.println("Customer Name1 " +  customer.custName + " , " + customer.custNo);
        System.out.println("Customer Name2 " +  customer.custName + " , " + customer.custNo);
    };

    static class Customer {
        public Customer(String custName, String custNo) {
            this.custName = custName;
            this.custNo = custNo;
        }

        public String custName;
        public String custNo;


    }

}
