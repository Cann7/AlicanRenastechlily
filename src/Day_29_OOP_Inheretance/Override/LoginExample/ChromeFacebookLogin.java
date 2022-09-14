package Day_29_OOP_Inheretance.Override.LoginExample;

public class ChromeFacebookLogin extends FacebookLogin{

    @Override
    public void OpenBrowser(){
        System.out.println("The Chrome Browser is Created");
    }
}
