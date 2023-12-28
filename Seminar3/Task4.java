// Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
// Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать. Если в каком-то элементе массива преобразование не удалось 
// (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
// В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException и вывести результат расчета 
// (сумму элементов, при условии что подали на вход корректный массив).
package Seminar3;

import Seminar3.Task4.MyArrayDataException;
import Seminar3.Task4.MyArraySizeException;

public class Task4 {
    public static void main(String[] args) {
        String[][] array = {{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != array.length) throw new MyArraySizeException(array.length, array[i].length);
            for (int j = 0; j < array.length; j++) {
                if (!isInt(array[i][j])) throw new MyArrayDataException(i, j, array[i][j]);
                sum += Integer.parseInt(array[i][j]);
            }
        }
            System.out.println("Сумма элементов массива: "+sum);
        }
        public static boolean isInt(String number){
            try {
                Integer.parseInt(number);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
    }
