package PracticeQues_07202024;

public class SecondHighestNum {
    public static void main(String[] args) {
        int salary[] = {7,10,4,13,25,18,9,8,17};
        int max = 1;
        int secondhighest = 0;
        for(int i =0; i < salary.length;i++)
        {
            if(salary[i]>max)
            {
                max = salary[i];
            }

        }
    }
}
