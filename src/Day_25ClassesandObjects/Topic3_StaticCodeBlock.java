package Day_25ClassesandObjects;

public class Topic3_StaticCodeBlock {

    // Instance code block will get executed only if you create an instance(Object) of that class

    {
        System.out.println("Hello from code block");
    }

    static {
        System.out.println("Hello from Static Code block");
    }
    // Staic code blocks get executed before anything else

    public static void main(String[] args) {
        System.out.println("Tis is Ziya");

        Topic3_StaticCodeBlock newST=new Topic3_StaticCodeBlock();
    }
}
