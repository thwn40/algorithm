import java.util.*;

class Solution {


    public int addOddValues(HashMap<Character, Integer> hashMap) {
        //TODO..
        int sum =0;
        Set<Character> characters = hashMap.keySet();
        Iterator<Character> iterator = characters.iterator();

        while(iterator.hasNext()){
            Character next = iterator.next();
            if(hashMap.get(next)%2==0){
                System.out.println(hashMap.get(next));
                sum+=hashMap.get(next);
            }

        }

          /**
           * int result = 0;
    Set<Character> tem = new Set<>();

    tem = hashMap.keySet();

    Iterator<Character> it = tem.iterator();

    while(it.hasNext()){
           Character next = iterator.next();
      if(hashMap.get(next) % 2==0)
           result += hashMap.get(next);
    }
    return result;
           *
           * */


//        System.out.println(characters);
//
//        for (Character character : hashMap.keySet()) {
//
//            if(hashMap.get(character)%2==0){
//                sum+=hashMap.get(character);
//            }
//        }

        return sum;
    }

    public String getElementOfListEntry(HashMap<String, List<String>> hashMap, String key, int index) {
        //TODO..
        if(hashMap.containsKey(key)){
            return null;
        }

        if(hashMap.get(key).size()>index){
            return null;
        }
        return hashMap.get(key).get(index);
    }

    public boolean isMember(HashMap<String, String> member, String username, String password) {
        //TODO..
        if( member.containsKey(username)&&member.get(username).equals(password))
            return true;
        else return false;
    }
    public HashMap<String, Integer> select(String[] arr, HashMap<String, Integer> hashMap) {
        //TODO..
        int i =0;
        HashMap<String,Integer> map = new HashMap<>();
        for (String s : arr) {
            if(hashMap.containsKey(s)){
                map.put(s,hashMap.get(s));
            }

        }

        return map;
    }

    public HashMap<Character, Integer> countAllCharacter(String str) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        if(str.length()==0){
            return null;
        }
        char[] chars = str.toCharArray();
        for (Character c : chars) {
            hashMap.put(c,hashMap.getOrDefault(c,3)+1);
        }

        return hashMap;

        //TODO..
    }


    public static void main(String[] args) {

        }
    }
