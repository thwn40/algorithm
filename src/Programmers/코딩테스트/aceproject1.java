package Programmers.코딩테스트;

public class aceproject1 {

        public int solution(int n, int[] v) {
            int answer = 0;
            int temp = Integer.MAX_VALUE;
            int leftsum=0;
            int rightsum=0;
            int size= 0;
            int cha=0;

            for (int position = 0; position <= n; position++) {

                for (int i = 0; i < n; i++) {
                    if(i<position){
                        leftsum+=v[i];
                        size++;
                    }
                    else{
                        rightsum+=v[i];
                    }

                }
                System.out.print(leftsum+" ");
                System.out.print(rightsum+" ");
                System.out.print(size+" ");
                cha=Math.abs(leftsum-rightsum);
                if(cha<temp){
                    temp=cha;
                    answer=size;
                }
                else{

                }

                System.out.println(temp);
                leftsum=0;
                rightsum=0;
                size=0;

            }

            return answer;

        }

        public static void main(String[] args) {
           aceproject1 s = new aceproject1();
            System.out.println( s.solution(5, new int[]{1, 2, 1, 2, 1,}));


        }






    }

