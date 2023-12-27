// Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
// Необходимо посчитать и вернуть сумму элементов этого массива.
// При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
// Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
public class Task2 {
    public static void main(String[] args) {
//        int[][] m = {{0, 1, 0},{1, 0}};
//        System.out.println("Сумма элементов равна: "+sumOfElements(m));
//       int[][] n = {{0, 2},{1, 0}};
//        System.out.println("Сумма элементов равна: "+sumOfElements(n));
        int[][] n = {{0, 1},{1, 0}};
        System.out.println("Сумма элементов равна: "+sumOfElements(n));
    }
    public static int sumOfElements(int[][] matrix){
        int height = matrix.length;
        int sum=0;
        for (int[] row : matrix) {
            if (row.length != height) {
                throw new RuntimeException(String.format("Матрица не квадратная. Есть строка длины %d, " + "всего строк %d ", row.length, height));
            }
            for (int num : row) {
                if (num !=0 && num != 1) {
                    throw new RuntimeException(String.format("В матрице есть число %d, отличное от 0 и 1", num));
                }
                sum+=num;
            }
        }
        return sum;
    }
}
