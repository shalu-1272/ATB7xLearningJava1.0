package PracticeQues_07202024;

public class SearchingforanArrayLinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,6,7,19,10};
        int key = 100;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = true;
                System.out.println("The key has been sound at index" + '\t' + i);
                break;
            }
        }
        if(!found)
        {
                System.out.println("Could not find");
            }
        }
    }

