import java.sql.SQLOutput;
import java.util.Scanner;

public class Rectangle {
    double width,height;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter height: ");
        double height = scanner.nextDouble();
//      Khởi tạo đối tượng rectangle thông qua lớp Rectangle
        Rectangle rectangle = new Rectangle(width,height);
//        Gọi phương thức đã tạo
        System.out.println("Your rectangle: " + rectangle.display());
        System.out.println("Area of rectangle is: " + rectangle.getArea());
        System.out.println("Perimeter of rectangle is: " + rectangle.getPerimeter());
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.height * this.width;
    }
    public double getPerimeter(){
        return (this.height + this.width) * 2;
    }
    public String display(){
        return "Rectangle{Width: " + width + ", Height: " + height + "}";
    }
}
