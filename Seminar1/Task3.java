// Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
// Метод должен пройтись по каждому элементу и проверить что он не равен null.
// А теперь реализуйте следующую логику:
// Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
// Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить
public class Task3 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,null,3,null};
        checkArr(arr);
    }
    public static void checkArr(Integer[] arr){
        StringBuilder nullIndexes = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null){
                nullIndexes.append(" ");
            }
        }
        if (nullIndexes.length() != 0){
            throw new RuntimeException("Индексы null: "+ nullIndexes);
        }
        System.out.println("null-значений нет");
    }
}
