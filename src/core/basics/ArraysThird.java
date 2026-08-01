package core.basics;

public class ArraysThird {
    public static void main(String[] args) {
        int n = 5; // Размер квадратной матрицы
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            int start, end;

            // Определяем границы для заполнения единицами
            if (i < n / 2) {
                start = i;
                end = n - 1 - i;
            } else {
                start = n - 1 - i;
                end = i;
            }

            // Заполняем строку: единицы внутри диапазона, нули снаружи
            for (int j = start; j <= end; j++) {
                matrix[i][j] = 1;
            }
        }

        // Вывод матрицы на экран
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
