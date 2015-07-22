public class HelloWorld{

    public static void printCube(int x){
        System.out.println( x * x * x );
    }
    
     public static void main(String []args){
        double u = 5.0;
        double t = 20.0;
        final double a = -9.81;
        
        double s = u * t + 0.5 * a * t * t;
        double v = u + a * t;
        System.out.println(s);
        System.out.println(v);
        printCube(3);
        
     }
}
