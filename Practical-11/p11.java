import java.util.Scanner;
 class Shape {
       public static float getArea(int r){
       return (float)3.14 * r * r;
       }
    public static float getArea(int height , int base){
       return (height * base) / 2;
    }
public static float getArea(int width , int heigth , char a){
       return getArea(width , heigth) * 2;
       }
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Radius of Circle");
        int r = scanner.nextInt();
System.out.println("Area of Cirlce is -> " + getArea(r));
    System.out.println("Enter Base and Height of Triange  ");
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        System.out.println("Area of Triange is -> " + getArea(h , b));
        System.out.println("Enter Width and Height of Rectange ");
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        System.out.println("Area of Rectangle is -> " + getArea(width , height ,'c'));
   }
}


