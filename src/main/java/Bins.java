import com.google.inject.internal.Errors;

import java.util.ArrayList;
import java.util.HashMap;
public class Bins {

    public HashMap<Integer,Integer> binMap = new HashMap<>();

    int low = 0;
    int high = 0;

    public Bins(int low, int high) {
        this.low = low;
        this.high = high;
    }

    public void createBin() {
        for (int i =low; i <= high; i++){
            int temp = low++;
            binMap.put(temp,0);
        }
    }

    public void incrementBin(int key) {
   binMap.get(key);
   binMap.put(key, binMap.get(key)+1);
    }


        public int getBin(int key){
            return binMap.get(key);
        }

    public static void main(String[] args){


        Bins results = new Bins(2, 12);
        Integer numberOfTens = results.getBin(10);
        results.incrementBin(10);
        System.out.println(numberOfTens);

    }
    }
