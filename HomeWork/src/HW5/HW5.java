package HW5;

//  1.Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//  2.Конструктор класса должен заполнять эти поля при создании объекта.
//  3.Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//  4.Создать массив из 5 сотрудников.
//  5.С помощью цикла вывести информацию только о сотрудниках старше 40 лет. - не смог понять как это сделать

public class HW5 {

    public static void main(String[] args) {

    user[] users = new user[7];
    users[0] = new user(01, "Иванов И.И.", "Инжинер", "ivanov.i.i@hw5.ru", "123-45-67", 50000, 40);
    users[1] = new user(02, "Петров С.И.", "Инжинер", "petrov.s.i@hw5.ru", "223-45-67", 40000, 35);
    users[2] = new user(03, "Сидоров Н.Н.", "Техник", "sidorov.n.n@hw5.ru", "323-45-67", 32000, 41);
    users[3] = new user(04, "Попов В.С.", "Технолог", "popov.v.s@hw5.ru", "423-45-67", 45000, 39);
    users[4] = new user(05, "Иванова Н.С.", "Секретарь", "ivanova.n.s@hw5.ru", "523-45-67", 30000, 25);

    users[0].info();

    }

    }
