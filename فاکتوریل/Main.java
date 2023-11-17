 
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();



        if (input <= 10 && input>= 1){

            int fuck = 1 ;

            for (int i = 1; i <= input ; i++){

                fuck *=i;

            }

            System.out.println(fuck);

        }

    }

}
