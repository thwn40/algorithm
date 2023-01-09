package BackJoonAlgorithm.AlgorithmStudy.week14;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.*;

public class 셔틀버스 {
    public String solution(int n, int t, int m, String[] timetable) {
        String answer = "";

        int crewTotal = timetable.length;
        PriorityQueue<LocalTime> crewTimeTable = new PriorityQueue<>();
        Queue<LocalTime> busTimeTable = new LinkedList<>();

        for (String strTime : timetable) {
            LocalTime realTime = LocalTime.parse(strTime);
            crewTimeTable.offer(realTime);
        }

        LocalTime firstStart = LocalTime.of(9, 0);
        for (int i = 0; i < n; i++) {
            busTimeTable.offer(firstStart.plusMinutes((long) t * i));
        }




        Bus lastBus = null;
        int busTotal = m;
        for (int i = 0; i < n; i++) {


            LocalTime busDepartureTime = busTimeTable.poll();
            Bus bus = new Bus(busDepartureTime, m);
            LocalTime crew = null;
           busTotal=m;
            System.out.println("busTimeTable = " + busTimeTable);
            System.out.println("crewTimeTable = " + crewTimeTable);
            if(i==n-1){
                if(crewTotal>=busTotal){
                    for (int j = 0; j < m; j++) {
                        crew = crewTimeTable.peek();
                        if(j==m-1){
                            if (crew.isBefore(busDepartureTime) || busDepartureTime.equals(crew)) {
                              answer = crew.minusMinutes(1).toString();
                              return answer;
                            } else {
                                return busDepartureTime.toString();
                            }
                        }
                        if (crew.isBefore(busDepartureTime) || busDepartureTime.equals(crew)) {
                            crewTimeTable.poll();
                            bus.boarding(crew);
                            busTotal--;
                            crewTotal--;
                        } else {
                            break;
                        }
                    }
                }
                if(crewTotal==0){
                    return lastBus.departureTime.toString();


                }
                else{
                    return busDepartureTime.toString();
                }

            }
            for (int j = 0; j < m; j++) {
                crew = crewTimeTable.peek();
                if (crew.isBefore(busDepartureTime) || busDepartureTime.equals(crew)) {
                    crewTimeTable.poll();
                    bus.boarding(crew);
                    busTotal--;
                    crewTotal--;
                } else {
                    break;
                }
            }
           while(!crewTimeTable.isEmpty()) {
               if (crew.isBefore(busDepartureTime) || busDepartureTime.equals(crew)) {
               crewTimeTable.poll();
               crewTotal--;
               }
               else{
                   break;
               }
           }
            lastBus = bus;
        }





        /**
         * 버스 정원은 널널한데 사람들이 너무 일찍온 경우 -> 버스 출발시간에 딱맞게 도착하면 됨
         * 대기중인사람도 한명 남았고 버스 정원이 한자리 남으면 -> 마지막 사람이랑 같은시간에 도착해서 낑겨타야댐
         * 버스 출발시간보다 빨리 도착해야하는경우
         * 버스 출발시간에 겨우 타는 경우
         * 마지막에 낑겨서 타는 경우
         * 막차를 타는 경우
         */
//     while(!crewTimeTable.isEmpty()){
//         System.out.println(crewTimeTable.poll());
//     }

        return answer;
    }

    static class Bus {
        private LocalTime departureTime;
        private ArrayList<LocalTime> seat;

        public void boarding(LocalTime localTime) {
            seat.add(localTime);
        }

        public Bus(LocalTime departureTime, int m) {
            this.departureTime = departureTime;
            this.seat = new ArrayList<>(m);
        }

        @Override
        public String toString() {
            return "Bus{" +
                    "departureTime=" + departureTime +
                    ", seat=" + seat +
                    '}';
        }
    }

    public static void main(String[] args) {
        셔틀버스 s = new 셔틀버스();
//        System.out.println(s.solution(1, 1, 5, new String[]{"08:00", "08:01", "08:02", "08:03"}));
//        System.out.println(s.solution(2, 10, 2, new String[]{"09:10", "09:09", "08:00"}));
        System.out.println(s.solution(2, 1, 2, new String[]{"09:00", "09:00", "09:00", "09:00"}));
//        System.out.println(s.solution(1, 1, 5, new String[]{"00:01", "00:01", "00:01", "00:01", "00:01"}));


    }
}
