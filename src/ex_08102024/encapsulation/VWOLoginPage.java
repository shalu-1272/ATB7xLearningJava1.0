package ex_08102024.encapsulation;

public class VWOLoginPage {
    private String username;
    private String password;
    private String SignInButton;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getSignInButton() {
        return SignInButton;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSignInButton(String signInButton) {
      this. SignInButton = signInButton;
    }

    public void setUsername(String username) {
        this.username = username;


    }
}
