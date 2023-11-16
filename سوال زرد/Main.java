import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();


        System.out.print("W");

        for (int i = 1; i <= input ; i++)

            System.out.print("o" );

        System.out.print("w");

        System.out.print("!");

    }

}
