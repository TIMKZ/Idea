package HW2_2;

public class Main {
/*1. Напишите метод, на вход которого подается двумерный строковый массив размером 4х4,
    при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
Если в каком-то элементе массива преобразование не удалось
(например, в ячейке лежит символ или текст вместо числа),
должно быть брошено исключение MyArrayDataException – с детализацией,
в какой именно ячейке лежат неверные данные.

3. В методе main() вызвать полученный метод, обработать возможные
исключения MySizeArrayException и MyArrayDataException и вывести результат расчета.
    */


    public static void main(String[] args) {


        String[][] arr = new String[][]{
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"b", "4", "4", "4"}};
        try {
            try {
                int result = metodArr(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер масиива не корректный\n" + e);
            }
        } catch (MyArrayDataException e) {
            System.out.println("в массиве присутсвует символ или буква\n"
                    + e);

        }


    }

    public static int metodArr(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int summa = 0;
        if (arr.length != 4) {
            System.out.println("массив не соответсвует размеру");
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();

            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    summa = summa + Integer.parseInt(arr[i][j]);

                } catch (NumberFormatException e) {


                    throw new MyArrayDataException(i, j);
                }


            }

        }

        return summa;
    }


}
