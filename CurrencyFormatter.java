// convert user input amount into the US, Indian, Chinese, and French currency formats.
import java.util.*;
import java.text.NumberFormat;
class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        System.out.println("Enter amount:");
        Scanner sc = new Scanner(System.in);
        double payment=sc.nextDouble();
        //System.out.println(payment);
       
     
      String us=NumberFormat.getCurrencyInstance(Locale.US).format(payment);
      String india=NumberFormat.getCurrencyInstance(new Locale("en","in")).format(payment);
      String china=NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
      String france=NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
       
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france); 
    }
}
