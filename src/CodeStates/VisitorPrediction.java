package CodeStates;

import java.util.ArrayList;
import java.util.Scanner;

public class VisitorPrediction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //인공지능 프로그램 V1
        /**
         *     System.out.println("인공지능 프로그램 V1");
         *         System.out.println("=".repeat(25));
         *         System.out.print("[System] 예측에 영향을 주는 원인(광고비)의 값을 알려주세요 (단위 원) : ");
         *         int ad = scan.nextInt();
         *         System.out.printf("[안내] 입력된 광고비는 %d원 입니다.", ad);
         *         System.out.printf("[안내] AI의 예측(클릭 수)은  %d회 입니다.", ad * 2 + 1);
         */

        //인공지능 프로그램 V2
        System.out.println("[인공지능 프로그램 V2]");
        System.out.println("=".repeat(25));
        System.out.print("[System] a 값을 입력하여 주세요 : ");
        int a = scan.nextInt();
        System.out.print("[System] b 값을 입력하여 주세요 : ");
        int b = scan.nextInt();

        double ad = 0;
        ArrayList<Double> ads = new ArrayList<>();
        System.out.println("[안내] '광고비'를 입력하여 주세요. ");
        for (int i = 1; i <= 4; i++) {
            ad=scan.nextDouble();
            ads.add(ad);
        }

        System.out.println("[안내] 입력된 '광고비'는 다음과 같습니다. ");

        for (int i = 0; i < 4; i++) {
            System.out.printf("%d 번째 %.1f원 ",i+1, ads.get(i));
        }
        System.out.println();

        System.out.println("[안내] AI의 '웹 페이지 방문자' 예측 결과는 다음과 같습니다. ");

        for (int i = 0; i < 4; i++) {
            System.out.printf("%d 번째 예측) %.1f회 방문\n",i+1,ads.get(i)*a+b);
        }






    }
}
