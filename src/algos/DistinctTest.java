package algos;

public class DistinctTest {
    public static void main(String args[]){
        int[] numbers = {1,2,3,4,5};
        if(Distinct.isDistinctHash(numbers)){
            System.out.println("Numbers distinct");
        }
        else{
            System.out.println("Numbers not distinct");
        }
    }
}
