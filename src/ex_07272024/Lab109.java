package ex_07272024;

public class Lab109 {
    public static void main(String[] args) {
        //another way to create an array using new operator
        int arr[] = new int[3];  //3 defines length i.e we can store 3 element
        //3 is the length and index would be 0,1,2
        //there is no value stored as of now
        //default value is 0
        System.out.println(arr[0]);
//now if you want to assign a value 0- 91, 1 - 92, 2-93
        arr[0] = 91; //we can also use scanner to give input
        arr[1] = 92;
        arr[2] = 93;
        System.out.println(arr[2]);
        System.out.println(arr[10]);
        //how to traverse an array - using a loop
    }
}
