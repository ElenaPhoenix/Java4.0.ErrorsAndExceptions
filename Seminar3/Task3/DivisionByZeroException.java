// Создайте класс исключения, который будет выбрасываться при делении на 0. Исключение должно отображать понятное для пользователя сообщение об ошибке.
package Seminar3.Task3;

public class DivisionByZeroException extends ArithmeticException{
    public DivisionByZeroException(){
        super("Деление на 0 запрещено!");
    }
}
