import java.util.Random;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
//        task3();
//        task4();
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
        System.out.printf("«Сумма трат за месяц составила %d рублей»", sum);
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
}