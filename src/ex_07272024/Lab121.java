package ex_07272024;

public class Lab121 {
    public static void main(String[] args) {
        int[][]array_2d = {
                {31, 34, 55},
                {35, 56, 78},
                {89, 67, 65}
        };
        //R -3 (i <=2)
        //C-3 (j<=2)
        for(int i=0;i<array_2d.length;i++)
        {
            for (int j = 0; j <array_2d.length; j++)
            {
                System.out.print(array_2d[i][j]);
               System.out.print('\t');

            }
            System.out.println();
        }
    }
}
