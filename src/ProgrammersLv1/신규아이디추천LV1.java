package ProgrammersLv1;

public class 신규아이디추천LV1 {
    public String solution(String new_id) {
        String answer = "";
        StringBuilder temp = new StringBuilder();


        // 1,2,3단계
        answer = new_id.toLowerCase().replaceAll("[^a-z\\d\\-_.]*", "").replaceAll("\\.+", ".");

        //4단계
        if (!answer.isEmpty()) {
            if (answer.charAt(0) == '.') {
                answer = answer.replaceFirst("\\.", "");
            }

            if(!answer.isEmpty()){
                if (answer.charAt(answer.length()-1) == '.') {
                    answer = answer.substring(0, answer.length() - 1);
                }
            }
        }



        //5단계
        if (answer.isEmpty()) {
            answer = "a";
        }



        //6단계
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            if (answer.charAt(answer.length() - 1) == '.') {
                answer = answer.substring(0, answer.length() - 1);
            }
        }



        //7단계
        if (answer.length() <= 2) {
            temp.append(answer);
            while (true) {
                temp.append(answer.charAt(answer.length() - 1));
                if (temp.length() == 4) {
                    break;
                }
                answer = String.valueOf(temp);
            }


        }

        return answer;
    }

    public static void main(String[] args) {
        신규아이디추천LV1 solution = new 신규아이디추천LV1();
        System.out.println("답" + solution.solution( "=.="));
        ;
    }
}
