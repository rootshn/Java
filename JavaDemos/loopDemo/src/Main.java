public class Main {

    public static void main(String[] args) {
        //for
       /* for(int i =1; i<10; i++){
            System.out.println(i);
        }
        System.out.println("Döngü bitti ");*/
        /*
        for(int i=1; i<10; i+=2){
            System.out.println(i);
        }
        System.out.println("Döngü2 bitti." );*/

        // Blok içinde tanımlanan değer sadece o blok için geçerlidir

        //While;

        int i = 1;
        while ( i < 10 ) {
            i++;
            System.out.println(i);
        }

        //i++ yı başa alınca önce arttırıp sonra print etti dikkat edilmesi gerek!

        while ( i < 10 ) {
            System.out.println(i);
            i++;
        }
        System.out.println("While döngüsü bitti!");

        //Do-While
        int j = 1;
        do {
            System.out.println(j);
            j += 2;
        } while ( j < 10 );
        System.out.println("Do-While Döngüsü Bitti!");





    }
}
