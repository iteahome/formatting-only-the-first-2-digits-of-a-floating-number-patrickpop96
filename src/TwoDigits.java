import java.util.Scanner;

public class TwoDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String number=sc.next();
        String[] tokens= number.split("\\.");
        System.out.println(tokens[0]+"."+tokens[1].substring(0,2));
    }
}
