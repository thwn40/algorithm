package InfreanAlgorithm;



import java.util.*;



public  class infrean0605 {
    static Scanner kb = new Scanner(System.in);
    public static void solution(int n) {
        int[] arr1 = new int[n];
        Set<Integer> arr = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            int temp =kb.nextInt();
            arr.add(temp);
            arr1[i]=temp;
        }




        if(arr.size()== arr1.length){
            System.out.println("U");
        }
        else{
            System.out.println("D");
        }


    }




    public static void main(String[] args) {
        int a = kb.nextInt();



        solution(a);





    }

}


