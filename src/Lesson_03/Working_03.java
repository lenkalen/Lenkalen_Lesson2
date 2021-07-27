package Lesson_03;

public class Working_03 {
    public static void main(String[] args) {

        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Задание 1: Исходный массив:");
        printArray(array1);
        change(array1);
        System.out.println("Задание 1: Массив после преобразования:");
        printArray(array1);
        System.out.println("**********");

        int[] array2 = new int[100];
        System.out.println("Задание 2: Исходный массив:");
        printArray(array2);
        datafilling(array2);
        System.out.println("Задание 2: Массив после преобразования:");
        printArray(array2);
        System.out.println("**********");

        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Задание 3: Исходный массив:");
        printArray(array3);
        multiplication(array3);
        System.out.println("Задание 3: Массив после преобразования:");
        printArray(array3);
        System.out.println("**********");

        int[][] array4 = new int[9][9];
        System.out.println("Задание 4: Исходный массив:");
        printArray1(array4);
        diagonal(array4);
        System.out.println("Задание 4: Массив после преобразования:");
        printArray1(array4);
        System.out.println("**********");

        int len5 = 10;
        int initValue5 = -1;
        int[] array5 = creatingAnArray(len5, initValue5);
        System.out.println("Задание 5: Созданный массив:");
        printArray(array5);
        System.out.println("**********");
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }
        System.out.println();
    }

    public static void printArray1(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void change(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
    }

    public static void datafilling(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }

    public static void multiplication(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6)
                array[i] *= 2;
        }
    }

    public static void diagonal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i == j) | ((i + j) == (array.length - 1))) {
                    array[i][j] = 1;
                }
            }
        }
    }

    public static int[] creatingAnArray(int len, int initValue) {
        int[] tempA = new int[len];
        for (int i = 0; i < tempA.length; i++) {
            tempA[i] = initValue;
        }
        return tempA;
    }

}