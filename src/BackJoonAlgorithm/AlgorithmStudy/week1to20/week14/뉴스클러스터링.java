package BackJoonAlgorithm.AlgorithmStudy.week1to20.week14;

import java.util.*;

public class 뉴스클러스터링 {
    public int solution(String str1, String str2) {
   
        HashMap<String, Group> hashMap = new HashMap<>();

        str1 =str1.toLowerCase();
        str2 = str2.toLowerCase();


        makeMultiSet(str1, str2,hashMap);



        List<String> interSection = getInterSection(hashMap);

        List<String> union = getUnion(hashMap);


        Integer answer = jaccardSimilarity(interSection, union);


        return answer;

    }

    private Integer jaccardSimilarity(List<String> interSection, List<String> union) {
        int answer = 0;
        double interSectionSize = interSection.size();
        double unionSize = union.size();
        if(unionSize==0.0){
            return 65536;
        }

        double v = ( interSectionSize / unionSize)*65536;
        answer = (int) v;
        return answer;
    }

    private List<String> getUnion(HashMap<String, Group> hashMap) {
        List<String> union = new ArrayList<>();
        for (String s : hashMap.keySet()) {
            Group group = hashMap.get(s);
            if(group.setA.size()>= group.setB.size()){
                union.addAll(group.setA);
            }
            else{
                union.addAll(group.setB);
            }
        }
        return union;
    }

    private List<String> getInterSection(HashMap<String, Group> hashMap) {
        List<String> interSection = new ArrayList<>();
        for (String s : hashMap.keySet()) {
            Group group = hashMap.get(s);
            if(group.setA.size()>= group.setB.size()){
                interSection.addAll(group.setB);
            }
            else{
                interSection.addAll(group.setA);
            }
        }
        return interSection;
    }

    private void makeMultiSet(String str, String str2, HashMap<String, Group> hashMap) {
        for (int i = 0; i < str.length()-1; i++) {
            if(Character.isAlphabetic(str.charAt(i))&&Character.isAlphabetic(str.charAt(i+1))){
                String letter = str.charAt(i) + String.valueOf(str.charAt(i + 1));
                hashMap.putIfAbsent(letter,new Group());
                Group group = hashMap.get(letter);
                group.setA.add(letter);
            }
        }
        for (int i = 0; i < str2.length()-1; i++) {
            if(Character.isAlphabetic(str2.charAt(i))&&Character.isAlphabetic(str2.charAt(i+1))){
                String letter = str2.charAt(i) + String.valueOf(str2.charAt(i + 1));
                hashMap.putIfAbsent(letter,new Group());
                Group group = hashMap.get(letter);
                group.setB.add(letter);
            }
        }
    }


    public static class Group {
        private List<String> setA = new ArrayList<>();
        private List<String> setB = new ArrayList<>();

        public Group() {
        }

        @Override
        public String toString() {
            return "Lists{" +
                    "setA=" + setA +
                    ", setB=" + setB +
                    '}';
        }
    }




    public static void main(String[] args) {
        뉴스클러스터링 a = new 뉴스클러스터링();
        a.solution("aa1+aa2","aaaa12");
        a.solution("france","french");
        a.solution("handshake","shake hands");
        a.solution("E=M*C^2","e=m*c^2");
        //aa aa
        //aa aa aa
        //aa aa
        //aa aa aa


    }
}
