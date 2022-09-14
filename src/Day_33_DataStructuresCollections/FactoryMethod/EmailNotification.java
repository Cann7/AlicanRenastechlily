package Day_33_DataStructuresCollections.FactoryMethod;

public class EmailNotification implements Notifications{
    @Override
    public void Notify() {

        System.out.println("Email notification is sent");
    }
}
