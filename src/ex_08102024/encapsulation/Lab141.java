package ex_08102024.encapsulation;
//Fixed Lab 140
public class Lab141 {
    public static void main(String[] args) {
        VWOLogin1 vwologin1 = new VWOLogin1("admin","Test123");
      //  vwologin1.password = "Test";
       // System.out.println(vwologin1.getUsername());
        vwologin1.setUsername("Shaloo");
        System.out.println(vwologin1.getUsername());
        vwologin1.setPassword("Test111",true);
        System.out.println(vwologin1.getPassword());

//user chnaged the passowrd - security risk
    }
}

class VWOLogin1 {
    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    public String setPassword(String password,boolean Auth){
        if(Auth){
            System.out.println("Allowed");
            this.password=password;
        }
        else {
            System.out.println("Not allowed");
        }
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public VWOLogin1(String username, String password) {
        this.password = password;
        this.username = username;
    }
}

