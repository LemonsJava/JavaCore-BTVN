import java.util.Scanner;

public class BTVN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhap vao so hang va cot cua matrix A,B

        System.out.print("Moi nhap so hang cua matrix A: ");
        int rowA = Integer.parseInt(sc.nextLine());
        System.out.print("Moi nhap so cot cua matrix A: ");
        int colA = Integer.parseInt(sc.nextLine());
        System.out.print("Moi nhap so hang cua matrix B: ");
        int rowB = Integer.parseInt(sc.nextLine());
        while (rowA != rowB) {
            System.out.print("Moi ban nhap lai so hang cua matrix B: ");
            rowB = Integer.parseInt(sc.nextLine());
            continue;
        }
        System.out.print("Moi nhap so cot cua matrix B: ");
        int colB = Integer.parseInt(sc.nextLine());
        while (colB != colA) {
            System.out.print("Moi ban nhap lai so cot cua maxtrix B: ");
            colB = Integer.parseInt(sc.nextLine());
            continue;
        }

        // Khai bao/tao 2 matrix A,B

        int [][] matrixA = new int[rowA][colA];
        int [][] matrixB = new int[rowB][colB];

        System.out.println("---- Matrix A ----");
        for (int i = 0; i< rowA; i++) {
            System.out.println("Moi ban nhap cac phan tu hang thu " + (i+1));
            for (int j = 0; j< colA; j++) {
                System.out.print("Moi ban nhap cot thu " + (j+1) + " trong hang thu " + (i+1)+": ");
                matrixA[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.print("Matrix A la: ");
        for (int i = 0; i < rowA; i++) {
            System.out.println("");
            for (int j = 0; j < colB; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
        }
        System.out.println("");
        System.out.println("---- Matrix B ----");
        for (int i = 0; i < rowB; i++) {
            System.out.println("Moi ban nhap cac phan tu hang thu " + (i+1));
            for (int j = 0; j < colB; j++) {
                System.out.print("Moi ban nhap cot thu " + (j+1) + " trong hang thu " + (i+1)+": ");
                matrixB[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.print("Matrix B la: ");
        for (int i = 0; i < rowB; i++) {
            System.out.println("");
            for (int j = 0; j < colB; j++) {
                System.out.print(matrixB[i][j] + " ");
            }
        }

        // Tinh tong 2 matrix = matrix C

        System.out.println("");
        System.out.print("---- Matrix C ----");

        int [][] matrixC = new int[rowA][colA];
        for (int i = 0; i < rowA; i++) {
            System.out.println("");
            for (int j = 0; j < colA; j++) {
                matrixC[i][j] = matrixA[i][j] +matrixB[i][j];
                System.out.print(matrixC[i][j] + " ");
            }
        }

    }
}
