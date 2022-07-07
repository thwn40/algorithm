package CodeStates;

import java.util.Scanner;

public class ElectricityBillCalculator {

    double bill = 0;
    double Under100kWh(int kWh){
        bill=kWh*60.7;
        return bill;
    }

    double Over100kWhUnder200kWh(int kWh){
        bill=100*60.7+(kWh-100)*125.9;
        return bill;
    }

    double Over200kWhUnder300kWh(int kWh){
        bill=(100*60.7)+(100*125.9)+((kWh-200)*187.9);
        return bill;
    }

    void Calculate(int kWh){
        if(kWh<=100){
            System.out.println(kWh+"kWh의 전기 요금은 "+Under100kWh(kWh)+"원 입니다.");

        }
        else if(kWh>100&&kWh<=200){
            System.out.println(kWh+"kWh의 전기 요금은 "+Over100kWhUnder200kWh(kWh)+"원 입니다.");

        }
        else if (kWh>200&&kWh<=300) {
            System.out.println(kWh+"kWh의 전기 요금은 "+Over200kWhUnder300kWh(kWh)+"원 입니다.");

        }
    }


    public ElectricityBillCalculator() {
        this.bill = bill;
        System.out.println("=================");
        System.out.println("주택용 전기요금(저압) 계산기");
        System.out.println("=================");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElectricityBillCalculator calculator = new ElectricityBillCalculator();
        calculator.Calculate(scanner.nextInt());



    }
}
