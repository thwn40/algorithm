package InfreanAlgorithm;





import java.util.Scanner;


public class infrean0112 {
    public static void solution(int num, String str) {
        String answer = "";
        str =str.replace('#','1');
        str =str.replace('*','0');

        for(int i = 1; i<str.length(); i++){
            if(i%7==6){
                System.out.print((char)(Integer.parseInt(str.substring(i-6,i+1),2)));
//                System.out.print(Character.toChars(Integer.parseInt(str.substring(i-6,i+1))));

            }
        }




    }


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();

        kb.nextLine();
        String a = kb.nextLine();

        solution(num,a);



    }
}

