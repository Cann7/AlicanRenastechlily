package Day_32_Polymorhism.RunTimePoly;

public class Iphone extends Phone implements AppStore{

    @Override
    public void AppleOtherApps() {
        System.out.println("Iphone "+model+ " Can download the other apps");
    }


    @Override
    void Texting() {
        System.out.println("Iphone "+model+ " Is Texting");
    }

    @Override
    void Calling() {
        System.out.println("Iphone "+model+ " Is Calling");
    }

    @Override
    public void downloadable() {
        System.out.println("Tinder is Downloadable from Iphone");
    }
    public void OwnMethod(){
        System.out.println("Iphone "+model+ " is for "+price);
    }
}
