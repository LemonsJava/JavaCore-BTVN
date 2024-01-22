import java.util.Scanner;

public class BTVN1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Moi ban nhap so hang: ");
        int rows =Integer.parseInt(sc.nextLine());
        System.out.print("Moi ban nhap so cot: ");
        int cols = Integer.parseInt(sc.nextLine());
        int [][] arrInt = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            System.out.println("Moi ban nhap hang thu "+ (i+1));
            for (int j = 0; j < cols; j++) {
                System.out.print("Moi ban nhap cot thu " + (j+1) + " trong hang thu " + (i+1)+": ");
                arrInt[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.print("Mang vua nhap la:");
        for (int i = 0; i < rows; i++) {
            System.out.println("");
            for (int j = 0; j < cols; j++) {
                System.out.print(arrInt[i][j] + " ");
            }
        }

        System.out.println("");

        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += arrInt[i][j];
            }
        }
        System.out.println("Tong cac phan tu trong mang la: " + sum);

        // Tong cac phan tu chia het cho 3

        int sum2 = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arrInt[i][j] % 3 == 0) {
                    sum2 += arrInt[i][j];
                }
            }
        }
        System.out.println("Tong cac phan tu chia het cho 3 la: " + sum2);

    }
}
