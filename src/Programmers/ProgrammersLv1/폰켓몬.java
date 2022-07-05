package Programmers.ProgrammersLv1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

public class 폰켓몬 {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }


        if(set.size()> nums.length/2){
            return nums.length/2;
        }
        return set.size();
    }

    public static void main(String[] args) {
        폰켓몬 s = new 폰켓몬();
        System.out.println(s.solution(new int[]{3,3,3,2,2,2}));
    }
}
