//Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл. Исключение должно отображать понятное для пользователя сообщение об ошибке.
package Seminar3.Task3;

import java.io.FileNotFoundException;

public class NonExistentFileException extends FileNotFoundException{
    public NonExistentFileException(String path){
        super("Несуществующий файл по пути: "+path);
    }
}
