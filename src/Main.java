


import InfreanAlgorithm.infrean0803;

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

        infrean0803 T = new infrean0803();
String[] id={"muzi", "frodo", "apeach", "neo"};
        String[] report={"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};

        System.out.println(T.solution(id,report,2));


        }
    }
