package Programmers.ProgrammersLv1;

import java.util.ArrayList;
import java.util.Arrays;

public class 비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        ArrayList<String> decryArr1 = new ArrayList<>();
        ArrayList<String> decryArr2 = new ArrayList<>();
        ArrayList<String> Zerofill = new ArrayList<>();
        StringBuffer s = new StringBuffer();
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            s.append("0");
            Zerofill.add(String.valueOf(s));
        }
        for (int i = 0; i < n; i++) {
            StringBuffer a = new StringBuffer();
            StringBuffer b = new StringBuffer();

            a.append(Integer.toString(arr1[i],2));
            b.append(Integer.toString(arr2[i],2));
            if(a.length()<n){
              a.insert(0,Zerofill.get(n-a.length()-1));

              decryArr1.add(a.toString());
            }
            else{
                decryArr1.add(a.toString());
            }
            if(b.length()<n){
              b.insert(0,Zerofill.get(n-b.length()-1));

              decryArr2.add(b.toString());
            }
            else{
                decryArr2.add(b.toString());
            }
            StringBuffer ab= new StringBuffer();
            for (int j = 0; j < n; j++) {

                char aIndex = a.charAt(j);
                char bIndex = b.charAt(j);

                if(aIndex=='0'&&bIndex=='0'){
                    ab.append(' ');
                }
                else{
                    ab.append('#');
                }
            }

            answer[i]=ab.toString();
        }




        return answer;
    }

    public static void main(String[] args) {
        비밀지도 s= new 비밀지도();
        s.solution(5, new int[]{9,20,28,18,11},new int[]{30,1,21,17,28});
    }
}
