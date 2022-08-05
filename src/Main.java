import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

class Solution {

    public ArrayList<String[]> rockPaperScissors(int rounds) {
        // TODO:
        ArrayList<String[]> answer = new ArrayList<>();
        String[] rps = new String[]{"rock", "paper", "scissors"};
        String[] temp = new String[rounds];
        int cnt = 0;
        repetitionPermutation(answer,rounds,cnt,rps,temp);
        return answer;
    }
    void repetitionPermutation(ArrayList<String[]> answer,int rounds, int cnt, String[] rps,String[] temp){
        if(cnt==rounds){
            answer.add(Arrays.copyOf(temp,rounds));

            return;
        }
        for (int i = 0; i < 3; i++) {
           temp[cnt]= rps[i];
            repetitionPermutation(answer,rounds,cnt+1,rps,temp);

        }
    }




    static public ArrayList<Integer[]> newChickenRecipe(int[] stuffArr, int choiceNum) {
        // TODO:
        ArrayList<Integer> newStuff = new ArrayList<>();
        ArrayList<Integer[]> answer = new ArrayList<>();

        for (int i : stuffArr) {
            String s = String.valueOf(i);
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j)=='0'){
                    count++;
                }
            }
            if(count<3){
                newStuff.add(i);
            }
        }
        if(newStuff.isEmpty()||newStuff.size()<choiceNum){
            return null;
        }
        boolean isSelected[] = new boolean[newStuff.size()];
        Integer[] recipe = new Integer[choiceNum];


        Collections.sort(newStuff);
        System.out.println(newStuff);
        int count = 0;
        permutation(count,choiceNum,newStuff,isSelected,recipe,answer);


        return answer;
    }

    static void permutation(int cnt,int choiceNum,ArrayList<Integer> newStuff,boolean[] isSelected,Integer[] recipe,ArrayList<Integer[]> answer)
    {
        if(cnt==choiceNum){
            answer.add(Arrays.copyOf(recipe,choiceNum));
            return;
        }
        for (int i = 0; i < newStuff.size(); i++) {
            if(isSelected[i]) continue;
            recipe[cnt]=newStuff.get(i);
            isSelected[i]=true;
            permutation(cnt+1,choiceNum,newStuff,isSelected,recipe,answer);
            isSelected[i]=false;
        }
    }

    public static int boringBlackjack(int[] cards) {
        // TODO:

        ArrayList<int[]> result = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < cards.length; i++) {
            for(int j = i + 1; j < cards.length; j++) {
                for(int k = j + 1; k < cards.length; k++) {
                    int[] input = new int[]{cards[i]+cards[j]+cards[k]};
                    result.add(input);
                }
            }
        }
