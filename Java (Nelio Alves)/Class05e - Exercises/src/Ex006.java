import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.print("Enter a value: ");
            double value = sc.nextDouble();
            
            if(value >= 0 && value <= 25){
                System.out.println("Interval [0,25]");
            }
            else if(value > 25 && value <= 50){
                System.out.println("Interval (25,50]");
            }
            else if(value > 50 && value <= 75){
                System.out.println("Interval (50,75]");
            }
            else if(value > 75 && value <= 100){
                System.out.println("Interval (75,100]");
            }
            else{
                System.out.println("Out of interval");
                break;
            }
        }
        sc.close();
    }
    
}
