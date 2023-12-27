// Реализуйте метод, принимающий в качестве аргументов двумерный массив. Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова, 
// детализировать какие строки со столбцами не требуется. Как бы вы реализовали подобный метод.
public class Task4 {
    public static void main(String[] args) {
        int[][] m = {{0, 1},{1, 0}};
        System.out.println(counter(m));
    }
    public static boolean counter(int[][] matrix){
        int[] num = getCountColumns(matrix);
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != num[i])
            return false;
        }
        return true;
    }

    public static int[] getCountColumns(int[][] matrix){
        StringBuilder counter = new StringBuilder();
        int max=0;
        for (int[] row : matrix) {
            if (row.length > max)
            max = row.length;
        }
        int[] maxElements = new int [max];
        for (int [] row : matrix) {
            for (int i = 0; i < row.length; i++) {
                maxElements[i] +=1;
            }
        }
        return maxElements;
    }
}
