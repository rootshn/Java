public class Main {

    public static void main(String[] args) {
        sayiBulmaca();
    }

    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 5, 7, 9};
        int aranacak = 5;


        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;

            }
        }
        //String mesaj="";
        if (varMi) {
            //mesaj = "Sayı mevcuttur" + aranacak;
            mesajVer("Sayi Mevcuttur: " + aranacak);
        } else {
            System.out.println("Sayi mevcut değildir: " + aranacak);
        }
    }

    public static void mesajVer(String mesaj) { //parametreli method denir camel case kullanılır method adlarında
        System.out.println(mesaj);

    }
}
