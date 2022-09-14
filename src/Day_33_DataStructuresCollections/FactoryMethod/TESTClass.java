package Day_33_DataStructuresCollections.FactoryMethod;

public class TESTClass {
    public static void main(String[] args) {
        FactoryClass factory=new FactoryClass();

        try {
            Notifications NOT= factory.createNotification("fdjfddj");  // upcasting Polymorphism
            NOT.Notify();
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }
        System.out.println("This is the code after exception");
    }
}
