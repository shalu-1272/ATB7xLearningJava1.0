package PracticeQues_07202024;

public class SumofArrayElements {
    public static void main(String[] args) {
        int arr[] = {9,2,4,5,7};
        int sum = 0;
        //read the numbers and store and keep adding

        for(int i =0; i< arr.length; i++)
        {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
