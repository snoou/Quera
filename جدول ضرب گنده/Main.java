import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        
        if (number <= 100 && number >= 1) {
            StringBuilder output = new StringBuilder();
            
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    output.append(j * i).append(" ");
                }
                output.append("\n");
            }
            
            System.out.println(output.toString());
        }
    }
}

