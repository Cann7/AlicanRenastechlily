package Day_32_Polymorhism.RunTimePoly;

public class Samsung extends Phone implements GooglePlay{
    @Override
    public void GooglesOtherApps() {
        System.out.println("GooglePlay Can have other apps");
    }

    @Override
    void Texting() {
        System.out.println("Samsung "+model+ " can text");
    }

    @Override
    void Calling() {
        System.out.println("Samsung "+model+ " can call");
    }

    @Override
    public void downloadable() {
        System.out.println("Tinder is downloadable in Samsung "+model);
    }
    public void OwnMethod(){
        System.out.println("Samsung "+model+ " is for "+price);
    }
}
