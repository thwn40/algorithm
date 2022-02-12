package InfreanAlgorithm;




import java.util.*;






import java.util.*;



public  class infrean0706{
    static Scanner kb = new Scanner(System.in);
    static int n =3;
    static int[] check = new int[n+1];
    public static void dfs(int a) {
        if(a==n+1){
            for (int i = 1; i <= n; i++) {
                if(check[i]==1){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
        else{
            System.out.println("check["+a+"]=1"+"호출");
            check[a]=1;
            System.out.println("dfs"+(a+1)+"호출");
            dfs(a+1);
            System.out.println("check["+a+"]=0"+"호출");
            check[a]=0;
            System.out.println("dfs"+(a+1)+"호출");
            dfs(a+1);
        }




    }

    public static void main(String[] args) {
        dfs(1);







    }

}
