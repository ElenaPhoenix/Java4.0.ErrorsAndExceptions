// Создайте класс исключения, который будет выбрасываться при делении на 0. Исключение должно отображать понятное для пользователя сообщение об ошибке.
// Создайте класс исключений, которое будет возникать при обращении к пустому элементу в массиве ссылочного типа. Исключение должно отображать понятное для пользователя сообщение об ошибке
// Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл. Исключение должно отображать понятное для пользователя сообщение об ошибке.
package Seminar3;

import Seminar3.Task3.DivisionByZeroException;
import Seminar3.Task3.NonExistentFileException;
import Seminar3.Task3.NullElementException;

public class Task3 {
    public static void main(String[] args) {
    try{
        int a = 5 / 0;
    } catch (ArithmeticException ae){
        try {
            throw new DivisionByZeroException();
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }
    try{
        throw new NullElementException(3);
    } catch (NullElementException e){
        System.out.println(e.getMessage());
    }
    try{
        throw new NonExistentFileException("path");
    } catch (NonExistentFileException e){
        System.out.println(e.getMessage());
    }
}
}