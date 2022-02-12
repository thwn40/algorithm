package InfreanAlgorithm;

import java.util.Scanner;
import java.util.Stack;


    public  class infrean0503 {
        static Scanner kb = new Scanner(System.in);
        public static void solution(int a,int b, int[][] rotate, int[] moves) {
            Stack<Integer> stack = new Stack<>();
            stack.push(0);
            int answer = 0;
            for (int i = 0; i < b; i++) {

                for (int j = a-1; j >= 0; j--) {

                    if(rotate[moves[i]][j]!=0){

                        if (stack.peek()==rotate[moves[i]][j]){
                            stack.pop();
                            answer++;
                        }
                        else{
                            stack.push(rotate[moves[i]][j]);
                        }

                        rotate[moves[i]][j]=0;
                        break;

                    }
                }
            }


            System.out.println( answer*2);





        }



        public static void main(String[] args) {
            int a= kb.nextInt();

            int[][] board = new int[a][a];
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    board[i][j]=kb.nextInt();
                }
            }
            int[][] rotate = new int[a][a];
            for (int i = 0; i < rotate.length; i++) {
                for (int j = 0; j < rotate[i].length; j++) {
                    rotate[i][j] = board[board.length-1-j][i];
                }
            }

            int b = kb.nextInt();
            int[] moves = new int[b];
            for (int i = 0; i < b; i++) {
                moves[i]=kb.nextInt()-1;
            }


            solution(a,b,rotate,moves);

        }
    }





