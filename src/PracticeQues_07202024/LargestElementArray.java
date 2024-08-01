package PracticeQues_07202024;

public class LargestElementArray {
    public static void main(String[] args) {
        int [] arr = {1,5,7,9,17};
        int max = 0;
        for(int i =0; i< arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }

        }
        System.out.println(max);

    }
}
