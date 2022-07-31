package BackJoonAlgorithm.AlgorithmStudy.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class 리모컨_1107_ver2 {



    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();



        boolean[] broken = new boolean[10];
        for (int i = 0; i < m; i++) {
            broken[sc.nextInt()]=true;
        }


        int result = Math.abs(n-100);



        for (int i = 0; i <= 1000001; i++) {
            String s = String.valueOf(i);
            boolean isbroken = false;
            for (int j = 0; j < s.length(); j++) {
                int numericValue = Character.getNumericValue(s.charAt(j));
                if(broken[numericValue]){
                    isbroken = true;
              break;
                }
            }
            if(!isbroken){
                int min = Math.abs(n-i)+s.length();
                result = Math.min(min,result);
            }
        }


        System.out.println(result);



    }
}
