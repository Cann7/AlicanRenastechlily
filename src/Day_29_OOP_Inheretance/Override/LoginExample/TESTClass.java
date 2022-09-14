package Day_29_OOP_Inheretance.Override.LoginExample;

public class TESTClass {
    public static void main(String[] args) {

        FacebookLogin log =new FacebookLogin();
        log.setPassword("Handsome_0989");
        log.setUserName("Cevdet0219");
        log.OpenBrowser();
        log.GotoURL();
        //System.out.println(log.getUserName());
        //System.out.println(log.getPassword());
        String uname= log.getUserName();
        //String pword = log.getPassword();

        System.out.println(log.AddUsername(uname));
        System.out.println(log.AddPassword(log.getPassword()));

        log.ClickLogin();
        log.CloseBrowser();

        System.out.println("**********************************");

        ChromeFacebookLogin crlog = new ChromeFacebookLogin();
        crlog.setPassword("Serdar_@2343");
        crlog.setUserName("Serdar1212");
        System.out.println("The password : " +crlog.getPassword());
        System.out.println("The UserName : " +crlog.getUserName());
        crlog.OpenBrowser();

    }
}
