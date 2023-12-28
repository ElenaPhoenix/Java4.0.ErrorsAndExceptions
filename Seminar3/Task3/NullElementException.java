// Создайте класс исключений, которое будет возникать при обращении к пустому элементу в массиве ссылочного типа. Исключение должно отображать понятное для пользователя сообщение об ошибке
package Seminar3.Task3;

public class NullElementException extends NullPointerException{
    public NullElementException(int index){
        super("Обращение к null по индексу "+index);
    }
}
