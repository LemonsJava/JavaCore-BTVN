import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Buoi2 {
    public static void main(String[] args) {


        // Bài 2

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên hàng nhập kho: ");
        String nameProduct = scanner.nextLine();

        System.out.println("Mời bạn nhập ngày tháng năm sinh (yyyy/MM/dd): ");
        String birthDay = scanner.nextLine();
        LocalDate localDate = LocalDate.parse(birthDay, DateTimeFormatter.ofPattern("yyyy/MM/dd"));


        System.out.println("Mời bạn nhập thời gian nhập hàng (yyyy/MM/dd HH:mm:ss): ");
        String timeString = scanner.nextLine();
        LocalDateTime localDateTime = LocalDateTime.parse(timeString, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

        System.out.println("Mời bạn nhập thời gian (HH:mm:ss): ");
        String timeNow = scanner.nextLine();
        LocalTime localTime = LocalTime.parse(timeNow, DateTimeFormatter.ofPattern("HH:mm:ss"));


        System.out.println("----------------");
        System.out.println("Tên hàng vừa nhập là: " + nameProduct);
        System.out.println("Ngày tháng năm sinh vừa nhập là: " + localDate);
        System.out.println("Thời gian nhập hàng là: " + localDateTime);
        System.out.println("Thời gian vừa nhập là: " + localTime);
        System.out.println("----------------");
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        System.out.println("Thời gian hiện tại là: " + localDateTimeNow);
        System.out.println("Thời gian của 3 ngày sau là:" + localDateTimeNow.plusDays(3));

    }
}
