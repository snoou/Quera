import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        if (number <= Math.pow(10, 18)){
        
        Long result = convertToSingleDigit(number);
        
        System.out.println(result);
        }
    }
    
    public static long convertToSingleDigit(Long number) {
        if (number < 10) {
            return (Long) number;
        } else {
            Long sum = 0l;
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
            return convertToSingleDigit(sum);
        }
    }
}
