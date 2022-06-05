package ProgrammersLv1;

import java.util.Arrays;

public class 로또의최고순위와최저순위 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        int zerocount,count,rank,maxrank;
        zerocount=count=rank=maxrank=0;

        for (int lotto : lottos) {

            if(lotto==0){
                zerocount++;
                continue;
            }
            for (int win_num : win_nums) {
                if(lotto==win_num){
                    count++;
                }
            }
        }

        rank = count<=1 ? 6 : 7-count;

        maxrank = count>=1 ? rank-zerocount : zerocount==0 ? rank : rank-zerocount+1;


        answer[0]=maxrank;
        answer[1]=rank;


        return answer;
    }

    public static void main(String[] args) {
        로또의최고순위와최저순위 s = new 로또의최고순위와최저순위();

        System.out.println(Arrays.toString(s.solution(new int[]{9,10,11,12,13,14},new int[]{1,2,5,6,7,8})));
        System.out.println(Arrays.toString(s.solution(new int[]{44, 1, 0, 0, 31, 25},new int[]{31, 10, 45, 1, 6, 19})));
        System.out.println(Arrays.toString(s.solution(new int[]{45, 4, 35, 20, 3, 9},new int[]{20, 9, 3, 45, 4, 35})));

    }
}

