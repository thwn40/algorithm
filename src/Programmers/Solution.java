package Programmers;

import java.util.HashSet;

public class Solution {
    public int solution(int p) {
        int answer = p;




        for (int i = p+1; i <= 10000; i++) {
            if(isBeauty(i)){
                answer=i;
                break;
            }

        }

        return answer;
    }

    private boolean isBeauty(int p) {
        HashSet<Character> set = new HashSet();
        String changeString = String.valueOf(p);
        for (int i = 0; i < 4; i++) {
            set.add(changeString.charAt(i));
        }

        if(set.size()<4){
            return false;
        }
        else{
            return true;
        }
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        for (int i = 1000; i <= 10000; i++) {
            System.out.println("p : "+i+ "answer : "+s.solution(i));
        }

    }

}