//        for (int[] ints : result) {
//            System.out.println(Arrays.toString(ints));
//        }

        for (int[] ints : result) {
            for (int anInt : ints) {
                if(isPrime(anInt))
                    count++;
            }
        }
    return count;
    }

    private static boolean isPrime(int anInt) {
        for (int i = 2; i < anInt; i++) {
            if(anInt%i==0){
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer[]> divideChocolateStick(int almond, int nude) {
        // TODO:
        ArrayList<Integer[]> output = new ArrayList<>();
        int min = Math.min(almond, nude);
        System.out.println("min = " + min);
        for (int i = 1; i <=min ; i++) {
            if(almond%i==0&&nude%i==0){

                output.add(new Integer[]{i, almond / i, nude / i});
            }

        }
        return output;
    }

    public static ArrayList<String[]> missHouseMeal(String[] sideDishes) {
        // TODO:
        ArrayList<String[]> sideDishesCombs = new ArrayList<>();
        String[] sideDishesComb;
       Arrays.sort(sideDishes);
        for (int i = sideDishes.length; i> 0; i--) {
            int cnt =0;
            int depth = i;
            sideDishesComb= new String[depth];
            Combination(0,depth,0,sideDishesComb,sideDishes,sideDishesCombs);
        }
        sideDishesCombs.sort(Comparator.comparing(Arrays::toString));
        sideDishesCombs.add(0,new String[]{});
        return sideDishesCombs;

    }

    static void Combination(int cnt, int depth, int k, String[] sideDishesComb, String[] sideDishes,ArrayList<String[]> sideDishesCombs){
        if(cnt==depth){
//            System.out.println(Arrays.toString(sideDishesComb));
            sideDishesCombs.add(Arrays.copyOf(sideDishesComb,sideDishesComb.length));
            return;
        }
        for (int i = k; i < sideDishes.length; i++) {
            sideDishesComb[cnt]=sideDishes[i];
            Combination(cnt+1,depth,i+1,sideDishesComb,sideDishes,sideDishesCombs);
        }
    }

    public static ArrayList<String[]> missHouseMeal2(String[] sideDishes) {
        //search 함수에서 사용할 빈 스택을 선언합니다.
        Stack<String> stack = new Stack<>();

        //결과를 담을 ArrayList를 선언합니다.
        ArrayList<String[]> result = new ArrayList<>();

        //재료들을 오름차순으로 정렬합니다.
        Arrays.sort(sideDishes);

        // 빈 스택과 0 번째 인덱스, 정렬된 재료로 구성된 배열, 결과를 담을 List를 인자로 받는 재귀 함수를 실행합니다.
        result = search(stack, 0, sideDishes, result);

        // 결과를 오름차순 순서로 정렬합니다.
        result.sort((o1, o2) -> Arrays.toString(o1).compareTo(Arrays.toString(o2)));
        //결과를 반환합니다.
        return result;
    }

    // 모든 조합을 검사하는 재귀 함수를 작성합니다.
    static public ArrayList<String[]> search(Stack<String> stack, int idx, String[] sideDishes, ArrayList<String[]> result) {
        // 재귀 함수이기 때문에 탈출 조건을 만듭니다.
        if (idx >= sideDishes.length) {
            // 만약, idx와 sideDishes의 길이가 같거나 크다면(마지막까지 검토한 경우) 스택을 배열로 변환한 후, 해당 스택을 result에 넣어줍니다.
            String[] arr = stack.toArray(new String[0]);
            result.add(arr);
            return result;
        } else {
            // idx가 부분집합에 포함된 경우
            stack.push(sideDishes[idx]);
            search(stack, idx + 1, sideDishes, result);

            // idx가 부분집합에 포함되지 않은 경우
            stack.pop();
            search(stack, idx + 1, sideDishes, result);
        }
        return result;
    }

    public static boolean ABCheck(String str) {
        // TODO:
        str = str.toLowerCase(Locale.ROOT);
        int prefix =  0;
        int suffix = 100;
        for (int i = 0; i < str.length(); i++) {
            System.out.println("prefix = " + prefix);
            System.out.println("suffix = " + suffix);
            if(str.charAt(i)=='a'){
                prefix=i;
            }
            if(str.charAt(i)=='b'){
                suffix=i;
            }
            if(Math.abs(prefix-suffix)==4){
                return true;
            }
        }


        return false;
    }

    public static String insertDash(String str) {
        // TODO:
       if(str.isEmpty()){
           return null;
       }
        StringBuffer ans = new StringBuffer();
        ans.append(str.charAt(0)-'0');
        for (int i = 1; i < str.length(); i++) {
//            System.out.println(Character.getNumericValue(str.charAt(i)));
            if(Character.getNumericValue(str.charAt(i))%2==1&&Character.getNumericValue(str.charAt(i-1))%2==1){
                ans.append("-"+Character.getNumericValue(str.charAt(i)));
            }
            else{
                ans.append(Character.getNumericValue(str.charAt(i)));
            }
//            System.out.println(ans);
        }
return ans.toString();
    }
    public String[] removeExtremes(String[] arr) {
        // TODO:
        int maxLength = 0;
        int maxIndex = 0;
        int minLength = 100;
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length()>=maxLength){
                maxLength=arr[i].length();
                maxIndex=i;
            }
            if(arr[i].length()<=minLength){
                minLength=arr[i].length();
                minIndex=i;
            }
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(i==maxIndex||i==minIndex){
                continue;
            }
            else{
                ans.add(arr[i]);
            }
        }

        arr=ans.toArray(new String[0]);
        return arr;
    }

//    public int[] reverseArr(int[] arr){
//        // TODO:
//
//
//        int[] ints = Arrays.copyOfRange(arr, arr.length - 2, arr.length - 1);
//        if(ints.length==0){
//            return
//        }
//        return reverseArr(ints);
//    }

    /**
     *  1 2 3 4 5
     * @param args
     * @throws IOException
     */

    public static void main(String[] args) throws IOException {
        String output = insertDash("454793");
        System.out.println(output);



    }
    }

















//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        final int MAX = 1_000_000;
//
//        int[] arr = new int[MAX+1];
//        int[] sum = new int[MAX+1];
//        Arrays.fill(arr,1);
//        for (int i = 2; i < arr.length; i++) {
//            for (int j = 1; i*j < arr.length; j++) {
//                arr[i*j]+=i;
//            }
//        }
//
//        for (int i = 1; i <sum.length; i++) {
//            // 1부터 i 번째의 합 = 1부터 i-1번째의 합 +  i랑 똑같지 않을까요?
//            sum[i]= sum[i-1]+arr[i];
//        }
////        System.out.println(Arrays.toString(arr));
//
////        System.out.println(psum);
//
//        int N = Integer.parseInt(br.readLine());
//
//        for (int i = 0; i < N; i++) {
//            int answer = Integer.parseInt(br.readLine());
//            System.out.println(sum[answer]);
//        }

