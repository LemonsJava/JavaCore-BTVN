import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Moi nhap so luong nhan vien: ");
        int n = Integer.parseInt(sc.nextLine());
        Employee[] nv = new Employee[n];


        for(int i = 0; i < nv.length; i++) {
                System.out.println("Moi nhap id: ");
                int id = Integer.parseInt(sc.nextLine());
                System.out.println("Moi nhap ten:");
                String name = sc.nextLine();
                System.out.println("Moi nhap tuoi: ");
                int age = Integer.parseInt(sc.nextLine());
                System.out.println("Moi nhap kinh nghiem lam viec: ");
                double exp = Double.parseDouble(sc.nextLine());

                nv[i] = new Employee(id,name,age,exp);

        }

        for(Employee emp : nv){
            System.out.println(emp);
        }







    }
}
