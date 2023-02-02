package BackJoonAlgorithm.AlgorithmStudy.week1to20.week14;

import java.util.*;

public class 프렌즈4블록 {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        block[][] boardArr = new block[m][n];
        for (int i = 0; i < boardArr.length; i++) {
            for (int j = 0; j < boardArr[i].length; j++) {
                boardArr[i][j] = new block(board[i].charAt(j), false);

            }
        }
        boolean keepGoing = true;
    while(keepGoing){
        keepGoing=false;

        for (int i = 0; i < boardArr.length - 1; i++) {
            for (int j = 0; j < boardArr[i].length - 1; j++) {
                if(!boardArr[i][j].isMarked&&!boardArr[i][j + 1].isMarked&&!boardArr[i + 1][j + 1].isMarked&&!boardArr[i + 1][j].isMarked){

                }

                if (boardArr[i][j].equals(boardArr[i][j + 1]) && boardArr[i][j].equals(boardArr[i + 1][j + 1]) && boardArr[i][j].equals(boardArr[i + 1][j])) {
                    boardArr[i][j].marking();
                    boardArr[i][j + 1].marking();
                    boardArr[i + 1][j + 1].marking();
                    boardArr[i + 1][j].marking();
                keepGoing=true;
                }

                }

            }

        for (block[] chars : boardArr) {
            System.out.println(Arrays.toString(chars));
        }
        System.out.println();
        for (int i = boardArr.length-1; i > 0; i--) {
            for (int j = boardArr.length-1; j >= 0; j--) {
                int idx = i;
                while(true){

                    if(idx==m){
                        break;
                    }
                    for (block[] chars : boardArr) {
                        System.out.println(Arrays.toString(chars));
                    }
                    System.out.println();
                    if (!boardArr[idx -1][j].isMarked()&&boardArr[idx][j].isMarked()) {
                        block temp =boardArr[idx][j];
                        boardArr[idx][j]=boardArr[idx-1][j];
                        boardArr[idx-1][j]=temp;
                    }
                    else{
                        break;
                    }
                    idx++;

                }

            }
        }

        for (block[] chars : boardArr) {
            System.out.println(Arrays.toString(chars));
        }
        System.out.println();
        }






        return answer;


    }

    static class block {
        private char name;
        private boolean isMarked;

        public boolean isMarked() {
            return isMarked;
        }

        public block(char name, boolean isMarked) {
            this.name = name;
            this.isMarked = isMarked;
        }

        @Override
        public String toString() {
            return
                    name + " " +
                            isMarked
                    ;
        }

        public void marking() {
            this.isMarked = true;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            block block = (block) o;
            return name == block.name;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, isMarked);
        }
    }

    public static void main(String[] args) {
        프렌즈4블록 s = new 프렌즈4블록();
        s.solution(4, 5, new String[]{"CCBDE", "AAADE", "AAABF", "CCBBF"});
    }
}
