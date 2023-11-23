import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arr= new ArrayList<>();
        int h = 1 ;
        for (int i = 0 ; h != 0 ; i++){
            String  number = scanner.nextLine();
            arr.add(number);
            if (number.equals("0")){
                h = 0 ;
            }
        }

        for (int i = arr.size()-2 ; i >= 0  ; i--){
            System.out.println(arr.get(i));
        }

        
        
        
    }
}


