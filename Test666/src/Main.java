import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] people = new int[5];
        int sum = 0;
        for( int i = 0; i <people.length; i++){
            people[i] = new Random().nextInt(100);
            sum = sum + people[i];
        }
        System.out.println(sum);
        System.out.println("Средний возраст:  " + sum / people.length);

    }

}


