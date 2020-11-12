package HW2_1;

import HW2_1.animal.*;
import HW2_1.it.*;

public class Main {

/*    1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
    Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).*/

//    public class Treadmill{
//
//    }


    public static void main(String[] args) {


        Animal[] animals = {
                new Human("Вася"),
                new Cat("Кузя")
        };
        It[] its = {
                new Robot("Вектор")
        };

        for (int i=0 ; i < animals.length;  i++ ) {
            animals[i].run(1000);
            animals[i].jump(40);

        }
        for (int i = 0; i < its.length; i++) {
            its[i].run(1000);
            its[i].jump(40);

        }

//        Human human = new Human("Вася", 4000, 50 );
//        Cat cat = new Cat("Барсик", 1000, 200);
//        Robot robot = new Robot("Робот Вектор", 100000, 100);

//        Participants [] participants = {
//                new Human("Вася"),
//                new Cat("Барсик"),
//                new Robot("Робот Вектор")
//
//        }

//        human.jump();
//        cat.jump();
//        robot.jump();
//        human.run();
//        cat.run();
//        robot.run();

    }


}
