// Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение. Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
// если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
// если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
// если вместо массива пришел null, метод вернет -3
// придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
// Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, этот метод запросит искомое число у пользователя, вызовет первый, обработает возвращенное значение 
// и покажет читаемый результат пользователю. Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.
public class Task1 {
    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4, 5};
            printMessage(arr(testArray, 4, 3));
            printMessage(arr(testArray, 7, 3));
            printMessage(arr(testArray, 4, 8));
            printMessage(arr(null, 4, 3));
            
}  
public static int arr(int[] array, int num, int value){
        if (array == null) return -3;
        if (array.length < num) return -1;
        int result=-2;
        for (int i  = 0; i < array.length; i++) {
            if (array[i] == value) {
                result = i;
                break;
            }
        }
        return result;
    }
    public static void printMessage(int errorCode){
        switch (errorCode){
            case -3:
                System.out.println("Вместо массива пришел null");
                break;
            case -1:
                System.out.println("Длина массива меньше заданного");
                break;
            case -2:
                System.out.println("Элемент не найден");
                break;
            default:
                System.out.println("Индекс элемента"+errorCode);
        }
    }
}