public class Main {

    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        String yenimesaj = mesaj.replace(' ', '-');// metnin içinde bir karakteri değiştirmek için kullanılır.
        System.out.println(yenimesaj);

        System.out.println(mesaj.substring(2));// mesajın kaçıncı indexten itibaren alınacağını gösterir. (2,5)--> gün

        for(String kelime: mesaj.split(" ")){
            System.out.println(kelime);
        }


    }
}
