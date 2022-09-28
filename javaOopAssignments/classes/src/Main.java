public class Main {

    public static void main(String[] args) {
        //reference type

            CustomerManager customerManager = new CustomerManager(); // -->garbage collector
            CustomerManager customerManager2 = new CustomerManager();
            customerManager=customerManager2;

            customerManager.Add();
            customerManager.Remove();
            customerManager.Update();


    }
}
