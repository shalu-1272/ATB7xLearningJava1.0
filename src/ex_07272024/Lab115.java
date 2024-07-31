package ex_07272024;

public class Lab115 {
    public static void main(String[] args) {
        final int age[] = new int[4];  //final is fixing the length of array
        // not values and anyhow length can't be changed once defined
        age[3] = 78;
        System.out.println(age[3]);
    }
}
