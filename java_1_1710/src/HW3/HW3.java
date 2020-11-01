package HW3;

import java.util.Random;
import java.util.Scanner;

public class HW3 {
    // 1. Написать программу, которая загадывает случайное число от 0 до 9 и
    // пользователю дается 3 попытки угадать это число.
    // При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число,
    // чем загаданное, или меньше.
    // После победы или проигрыша выводится запрос – «Повторить игру еще раз?
    // 1 – да / 0 – нет»(1 – повторить, 0 – нет).

    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        while (true) {
            int guess = random.nextInt(9);
            System.out.println(guess);
            int answer;
            int maxLives = 3; //количество попыток
            int exit = 0; //команда выхода
            System.out.println("Отгадайте число от 0 до 9: ");

            for (int lives = 1; lives <= maxLives; lives++) {
                answer = scanner.nextInt();
                if (answer == guess) {
                    System.out.println("Победа!!! Число было: " + guess);
                    System.out.println("Продолжить игру? 1 - да, 0 - выход");
                    exit = scanner.nextInt();
                    if (exit == 0) {
                        return; // возвращает в начало цикла
                    } else {
                        break;
                    } // выход из цикла
                } else if (answer > guess) {
                    System.out.println("Вы не отгадали, ваше число больше, у вас осталось попыток " + (maxLives - lives));
                } else if (answer < guess) {
                    System.out.println("Вы не отгадали, ваше число меньше, у вас осталось попыток " + (maxLives - lives));
                }
                if (maxLives == lives) {
                    System.out.println("***Game Over***\nЧисло было: " + guess);
                    System.out.println("Продолжить игру? 1 - да, 0 - выход");
                    exit = scanner.nextInt();
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
