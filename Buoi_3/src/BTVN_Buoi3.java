import java.util.Scanner;

public class BTVN_Buoi3 {
    public static void main(String[] args) {
        System.out.println("Nhap vao gia tri cua a:");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Nhap vao gia tri cua b");
        double b = new Scanner(System.in).nextDouble();
        System.out.println("Nhap vao phep tinh can thuc hien:");
        String calculator = new Scanner(System.in).nextLine();

        switch (calculator) {
            case "+":
                System.out.println("Gia tri phep cong la: "+ (a + b));
                break;
            case "-":
                System.out.println("Gia tri phep tru la: "+ (a - b));
                break;
            case "*":
                System.out.println("Gia tri phep nhan la: "+ (a * b));
                break;
            case "/":
                System.out.println("Gia tri phep chia lay phan nguyen la: "+ (a / b));
                break;
            case "%":
                System.out.println("Gia tri phep chia lay phan du la: "+ (a % b));
                break;
            default:
                System.out.println("Moi nhap lai phep tinh !!!");
                break;
        }
    }
}
