package InfreanAlgorithm;

import java.util.Scanner;





public  class infrean0207 {
    static Scanner kb = new Scanner(System.in);
    public static void solution(int num) {
        int answer = 0, count=0;
        int[] pr = new int[num];
        for(int i =0; i<num; i++){
            pr[i]=kb.nextInt();
        }

        for(int i = 0; i<num; i++){
            if(pr[i]==0){
                count=0;
            }
            else{
                count++;
            }
            answer+=count;
        }

        System.out.println(answer);
    }

    public static void main(String[] args) {


        int num = kb.nextInt();


        solution(num);

    }
}