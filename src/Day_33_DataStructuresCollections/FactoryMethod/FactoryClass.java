package Day_33_DataStructuresCollections.FactoryMethod;

public class FactoryClass {

    public Notifications createNotification(String type){

        if (type.length() == 0){
            return null;
        } else if (type.equalsIgnoreCase("SMS")) {
            return new SMSNotification();
        } else if (type.equalsIgnoreCase("email")) {
            return new EmailNotification();

        } else if (type.equalsIgnoreCase("push")) {
            return new PushNotification();

        }else {
            throw new IllegalArgumentException();
        }
    }
}
