import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)  {
        try { 
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            int number = Integer.parseInt(input.readLine());
            if(number % 2 == 0){
                System.out.println("Bala Barare");
            }else {
                System.out.println("Payin Barare");
            }




    }catch (IOException g ){
        System.out.println("   ");
    }
       
        
    }
}

