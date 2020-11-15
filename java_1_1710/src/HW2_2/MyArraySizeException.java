package HW2_2;

public class MyArraySizeException extends IndexOutOfBoundsException {
    public MyArraySizeException() {
        super("Массив не соответствует размеру 4х4");
    }

}
