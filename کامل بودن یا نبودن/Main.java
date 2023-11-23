import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 1 ;
        for (int i = 2; i < number/2 + 1 ; i++){
            if (number%i == 0){
                sum+=number/i ;
            }
        }
        if (sum == number){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}


