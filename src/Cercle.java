public class Cercle {
    private final double  PI=3.14;

   private static   double radius;
    public  Cercle(){
    }
    public static double area( double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("area is: " + area);
        return radius;
    }
    public static double circumference(double radius){
        double circumference=Math.PI*2*radius;
        System.out.println("circumference is: "+circumference);


        return circumference;
    }




    }

