package HW2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HW2 {

    public static void main(String[] args) {
        //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;


        System.out.println("#1");

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] -= 1;
            } else {
                arr[i] += 1;
            }

        }

        System.out.println(Arrays.toString(arr));

        //2. Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        System.out.println("#2");
        int[] arr2 = new int[8];
        System.out.println(Arrays.toString(arr2));
//            arr2[0] = 0;
//
//            arr2[1] = 3;
//
//            arr2[2] = 6;
//
//            arr2[3] = 9;
//
//            arr2[4] = 12;
//
//            arr2[5] = 15;
//
//            arr2[6] = 18;
//
//            arr2[7] = 21;

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;


        }
        System.out.println(Arrays.toString(arr2));


        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
        // и числа меньшие 6 умножить на 2;
        System.out.println("#3");

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr3));
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr3));
        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        System.out.println("#4");

        int[][] arr4 = new int[5][5];
        for (int i = 0; i < arr4.length; i++) {
        }

        printArr2d(arr4);

        //** Задать одномерный массив и найти в нем минимальный и
        // максимальный элементы (без помощи интернета);
        System.out.println("#5*");


        maxArr(arr3);

        minArr(arr3);


    }

    public static void printArr2d(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                if ((i + j) == (arr.length - 1)) {
                    arr[i][j] = 1;
                }

                System.out.printf("%3d", arr[i][j]);


            }
            System.out.println();

        }
    }

    public static int maxArr(int[] arr) {
        System.out.println(Arrays.toString(arr));

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max){
                max = arr[i];
            }

        }
        System.out.print("Максимальное значение: " + max);
        System.out.println(" ");
        return max;


    }

    public static int minArr(int[] arr) {

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min){
                min = arr[i];
            }

        }
        System.out.print("Минимальное значение: " + min);
        return min;


    }




}
