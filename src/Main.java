import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner in=new Scanner(System.in);
        String line1 = in.next();
        char line2 = in.next().charAt(0);
        int count = 0 ;
        for(int i = 0; i<line1.length(); i++){
            if(Character.toUpperCase(line1.charAt(i))==line2||Character.toLowerCase(line1.charAt(i))==line2){
                count++;
            }


        }
        System.out.println(count);



    }

}


