package ex_08172024.WrapperClass;

public class Lab162 {
    public static void main(String[] args) {
        //OC oc = new OC();

    }
    }
    //Nested Class
    class OC
    {
        Integer a = 10;
        /**void m1()
        {
           // System.out.println(b);
        } **/

        class IC{
            Integer b = 10;
            void m2()
            {
                System.out.println(a); //IC can access the OC instances
            }
        }
    }
