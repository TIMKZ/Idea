package HW5;

public class user {
    private  int id;
    private String surnameName;
    private String postion;
    private String eMail;
    private String phone;
    private int salary;
    private int age;

    public user(int id, String surnameName, String postion, String eMail, String phone, int salary, int age) {
        this.id = id;
        this.surnameName = surnameName;
        this.postion = postion;
        this.eMail = eMail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    public void info() {
        System.out.println("ФИО: " + surnameName + "\nДолжность: " + postion +
                "\nE-mail: " + eMail + "\nТелефон: " + phone + "\nЗарплата: " +
                salary + "\nВозврат: " + age);

    }

    public int getAge() {
        return age;
    }
}
