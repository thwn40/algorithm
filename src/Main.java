


import java.util.*;

import java.util.*;

class Main {
    static Scanner kb = new Scanner(System.in);
    static int sum = 0;
    static int n =kb.nextInt();
    static int m =kb.nextInt();
    static int maxscore = 0;
    boolean flag =false;
        public void dfs(int a,int score,int time,ArrayList<ArrayList<Integer>> arr) {

            if(m<time) return;
            if(a==n){
                if(m>=time){

                    maxscore=Math.max(maxscore,score);
                }
            }

            else{
                dfs(a+1,score+arr.get(a).get(0),time+arr.get(a).get(1),arr);
                dfs(a+1,score,time,arr);
            }

        }



    public static void main(String[] args){

        Main T = new Main();

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<Integer>());
            for (int j = 0; j < 2; j++) {
                arr.get(i).add(kb.nextInt());
            }


        }

        T.dfs(0,sum,0,arr);
        System.out.println(maxscore);


        }
    }
