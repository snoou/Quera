import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        if (input <= 6000 && input>-273){

            if (input > 100){

                System.out.println("Steam");

            }else if (input < 0){

                System.out.println("Ice");

            }else {

                System.out.println("Water");

            }

        }

    }

}
