import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] kkk = generateRandomArray();
        int sum = 0;
        System.out.println(Arrays.toString(kkk));
        for (int i = 0; i < kkk.length; i++) {
            sum = sum + kkk[i];
        }
        System.out.println(sum);
    }

    public static void task2() {
        int[] kkk = generateRandomArray();
        int max = -1;
        System.out.println(Arrays.toString(kkk));
        for (int i = 0; i < kkk.length; i++) {
            if (kkk[i] > max) {
                max = kkk[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
    }

    public static void task3() {

        int[] kk = generateRandomArray();
        int min = kk[0] + 1;
        System.out.println(Arrays.toString(kk));
        for (int a = 0; a < kk.length; a++) {
            if (kk[a] < min) {
                min = kk[a];
            }

        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
    }

    public static void task4() {
        int[] kkk = generateRandomArray();
        int sum = 0;
        System.out.println(Arrays.toString(kkk));
        for (int i = 0; i < kkk.length; i++) {
            sum = sum + kkk[i];
        }
        System.out.println("Средняя сумма трат за месяц составила " + (double) sum / kkk.length + " рублей");


    }

    public static void task5() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
