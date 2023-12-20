import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int x = numberOne ;
        int number2 = scanner.nextInt();
        int y = number2 ;


        int q = numberOne % 10 ;
        numberOne /= 10 ;
        int w = numberOne % 10;
        numberOne /= 10 ;
        int r = numberOne % 10;


        int t = number2 % 10 ;
        number2 /= 10 ;
        int j = number2 % 10;
        number2 /= 10 ;
        int u = number2 % 10;

        String name1 = q +""+w +""+ r ; 
        String name = t+""+j+""+u ;

        int b = Integer.parseInt(name);
        int a = Integer.parseInt(name1);

        if (a <  b ){
            System.out.println(x + " < " + y);
        }else if (a  == b ){
            System.out.println(x + " = " + y);
        }else {
            System.out.println(y + " < " + x);
        }
    }
}