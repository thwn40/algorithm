package JavaGrammarPractice;

    interface predator{
        String getFood();

    }

    class Animal {
        String name;

        void setName(String name) {
            this.name = name;
        }
    }

    class Tiger extends Animal implements predator {

        @Override
        public String getFood() {
            return "human";
        }
    }

    class Lion extends Animal implements predator{


        @Override
        public String getFood() {
            return "lion";
        }
    }

    class ZooKeeper {
        void feed(predator predator) {  // 호랑이가 오면 사과를 던져 준다.
            System.out.println(predator.getFood());
        }

//        void feed(Lion lion) {  // 사자가 오면 바나나를 던져준다.
//            System.out.println("feed banana");
//        }
    }

    public class Sample {
        public static void main(String[] args) {
            ZooKeeper zooKeeper = new ZooKeeper();
            Tiger tiger = new Tiger();
            Lion lion = new Lion();
            zooKeeper.feed(tiger);  // feed apple 출력
            zooKeeper.feed(lion);  // feed banana 출력
        }
    }

