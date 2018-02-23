package algos;

import java.util.HashMap;

public class Distinct {

    public static boolean isDistinct(int[] numbers ){
        int currNum;

        for(int i = 0; i < numbers.length; i++) {
            currNum = numbers[i];
            for (int j = i + 1; j < numbers.length; j++)
                if(numbers[j] == currNum){
                    return false;
                }
        }
        return true;
    }

    public static boolean isDistinctHash(int[] numbers){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            if(map.containsKey(numbers[i])){
                return false;
            }
            map.put(numbers[i],numbers[i]);
        }
        return true;
    }
}
