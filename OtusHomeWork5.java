package OtusHomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class OtusHomeWork5 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();


        int[] array = new int[1000];
        Random random = new Random(47);
        System.out.println(random);
        for (int i = 0; i < 1000; i++) {
            array[i] = random.nextInt(1000);
        }
        System.out.println("After sorting array ");

        System.out.println(Arrays.toString(array));


        for (int step = 0; step < array.length; step++) {
            int index = min(array, step);
            int tmp = array[step];
            array[step] = array[index];
            array[index] = tmp;
        }
        long endTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(array));
        System.out.println("Sum prim " + (endTime - startTime) + " ms");

        System.out.println("++++++++++++++++++++++++++++++++++++");
        /*СТАНДАРТНАЯ СОРТИРОВКА*/
        long startTime1 = System.currentTimeMillis();
        int[] array1 = new int[1000];
        Random random1 = new Random(47);
        System.out.println(random1);
        for (int i = 0; i < 1000; i++) {
            array1[i] = random1.nextInt(1000);

        }
            Arrays.sort(array1);
            System.out.println(Arrays.toString(array1));
            long endTime1 = System.currentTimeMillis();

            System.out.println("Sum prim " + (endTime1 - startTime1) + " ms");

        }



    private static int min(int[] array, int start) {
        int minIndex = start;
        int minValue = array[minIndex];
        for (int i = start + 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}