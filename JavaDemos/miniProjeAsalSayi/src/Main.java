public class Main {

    public static void main(String[] args) {
        int number = 1;
       /* int remainder = number % 2;
        System.out.println(remainder);*/

        if(number ==2 ){
            System.out.println("The number is Prime");
            return;
        }
        else if(number <2){
            System.out.println("Invalid Value!");
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println(" is not Prime");
                break;
            } else if (number / i == 1) {
                System.out.println("The number is Prime");
                break;
            }

            else {
                continue;
            }
        }

    }


}



