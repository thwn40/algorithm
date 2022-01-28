





import java.util.*;



public  class Main {
    static Scanner kb = new Scanner(System.in);
    public static void solution(int n, int k) {
        Queue<Person> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            int prirority = kb.nextInt();
            queue.add(new Person(i, prirority));
        }


//        for (int i = 0; i < n; i++) {
//            Person temp = queue.poll();
//            System.out.print(temp.id);
//            System.out.println(temp.priority);
//
//        }
        int count =0;
        while(!queue.isEmpty()){
            Person temp=queue.poll();
            for(Person x : queue) {
                if(x.priority>temp.priority){
                    queue.offer(temp);
                    temp = null;
                    break;
                }

            }
            if(temp!=null){
                count++;
                if(temp.id==k){
                    System.out.println(count);
                }


            }
        }



    }


    public static void main(String[] args) {
        int a = kb.nextInt();
        int b = kb.nextInt();

        solution(a,b);





    }
    public static class Person{
        int id;
        int priority;

        public Person(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }

}



