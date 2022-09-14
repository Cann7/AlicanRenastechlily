package Day_29_OOP_Inheretance.Override.LoginExample;

public class FacebookLogin {
    private String UserName;
    private String Password;

    public void setUserName(String userName) {
        this.UserName=userName;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public String getUserName() {
        return this.UserName;
    }

    public String getPassword() {
        return this.Password;
    }

    public void OpenBrowser(){
        System.out.println("The Web Browser is created");
    }

    public void GotoURL(){
        System.out.println("Facebook.com url is navigated");
    }

    public String AddUsername(String username){
        System.out.println("The User Name added");
        return "No error Occured";

    }
    public String AddPassword(String password){
        System.out.println("The password is added");
        return "No error Occured";

    }

    public void ClickLogin(){
        System.out.println("Login is successful");
    }

    public void CloseBrowser(){
        System.out.println("Browser is closed");
    }
}
