import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)  {
        try { 
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            long number = Long.parseLong(bufferedReader.readLine());
            long pow = 0;
            while (pow < number ){
                for (int i = 1 ; pow<=number ; i++ ){
                    pow = (long) Math.pow(2 ,i);
                }
                System.out.println(pow);
            }
    }catch (IOException g ){
        System.out.println("   ");
    }
       
        
    }
}

