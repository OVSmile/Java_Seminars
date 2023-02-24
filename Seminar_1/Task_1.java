package Seminars.Seminar_1;

// Дан массив чисел, нужно сформировать новую из только чётных чисел
// 1. Уточнить ТЗ
// 2. Декомпозиция:
//     - задать массив
//     - заполнить массив (разными способами0)
//     - вывести на печать
//     - сформировать массив четных чисел

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
// import java.util.function.IntBinaryOperator;

public class Task_1 {

    private static Random random = new Random();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // MyList ml = new MyList();
        // ml.append(1)
        // System.out.println(ml.print());
        int len = getNumberByUser("Введите колличество элементов ");
        int[] items = createArray(len);
        fillArray(items, 0, 10);
        System.out.println(print1(items));

        int evenCount = getCountEvenItems(items);
        int[] evenItems = getEvenItems(items, evenCount);
        System.out.println(print1(evenItems));
        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(evenItems));
    }

    //Ввод числа и создание массива
    public static int[] createArray(int size) {
        return new int[size];
    }

    public static int getNumberByUser(String text) {
        System.out.print(text);
        return input.nextInt();

    }

    // 2.2 Заполнение массива

    public static void fillArray(int[] col, int min, int max) {
        int count = col.length;
        int index = 0;
        while (index < count) {
            col[index] = random.nextInt(min, max);
            index = index + 1;
        }
    }

    //2.3 Печать результата
    public static String print1(int[] data) {
        String output = "";
        int count = data.length;

        int index = 0;
        while (index < count) {
            output += data[index] + "";
            index = index + 1;
        }
        return output;
    }

    //2.4 Печать результата
    public static void print2(int[] data) {
        int count = data.length;

        int index = 0;
        while (index < count) {
            System.out.print(data[index] + " ");
            index = index + 1;
        }
    }

// Получение только чётных чисел

    public static int[] getEvenItems(int[] rawData, int countEvenElements) {
        int count = rawData.length;
        int[] evenItems = createArray(countEvenElements);

        int k = 0;

        for (int i = 0; i < count; i++) {
            if (rawData[i] % 2 == 0) {
                evenItems[k] = rawData[i];
                k++;
            }
        }
        return evenItems;
    }

    //Получение количества чётных чисел

    static int getCountEvenItems(int[] array) {
        int length = array.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (array[i] % 2 == 0)
            count++;
        }
        return count;
    }
        
}
