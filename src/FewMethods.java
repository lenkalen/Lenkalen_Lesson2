package Lesson_02;

public class FewMethods {
    public static void main(String[] args) {
        boolean boolCheck = severalCheckTheSumOf2Numbers(13, 15);
        System.out.println(boolCheck);
        System.out.println("*********************");

        PositiveOrNegativeNumber(0);
        System.out.println("*********************");

        boolean boolPozNeg = boolPositiveOrNegativeNumber(100);
        System.out.println(boolPozNeg);
        System.out.println("*********************");

        String line = "Hello, Java!";
        printLineAmt(line, 5);
        System.out.println("*********************");
    }
    public static boolean severalCheckTheSumOf2Numbers(int a, int b) {
        int sum = a + b;
//     Проверка суммы по условиям задачи
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
    public static void PositiveOrNegativeNumber(int a) {
//      Проверка передаваемого числа
        if (a >=0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean boolPositiveOrNegativeNumber(int a) {
//        Проверка передаваемого числа
        if (a >=0) {
            return true;
        } else {
            return false;
        }
    }
    public static void printLineAmt(String line, int amt){
        for (int i = 0; i < amt; i++) {
            System.out.println(line);
            System.out.println();
        }
    }
}
