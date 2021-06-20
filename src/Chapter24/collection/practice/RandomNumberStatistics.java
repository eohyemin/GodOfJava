package Chapter24.collection.practice;

import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

public class RandomNumberStatistics {
    private final int DATA_BOUNDARY = 50;
    private Hashtable<Integer, Integer> hashtable = new Hashtable<>();

    public static void main(String[] args) {
        RandomNumberStatistics statistics = new RandomNumberStatistics();
        statistics.getRandomNumberStatistics();
    }
    public void getRandomNumberStatistics() {
        Random random = new Random();
        int runCount = DATA_BOUNDARY * 100;
        for(int i=0; i<runCount; i++) {
            int tmpNumber = random.nextInt(DATA_BOUNDARY) + 1;
            putCurrentNumber(tmpNumber);
        }
    }
    public void putCurrentNumber(int tempNumber) {
        if(hashtable.containsKey(tempNumber)) {
            hashtable.put(tempNumber, hashtable.get(tempNumber)+1);
        } else {
            hashtable.put(tempNumber, 1);
        }
        printStatistics();
    }
    public void printStatistics() {
        Set<Integer> keySet = hashtable.keySet();
        for(int key: keySet) {
            int count = hashtable.get(key);
            System.out.println(key+" = " + count + "\t");
            if(key%10-1 == 0) System.out.println();
        }
    }

}
