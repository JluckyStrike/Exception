package com.gb.lessons;

public class Main {

    public static void main(String[] args) {
        //String[][] matrix = new String[4][4];
        String[][] arr = {
                {"1", "1!", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3 ", "3", "3"},
                {"4", "4", "4", "4"}
                /*{"5", "5", "5", "5"}*/
        };
        outputMatrix(arr);
    }

    public static void outputMatrix(String[][] matrix) {
        int sum = 0;
        if (matrix.length != 4)
            throw new MyArraySizeException("1.Метод ожидает матрицу 4x4, когда у вас: " + matrix.length + "x" + matrix[0].length);
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != 4) {
                throw new MyArraySizeException("2.Метод ожидает матрицу 4x4, когда у вас: " + matrix.length + "x" + matrix[i].length);
            }
            for (int j = 0; j < matrix[i].length; j++) {
                try {
                    sum += Integer.parseInt(matrix[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        System.out.println(sum);
    }
}
