package InfreanAlgorithm;






import java.util.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Math.max;


public  class infrean0401 {
    static Scanner kb = new Scanner(System.in);
    public static void solution(int n1) {

        int[] arr1 = new int[n1];
        kb.nextLine();
        String g = kb.nextLine();
        HashMap<Character,Integer> map=new HashMap();
        for (char x:g.toCharArray()
        ) {
            map.put(x,map.getOrDefault(x,0)+1);

        }
        for (char x :
                map.keySet()) {
            System.out.println(x+" "+map.get(x));

        }


        for (int i = 0; i < n1; i++) {
            if(g.charAt(i)=='A'){
                arr1[0]++;

            }
            else if(g.charAt(i)=='B'){
                arr1[1]++;

            }
            else if(g.charAt(i)=='C'){
                arr1[2]++;

            }
            else if(g.charAt(i)=='D'){
                arr1[3]++;

            }
            else if(g.charAt(i)=='E'){
                arr1[4]++;

            }


        }
        int temp = 0;
        int answer = 0;
        for (int i = 0; i < 5; i++) {
            if(temp<arr1[i]){
                answer=i;
                temp=arr1[i];
            }

        }

        System.out.println((char)(65+answer));

    }





    public static void main(String[] args) {

        int n1 = kb.nextInt();








        solution(n1);

    }
}



