package ex_08102024.encapsulation;

//Encapsulation
public class Lab140 {
    public static void main(String[] args) {
        VWOLogin vwologin = new VWOLogin("admin","Test123");
        vwologin.password = "Test";
        System.out.println(vwologin.password);
//user chnaged the passowrd - security risk
    }
}

class VWOLogin{
    public String username;
    public String password;

    public VWOLogin(String password, String username) {
        this.password = password;
        this.username = username;
    }
}
