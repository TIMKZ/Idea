package lesson1;

public class HW1 {


    public static void main(String[] args) {


        //2. Создать переменные всех пройденных типов данных и инициализировать их значения.
        // (Создать переменные типов: byte, short, int, long, float, double, char, boolean);

        byte a1 = 127;
        short a2 = 32767;
        int a3 = 1234567890;
        long a4 = 12346987669l;
        float a5 = 0.345F;
        double a6 = 0.345;
        char a7 = 97;//буква А.
        boolean a8 = true;

//        3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
//                где a, b, c, d – аргументы этого метода, имеющие тип float.
        System.out.println(proiz(2.7f, 4, 6, 3));

//        4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
//        в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

        System.out.println(task10and20(5, 5));

//        5. Написать метод, которому в качестве параметра передается целое число, метод должен
//        напечатать в консоль, положительное ли число передали или отрицательное. Замечание:
//        ноль считаем положительным числом.

        positiveOrNegative(-5);
        positiveOrNegative(9);

//        6. Написать метод, которому в качестве параметра передается целое число. Метод должен
//        вернуть true, если число отрицательное, и вернуть false если положительное.

        System.out.println(positiveNumber(-7));
        System.out.println(positiveNumber(7));

//        7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
//           Метод должен вывести в консоль сообщение «Привет, указанное_имя!».

        hello("Оля");
        hello("Теймур");
//        8. *Написать метод, который определяет, является ли год високосным, и выводит сообщение в
//        консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й –
//        високосный.
        leapYear(2020);
        leapYear(2019);
        leapYear(2018);
        leapYear(2017);
        leapYear(2016);
        leapYear(100);
        leapYear(400);


    }

    //3
    static float proiz(float a, float b, float c, float d) {
        return a * (b + (c / d));

    }

    //4
    static boolean task10and20(int m, int n) {
        return (m + n) >= 10 || (m + n) >= 20;
    }
//5

    public static void positiveOrNegative(int x) {

        if (x >= 0) {
            System.out.println(x + " Положительное число");
        } else {
            System.out.println(x + " Отрицательное число");
        }
    }

//6

    public static boolean positiveNumber(int g) {
        System.out.println("Число " + g + " отрицательное:");
        return (g < 0);

    }

//7
    static void hello(String name) {
        System.out.println(" Привет, " + name);
    }
//8
    public static void leapYear(int a) {
        if (a % 4 == 0 && a % 100 != 0 || a % 4 == 0 && a % 400 == 0  ) {

            System.out.println(a + " високосный");
        }else {
            System.out.println(a + " не високосный");
        }
    }


}
