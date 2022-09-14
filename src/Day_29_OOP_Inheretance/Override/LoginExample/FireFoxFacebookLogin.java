package Day_29_OOP_Inheretance.Override.LoginExample;

public class FireFoxFacebookLogin extends FacebookLogin{

    @Override
    public void OpenBrowser(){
        System.out.println("The FireFox Browser is Created");
    }
}
