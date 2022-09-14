package Day_32_Polymorhism.RunTimePoly;

public class TEST {
    public static void main(String[] args) {

        Samsung sm =new Samsung();

        sm.model="Galaxy s12";
        sm.price=800;   //
        sm.Calling();  // from Phone Abstract Class
        sm.downloadable();
        sm.OwnMethod();  // its own method.

        System.out.println("***************************************");

        Iphone ip = new Iphone();
        ip.model="Iphone 12";
        ip.price=1100;
        ip.Calling();
        ip.Texting();
        ip.OwnMethod();
        ip.downloadable();
        ip.AppleOtherApps();



    }
}
