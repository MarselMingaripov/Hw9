import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100000) + 100000;
        }
        return array;
    }

    public static void task1() {
        System.out.println("task 1");

        int[] expenceArray = generateRandomArray();
        int sum = 0;
        for (int element : expenceArray) {
            sum += element;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей", sum);
        System.out.println();
        System.out.println();
    }

    public static void task2(){
        System.out.println("task2");

        int[] randomArray = generateRandomArray();
        int min = randomArray[0];
        int max = randomArray[0];
        for (int i : randomArray) {
            if (min > i) {
                min = i;
            }
            if (max < i) {
                max = i;
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. " +
                "Максимальная сумма трат за день составила %d рублей", min, max);
        System.out.println();
        System.out.println();
    }

    public static void task3(){
        System.out.println("task3");

        int[] extenceArray = generateRandomArray();
        int sum = 0;
        int totalDays = 30;
        for (int element:extenceArray) {
            sum += element;
        }
        double averageSpending = sum / totalDays;
        System.out.printf("Средняя сумма трат за месяц составила %f рублей", averageSpending);
        System.out.println();
    }

    public static void task4(){
        System.out.println("task4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        boolean isArrayLengthHonest= reverseFullName.length %2 == 0;
        int arraysLength = reverseFullName.length - 1;

        if (isArrayLengthHonest){
            for (int index = 0; index < reverseFullName.length / 2; index++){
                char buf = reverseFullName[index];
                reverseFullName[index] = reverseFullName[arraysLength];
                reverseFullName[arraysLength] = buf;
                arraysLength -=1;
            }
            System.out.println(Arrays.toString(reverseFullName));
        }else {
            for (int index = 0; index <= reverseFullName.length / 2; index++){
                char buf = reverseFullName[index];
                reverseFullName[index] = reverseFullName[arraysLength];
                reverseFullName[arraysLength] = buf;
                arraysLength -=1;
            }
            System.out.println(Arrays.toString(reverseFullName));
        }
    }
}