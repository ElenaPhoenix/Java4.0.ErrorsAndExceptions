package Seminar3.Task4;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException(int m, int n){
        super(String.format("Размер массива %d на %d некорректный", m, n));
    }
}
