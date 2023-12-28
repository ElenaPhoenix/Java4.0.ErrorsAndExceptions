package Seminar3.Task4;

public class MyArrayDataException extends RuntimeException{
    public MyArrayDataException(int i, int j, String value){
        super(String.format("Некорректный элемент %s на позиции [%d, %d]", value, i, j));
    }
}