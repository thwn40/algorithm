package InfreanAlgorithm;






import java.util.Arrays;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.max;


public  class infrean0211 {
    static Scanner kb = new Scanner(System.in);
    public static void solution(int num) {
        int[][] arr = new int[num][5];
        for(int i = 0; i<num; i++){
            for(int j = 0; j<5; j++){
                arr[i][j]= kb.nextInt();
            }
        }

        Integer[] ans = new Integer[num];
        boolean[] temp1 = new boolean[num];
        for (int i = 0; i < num; i++) {
            int count=0, temp = 0;
            Arrays.fill(temp1,false);
            for (int j = 0; j < 5; j++) {

                for (int k = 0; k <num; k++) {
                    if(temp1[k]||(i==k&&j==j)){
                    }
                    else{
                        if(arr[i][j]==arr[k][j]){

                            temp1[k]=true;
                            count++;
//                            System.out.println(i+" "+j+" "+k+" "+arr[i][j]+" "+arr[k][j]+" "+ Arrays.toString(temp1));
                        }

                    }


                }
            }
            ans[i]=count;
            count=0;

//            System.out.println(Arrays.toString(temp1));

        }
        List<Integer> ans1 = Arrays.asList(ans);
//        System.out.println(ans1.toString());

        System.out.println(ans1.indexOf(Collections.max(ans1))+1);






    }


    public static void main(String[] args) {

        int num = kb.nextInt();


        solution(num);

    }
}

