package JavaGrammarPractice;

import java.util.ArrayList;

interface Patty{
    String 패티이름();
}

class 게살패티 implements Patty {

    @Override
    public String 패티이름() {
        return "게살";
    }
}


abstract class 햄버거 {


    private String 빵 ="참깨빵";
    private Patty 패티;

    void setPatty(Patty 패티){
        this.패티 = 패티;
    }

    abstract void changePatty();

}

class 게살버거 extends 햄버거 {

    @Override
    void changePatty() {
        setPatty(new 게살패티());
    }


}



public class Practice {

    public static void main(String[] args) {
        햄버거 게살버거 = new 게살버거();
        게살패티 crap = new 게살패티();

    }

}
