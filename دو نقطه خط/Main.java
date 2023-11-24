import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String number = bufferedReader.readLine();
        String[] sss = number.split(" ");
        if (sss[0].equals(sss[2])){
            System.out.println("Vertical");
        }else if (sss[1].equals(sss[3])){
            System.out.println("Horizontal");
        }else {
            System.out.println("Try again");
        }
    }
}


