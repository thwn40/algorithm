package Programmers.ProgrammersLv1;

import java.util.*;

public class 크레인인형뽑기게임 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        ArrayList<Stack<Integer>> stack = new ArrayList<>();
        Stack<Integer> bucket = new Stack();
        bucket.add(141);



        for (int i = 0; i < board.length; i++) {
            Stack tempStack = new Stack();
            stack.add(tempStack);
            for (int j =  board[i].length-1; j >=0; j--) {
                if(board[j][i]!=0){
                    stack.get(i).add(board[j][i]);
                }


            }

        }
        Integer peek = bucket.peek();
        Integer push = null;
        for (int move : moves) {
            if(!bucket.isEmpty()) {
                peek = bucket.peek();
                push = null;
                // 뽑기
                if (!stack.get(move - 1).isEmpty()) {
                    push = stack.get(move - 1).pop();
                }
                else{
                    continue;
                }


                if (push.equals(peek)) {
                    bucket.pop();
                    answer+=2;
                }
                else{
                    bucket.push(push);
                }


            }
        }




        return answer;
       
        
    }

    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        크레인인형뽑기게임 s = new 크레인인형뽑기게임();
        s.solution(board,moves);
    }
}
