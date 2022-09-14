package Day_25ClassesandObjects;

public class ShoeClassandInstance {

    double size;
    String color;
    String Brand;

    public void Print(){

        System.out.println("The Shoe is : "+ Brand+ " Size: " + size + " The Color : " +color);

    }
    public double IncreaseSize(double a){
        size= size+a;
        return size;
    }
    public void ChangeColor(String clr){
        color =clr;
    }

    public static void main(String[] args) {
        ShoeClassandInstance Shoe1 = new ShoeClassandInstance();  // we havent default the objects we havent assing it yet
        Shoe1.Brand="Nike";
        Shoe1.color="Red";
        Shoe1.size=9.5;
        Shoe1.Print();

        double newSize =Shoe1.IncreaseSize(1.5);
        System.out.println("The New size is : "+newSize);

        System.out.println("The size of shoe is : "+Shoe1.size);

        Shoe1.ChangeColor("Blue");

        Shoe1.Print();



    }


}
