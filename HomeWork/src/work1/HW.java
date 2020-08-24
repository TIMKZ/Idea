package work1;

public class HW {
    public static void main(String[] args) {
//#2
//        byte;
        System.out.println("Byte от " + Byte.MIN_VALUE + " до " + Byte.MAX_VALUE);

//        short;
        System.out.println("Short от " + Short.MIN_VALUE + " до " + Short.MAX_VALUE);

//        int;
        System.out.println("Int от " + Integer.MIN_VALUE + " до " + Integer.MAX_VALUE);

//        long;
        System.out.println("Long от " + Long.MIN_VALUE + " до " + Long.MAX_VALUE);

//        float;

        System.out.println("Float  - дробная переменная " + Float.MIN_VALUE + " до " + Float.MAX_VALUE);

//        double;
        System.out.println("Double - дробная переменная " + Double.MIN_VALUE + " до " + Double.MAX_VALUE);
//#3

        System.out.println("2*(3+(10/5) = " + sum(2,3,10,5));

//#4
        int a = 9;
        if (10 <= a && a <= 20) {
            System.out.println(a + " число в диапозоне 10-20 true");
        } else {
            System.out.println(a + " число не в диапозоне 10-20 false");
        }

//#5
        int b = 0;
        if (b >= 0) {
            System.out.println(b + " число положительное");
        } else {
            System.out.println(b + " число отрицательное");
        }
//#6
        System.out.println("-1 < 0 "+ isNegative(-1));

//#7
        printName("Вася!");


    }
    static void printName(String name) {
        System.out.println("Привет, " + name);

    }

    //#3
    static int sum(int a, int b, int c, int d) {
        return a * (b + (c / d));

    }

    static boolean isNegative(int c){
        return c < 0; // если делится на 4 - значит високосный true

//    static boolean isEven(int year){
//        return year % 4 == 0; // если делится на 4 - значит високосный true

    }



}

