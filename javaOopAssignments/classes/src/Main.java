public class Main {

    public static void main(String[] args) {
        //reference type

        CustomerManager customerManager = new CustomerManager(); // -->garbage collector
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;

        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        int sayi1 = 10;
        int sayi2 = 20; // burada stack var ama heap kullanmıyoruz
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);

        int[] sayilar1 = new int[]{1, 2, 3};
        int[] sayilar2 = new int[]{4, 5, 6}; // burada iki hem stack hem heap oluyor
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);
    }
}

