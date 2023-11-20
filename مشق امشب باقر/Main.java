import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String [] ir = input.split(" ");
        int a = 0 ;
        for (int i = 0 ; i <= 2 ; i++){
            int b = Integer.parseInt(ir [i]);
            if (b == 0 ){
                System.out.println("No");
                break;
            }
            a+=b;
        } 
        if (a == 180){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}