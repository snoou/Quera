import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > 0 && b > 0 && c > 0 ){
            if (a*a + b*b == c * c  ){
                System.out.println("YES");
            }else if (a * a + c * c == b* b ){
                System.out.println("YES");
            }else if (b*b + c * c == a * a ){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
        
        
    }
}