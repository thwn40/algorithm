




import java.util.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Math.max;


public  class Main {
    static Scanner kb = new Scanner(System.in);
    public static void solution(String a, String b) {



        HashMap<Character, Integer> map1 = new HashMap();
        HashMap<Character, Integer> map2 = new HashMap();
        for (char x : a.toCharArray()
        ) {
            map1.put(x, map1.getOrDefault(x, 0) + 1);

        }   for (char x : b.toCharArray()
        ) {
            map2.put(x, map2.getOrDefault(x, 0) + 1);

        }

        if(map1.equals(map2)){
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }

    }





    public static void main(String[] args) {

        String a= kb.nextLine();
        String b = kb.nextLine();






        solution(a,b);

    }
}



