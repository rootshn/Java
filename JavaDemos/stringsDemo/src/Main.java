public class Main {

    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);


        System.out.println("Eleman sayısı: " + mesaj.length());
        System.out.println("5. eleman" + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın yav!"));
        System.out.println(mesaj.startsWith("B")); // "char ne ise " ile başlıyor mu
        System.out.println(mesaj.endsWith("l")); //"char ne ise 'l' örn" ile bitiyor mu?

        char[] karakterler = new char[5];
        mesaj.getChars(0,5, karakterler,0);
        System.out.println(karakterler);

        System.out.println(mesaj.indexOf('a')); // a yerine "av" var mı diye de aratabiliriz baştan aramaya başlar
        System.out.println(mesaj.lastIndexOf('a')); //aramaya sağdan başlıyor!

    }
}
