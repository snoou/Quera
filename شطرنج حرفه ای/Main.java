import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int [] shatrang = {1 , 1 , 2 ,2 ,2 ,8};

       Scanner scanner = new Scanner(System.in);
       for (int i = 0 ; i < 6 ;i++){
         int f = scanner.nextInt();
         shatrang[i] = shatrang[i] - f ;
       }

       for (int f : shatrang){
        System.out.print(f +" ");
       }
    }
}