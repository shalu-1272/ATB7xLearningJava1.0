package ex_07202024;

public class Lab070 {
    public static void main(String[] args) {
        //switch never returns anything it just executes the code
        //JDK > 13 added feature switch can return a value

        char code = 'A';
        int val = switch(code) {
            case 'A':
                yield 65;

            default:
                throw new IllegalStateException("Unexpected value: " + code);
        };
    }
}
