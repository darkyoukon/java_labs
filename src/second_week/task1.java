package second_week;

public class task1 {

    public static void main(String[] args) {
        double a = 3;
        double b = 2.5;
        double c = -0.5;

        //PUT YOUR CODE HERE
        double x1, x2;
        double d = Math.pow(b,2) - 4 * a * c;
        if(a == 0 && b == 0 || d < 0) {
            System.out.println("x1=");
            System.out.println("x2=");
            return;
        } else if(a == 0 && c == 0) {
            x1 = x2 = 0d;
        } else if(a == 0) {
            x1 = x2 = -c / b;
        } else {
            x1 = (-b + Math.sqrt(d)) / (2*a);
            x2 = (-b - Math.sqrt(d)) / (2*a);
        }
        System.out.println("x1=" + x1);
        System.out.println("x2=" + x2);
        //PUT YOUR CODE HERE
    }
}