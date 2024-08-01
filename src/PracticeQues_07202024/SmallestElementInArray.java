package PracticeQues_07202024;

public class SmallestElementInArray {
    public static void main(String[] args) {
        int arr[] = {11,8,7,10};
        int min = arr[0];

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        System.out.println(min);

    }
}
