package PracticeQues_07202024;

public class ReverseArray {
    public static void main(String[] args) {
        //Shaloo - reverse

        //String[] name = new String[1];
        int name[] = {1,2,3,4,5};
        int n = name.length; //storing the length
        //1,2,3,4,5 -> 5,4,3,2,1
        //original array
        //another array with same length to store reverse

        //reverse the array = 5 4 3 2 1
        for(int i =0; i<n/2; i++)
        {
            int temp = name[i];
            name[i] = name[n-1-i];
            name[n-1-i] = temp;
            }
        for(int i = 0; i< n;i++)
        {
            System.out.print(name[i]+ " ");
        }

        }
    }

