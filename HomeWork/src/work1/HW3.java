package work1;
import java.util.Random;
import java.util.Scanner;

public class HW3 {

    /*1. Написать программу, которая загадывает случайное число от 0 до 9,
    и пользователю дается 3 попытки угадать это число.
    При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное,
    или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»
    (1 – повторить, 0 – нет).
     */

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        while (true) {
            int exit = 0;


            int number = random.nextInt(10); // генерация случайного числа 0-100
            System.out.println("Угадайте число от 0 до 10");

            System.out.println(number); // увидеть какое число загадано рандомно

            int maxTryCount = 3; //количество попыток

            for (int tryCount = 1; tryCount <= maxTryCount; tryCount++) {

                int userAnswer = sc.nextInt();
                if (number == userAnswer) {
                    System.out.println("Поздравляем, вы угадали \n Повторить игру - 1, выход - 0");
                    exit = sc.nextInt();
                    if (exit == 0) {
                        return;
                    } else {
                        break;
                    } //выход из цикла

                } else if (userAnswer > number) {
                    System.out.println("Ваше число больше, чем загадал компьютер. " + "\nУ вас осталось, попыток: " + (maxTryCount - tryCount));


                } else if (userAnswer < number) {
                    System.out.println("Ваше число меньше, чем загадал компьютер. " + "\nУ вас осталось, попыток: " + (maxTryCount - tryCount));
                }

                if (tryCount == maxTryCount) {
                    System.out.println("Вы проиграли! \n Повторить игру - 1, выход - 0");
                    exit = sc.nextInt();
                    if (exit == 0) {
                        return;
                    } else {
                        break;
                    }


                }
            }
        }
    }
}











