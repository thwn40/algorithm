import java.util.*;

class Solution {



    public String makeMarginalString(String str) {
        // TODO:
        String answer = "";5754654654
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= i; j++) {
                answer+=str.charAt(j);
            }
                           }
        return answer;
    }





    public static void main(String[] args) {
        Solution main = new Solution();
        System.out.println(main.makeMarginalString("flower"));





        }
    }
