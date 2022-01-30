package InfreanAlgorithm;

import java.util.*;




public  class infrean0503 {
    static Scanner kb = new Scanner(System.in);
    public static void solution(int a) {
        Stack<Integer> stack = new Stack<>();
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
//        System.out.println(Arrays.deepToString(rotate));


        int answer = 0;
        int b = kb.nextInt();
        int[] moves = new int[b];
        for (int i = 0; i < b; i++) {
            moves[i]=kb.nextInt()-1;
        }
        stack.push(0);
        for (int i = 0; i < b; i++) {
//            System.out.println("moves = " + moves[i]);

            for (int j = a-1; j >= 0; j--) {

                if(rotate[moves[i]][j]!=0){
//                        System.out.println(rotate[0][j]);
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
//
//            else if(moves[i]==1){
//                for (int j = a-1; j >= 0; j--) {
//                    if(rotate[1][j]!=0){
////                        System.out.println(rotate[1][j]);
//                        if (stack.peek()==rotate[1][j]){
//                            stack.pop();
//                            answer++;
//                        }
//                        else{
//                            stack.push(rotate[1][j]);
//                        }
//                        rotate[1][j]=0;
//                        break;
//
//                    }
//                }
//            }
//            else if(moves[i]==2){
//                for (int j = a-1; j >= 0; j--) {
//                    if(rotate[2][j]!=0){
////                        System.out.println(rotate[2][j]);
//                        if (stack.peek()==rotate[2][j]){
//                            stack.pop();
//                            answer++;
//                        }
//                        else{
//                            stack.push(rotate[2][j]);
//                        }
//                        rotate[2][j]=0;
//                        break;
//                    }
//                }
//            }
//            else if(moves[i]==3){
//                for (int j = a-1; j >= 0; j--) {
//                    if(rotate[3][j]!=0){
////                        System.out.println(rotate[3][j]);
//                        if (stack.peek()==rotate[3][j]){
//                            stack.pop();
//                            answer++;
//                        }
//                        else{
//                            stack.push(rotate[3][j]);
//                        }
//                        rotate[3][j]=0;
//                        break;
//                    }
//                }
//            }
//            else{
//                for (int j = a-1; j >= 0; j--) {
//                    if(rotate[4][j]!=0){
////                        System.out.println(rotate[4][j]);
//                        if (stack.peek()==rotate[4][j]){
//                            stack.pop();
//                            answer++;
//                        }
//                        else{
//                            stack.push(rotate[4][j]);
//                        }
//                        rotate[4][j]=0;
//                        break;
//                    }
//                }
//            }


        }


        System.out.println( answer*2);





    }



    public static void main(String[] args) {
        int a= kb.nextInt();


        solution(a);

    }
}