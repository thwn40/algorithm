package InfreanAlgorithm;







import java.util.*;




public  class infrean0404 {
    static Scanner kb = new Scanner(System.in);
    public static void solution(String a, String b) {
        int w = b.length();


        HashMap<Character,Integer> ans = new HashMap<Character,Integer>();
        for (int i = 0; i < w; i++) {
            ans.put(b.charAt(i), ans.getOrDefault(b.charAt(i),0)+1);
        }
        HashMap<Character,Integer> pro = new HashMap<Character,Integer>();

        for (int i = 0; i < w; i++) {
            pro.put(a.charAt(i),pro.getOrDefault(a.charAt(i),0)+1);
        }
        int count=0;

        if (ans.equals(pro)){
            count++;
        }

        for (int i = 0; i < a.length()-w; i++) {
            pro.put(a.charAt(i+w),pro.getOrDefault(a.charAt(i+w),0)+1);
            pro.put(a.charAt(i),pro.get(a.charAt(i))-1);
            if(pro.get(a.charAt(i))==0) {
                pro.remove(a.charAt(i));
            }


            if (ans.equals(pro)){
                count++;
            }


        }

        System.out.println(count);

    }





    public static void main(String[] args) {

        String a = kb.nextLine();
        String b = kb.nextLine();





        solution(a,b);

    }
}


