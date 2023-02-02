package BackJoonAlgorithm.AlgorithmStudy.week1to20.week14;

import java.util.HashMap;

public class 캐시 {
    public int solution(int cacheSize, String[] cities) {
        int runtime = 0;
        HashMap<String,City> cache = new HashMap<>(cacheSize);

        if(cacheSize==0){
            return cities.length*5;
        }
        for (String city : cities) {
            //캐시를 찾는다.
            city=city.toLowerCase();
            allElementTimePlus(cache);
            for (int i = 0; i < cacheSize; i++) {
                //캐시 히트
                if(cache.containsKey(city)){
                    cache.get(city).cacheHit();
                    runtime+=1;
                    break;
                }

                //캐시가 없으면 캐시미스
                else{
                    LRU(cacheSize, cache);
                    cache.putIfAbsent(city,new City(city,0L));
                    runtime+=5;
                }
                break;
            }
                //캐시가 있으면 캐시히트



        }

        return runtime;
    }

    private void allElementTimePlus(HashMap<String, City> cache) {
        for (String s : cache.keySet()) {
            cache.get(s).cacheMiss();
        }
    }

    private void LRU(int cacheSize, HashMap<String, City> cache) {
        if(cache.size()== cacheSize){
            Long max = Long.MIN_VALUE;
            String name = "";
            for (String s : cache.keySet()) {
                if(cache.get(s).getTime()>max){
                    name = cache.get(s).getName();
                    max = cache.get(s).getTime();
                }
            }
            cache.remove(name);
        }
    }

    static class City {
        private String name;
        private Long time = 0L;

        public City(String name, Long time) {
            this.name = name;
            this.time = time;
        }

        public void cacheMiss(){
            this.time++;
        }
        public void cacheHit(){
            this.time=0L;
        }

        public String getName() {
            return name;
        }

        public Long getTime() {
            return time;
        }
    }

    public static void main(String[] args) {
        캐시 z = new 캐시();
        z.solution(2,new String[]{"Jeju", "Pangyo", "NewYork", "newyork"});
    }


}
