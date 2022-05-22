package JavaGrammarPractice;

abstract class House{
    private String roof = "House roof";
    private String wall = "House wall";
    private Door door;

    abstract void 난방();

    void setDoor(Door door){
        this.door=door;
    }

    Door getDoor(){
        return door;
    }
    void openDoor(){
        System.out.println("Basic door opened");

    }

    void closeDoor() {
        System.out.println("Basic door closed");
    }
}

interface Lock {
    void Lockable();
}

interface Bell{
    void Bellable();
}

interface Door extends Lock,Bell{
    void openDoor();
    void closeDoor();
}

class 아파트 extends House {

    @Override
    void 난방() {
        System.out.println("귀뚜라미");
    }
}

class 초갓집 extends House{
    @Override
    void 난방() {
        System.out.println("아궁이");
    }

    @Override
    void openDoor(){
        getDoor().openDoor();
    }

    @Override
    void closeDoor() {
        getDoor().closeDoor();
    }

}

class 철문 implements Door{
    @Override
    public void Lockable() {
        System.out.println("도어락으로 잠금");
    }

    @Override
    public void Bellable() {
        System.out.println("딩동");

    }

    @Override
    public void openDoor() {
        System.out.println("철문 열었음");
    }

    @Override
    public void closeDoor() {
        System.out.println("철문 닫음");
    }
}
public class Abstract {
    public static void main(String[] args) {
        House basicHouse = new 아파트();

        basicHouse.openDoor();
        basicHouse.closeDoor();

        House 초갓집 = new 초갓집();
        Door myDoor = new 철문();

        초갓집.setDoor(myDoor);
        초갓집.openDoor();
        초갓집.closeDoor();

    }
}
