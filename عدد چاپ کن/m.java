import java.util.Arrays;
import java.util.Scanner;

public class m {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        String[] split = number.split("");
       
        for (int j = 0 ; j <split.length ;j++){
            System.out.print(split[j] + ": ");
            for (int i = 0 ; i <Integer.parseInt(split[j]); i++){
                System.out.print(split[j]);
            }
            System.out.println();
        }
    }
}
