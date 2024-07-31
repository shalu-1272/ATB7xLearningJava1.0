package ex_07272024;

public class Lab122 {
    public static void main(String[] args) {
        int[][] array_2d = {
                {21, 34},
                {34, 78},
                {67, 87}

        };
        for (int i = 0; i < array_2d.length; i++) {
            for (int j = 0; j < array_2d[i].length; j++)
            {
                System.out.print(array_2d[i][j]);
                System.out.print('\t');
            }
            System.out.println();
        }
    }
}
