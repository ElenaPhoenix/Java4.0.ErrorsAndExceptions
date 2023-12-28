// Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение внутренней int переменной на 1. 
// Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources. 
// Подумайте, что должно происходить при закрытии этого ресурса? Напишите метод для проверки, закрыт ли ресурс. 
// При попытке вызвать add() у закрытого ресурса, должен выброситься IOException+
package Seminar3;

import java.io.File;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        try (Counter counter = new Counter()){
                counter.add();
                counter.close();
                counter.add(); // искуственно создаем ошибку, чтобы проверить прогу
            } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void doSomething() throws IOException {
        File file = new File("path");
    }
    }

