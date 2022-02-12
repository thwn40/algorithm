package InfreanAlgorithm;

import java.util.Scanner;


public class infrean0110 {
    public static void solution(String str, char str2) {


        for (int i = 0; i < str.length(); i++) {
            int fwd = 0;
            int back = 0;
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(j) == str2) {
                    break;
                } else {
                    fwd++;
                }
            }
            for (int j = i; j >= 0; j--) {
                if (str.charAt(j) == str2) {
                    break;
                } else {
                    back++;
                }
            }

            if(i==0){
                System.out.print(fwd+" ");
            }
            else if(i==str.length()-1){
                System.out.print(back+" ");
            }
            else{
                if (fwd > back) {
                    System.out.print(back+" ");
                } else {
                    System.out.print(fwd+" ");
                }
            }

        }
    }


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);


        String a = kb.next();
        char b = kb.next().charAt(0);
//        System.out.println(a.split(" ")[0]);
        solution(a,b);


    }
}

//class Main {
//    public int[] solution(String s, char t){
//        int[] answer=new int[s.length()];
//        int p=1000;
//        for(int i=0; i<s.length(); i++){
//            if(s.charAt(i)==t){
//                p=0;
//                answer[i]=p;
//            }
//            else{
//                p++;
//                answer[i]=p;
//            }
//        }
//        p=1000;
//        for(int i=s.length()-1; i>=0; i--){
//            if(s.charAt(i)==t) p=0;
//            else{
//                p++;
//                answer[i]=Math.min(answer[i], p);
//            }
//        }
//        return answer;
//    }
//
//    public static void main(String[] args){
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//        String str=kb.next();
//        char c=kb.next().charAt(0);
//        for(int x : T.solution(str, c)){
//            System.out.print(x+" ");
//        }
//    }
//}
