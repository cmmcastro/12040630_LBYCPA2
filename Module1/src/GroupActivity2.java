import java.util.Arrays;
import java.util.Random;

public class GroupActivity2 {
    public static void main(String[] args) {
        Random ran = new Random();

        System.out.println("Input:");
        int[] randomIntegers = new int[100];

        for (int i = 0; i < randomIntegers.length; i++){
            randomIntegers[i] = ran.nextInt(-1000,1001);
        }

        System.out.println(Arrays.toString(randomIntegers));

        int max = randomIntegers[0];
        for (int j = 0; j < randomIntegers.length; j++){
            if (max < randomIntegers[j]){
                max = randomIntegers[j];
            }
        }

        System.out.println("\nOutput:\n"+max);
    }
}
