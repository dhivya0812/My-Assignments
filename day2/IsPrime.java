package week1.day2;

public class IsPrime {
    public static void main(String[] args) {
        int n = 29; 
        boolean Prime = true;

        if (n <= 1) {
            Prime = false;   
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {  
                Prime = false;
                break;
            }
        }

        if (Prime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
    }
}
