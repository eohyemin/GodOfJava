package Chapter23.collection.practice;

import java.util.HashSet;
import java.util.Random;

public class RandomNumberMaker {
    Random random = new Random();

    public static void main(String[] args) {
        RandomNumberMaker numberMaker = new RandomNumberMaker();
        numberMaker.makeRandomNumbers(10);
    }
    public void makeRandomNumbers(int count) {
        for(int i=0; i<count; i++) {
            HashSet<Integer> set = getSixNumber();
            System.out.println(set);
        }
    }
    public HashSet<Integer> getSixNumber() {
        HashSet<Integer> numberSet = new HashSet<>();
        while(true) {
            int tempNumber = random.nextInt(44) + 1;
            numberSet.add(tempNumber);
            if(numberSet.size() == 6) break;
        }
        return numberSet;
    }
}
