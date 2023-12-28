// Запишите в файл следующие строки:
// Анна=4;
// Елена=5;
// Марина=6;
// Владимир=?
// Константин=?
// Иван=4
// Реализуйте метод, который считывает данные из файла и сохраняет двумерный массив (либо HashMap). В отдельном методе нужно пройти по структуре данных, если сохранено значение ?, 
// заменить его на соответствующее число. Если в к-л месте встречается символ, отличный от числа или ?, бросить подходящее исключение. Записать в тот же файл данные с замененными символами ?.
package Seminar2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        String path = "Seminar2/Names.txt";
        writeToFile(modify(getNames(path)), path);
    }
    public static List<String[]> getNames(String path){
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            List<String[]> names = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null){
                names.add(line.split("="));
            }
            return names;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    public static List<String[]> modify(List<String[]> names){
        for (String[] row : names) {
            if (!(row[1].equals("?")) && !isValid(row[1])){
                throw new RuntimeException("Некорректные данные: "+row[0]+"->"+row[1]);
            }
            row[1] = String.valueOf(row[0].length());
        }
        return names;
    }
    public static void writeToFile(List<String[]> names, String path){
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new File(path));
            for (String[] row : names){
                pw.println(row[0]+"="+row[1]);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally{
            if (pw != null) pw.close(); // записываемые файлы нужно всегда закрывать, читаемые - нет
        }
    }
    public static boolean isValid(String testString){
        try {
            Integer.parseInt(testString);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
