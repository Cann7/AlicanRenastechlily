package Day_29_OOP_Inheretance.Override.LoginExample;

public class SafariFacebookLogin extends FacebookLogin{

    @Override
    public void OpenBrowser(){
        System.out.println("The Safari Browser is Created");
    }
}
