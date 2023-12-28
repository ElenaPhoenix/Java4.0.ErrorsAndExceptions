// Создайте метод doSomething(), который может быть источником одного из типов checked exceptions (тело самого метода прописывать не обязательно). 
// Вызовите этот метод из main и обработайте в нем исключение, которое вызвал метод doSomething().
package Seminar3;

import java.io.File;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void doSomething() throws IOException {
        File file = new File ("path");
    }
}
