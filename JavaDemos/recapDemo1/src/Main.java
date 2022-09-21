public class Main {

    public static void main(String[] args) {
        int sayi1 = 22;
        int sayi2 = 25;
        int sayi3 = 5;
        int buyuk = sayi1;

        if (buyuk <sayi2){

        buyuk = sayi2;

        }
        else if (buyuk < sayi3){
            buyuk = sayi3;

        }

        System.out.println("En büyük = " + buyuk);

    }
}
