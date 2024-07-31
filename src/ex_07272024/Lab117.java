package ex_07272024;

public class Lab117 {
    public static void main(String[] args) {
       // System.out.println(args[0]);
        if(args.length>0) {
            for(int i=0; i< args.length; i++)
            {
                System.out.println(args[i]);
            }
        }
            else
            {
                System.out.println("No Arguments");
            }

        }
    }

