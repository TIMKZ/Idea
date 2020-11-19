package HW2_2;

public class MyArrayDataException extends NumberFormatException {

    public int i;
    public int j;


    MyArrayDataException(int i, int j) {
        super("Ошибка по адресу" + "[" + i + "]" + "[" + j + "]");

    }


}
