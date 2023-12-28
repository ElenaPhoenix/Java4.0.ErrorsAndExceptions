// Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке, разделенные пробелом:
// Фамилия Имя Отчество датарождения номертелефона пол

// Форматы данных:
// фамилия, имя, отчество - строки
// датарождения - строка формата dd.mm.yyyy
// номертелефона - целое беззнаковое число без форматирования
// пол - символ латиницей f или m.

// Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым, вернуть код ошибки, обработать его и показать пользователю сообщение, 
// что он ввел меньше и больше данных, чем требуется. Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры. 
// Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы. Можно использовать встроенные типы java и создать свои. Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно.
// Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, в него в одну строку должны записаться полученные данные, вида
// <Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>
// Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
// Не забудьте закрыть соединение с файлом.
// При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано, пользователь должен увидеть стектрейс ошибки.
package Seminar3;

import java.io.IOException;
import java.util.Scanner;

import Seminar3.HomeworkTask1.UserData;
import Seminar3.HomeworkTask1.UserDataException;
import Seminar3.HomeworkTask1.UserDataFileWriter;
import Seminar3.HomeworkTask1.UserInputConsoleReader;
import Seminar3.HomeworkTask1.UserInputReader;

public class HomeworkTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UserInputReader inputReader = new UserInputConsoleReader(scanner);
        UserDataFileWriter fileWriter = new UserDataFileWriterImpl();

        try {
            UserData userData = inputReader.readUserData();
            fileWriter.writeUserData(userData);
        } catch (UserDataException | IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}