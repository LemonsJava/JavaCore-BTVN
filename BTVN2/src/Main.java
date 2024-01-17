public class Main {
    public static void main(String[] args) {
        String s = "I love you";
        System.out.println("Chuỗi s ban đầu là: " + s);
        System.out.println("Chuỗi s mới là: " + s + " forever ");

        String s2 = s.substring(0,8);
        System.out.println("Chuỗi s sau khi cắt là: " + s2);

        String s3 = s.substring(0,2);
        //System.out.println(s3);
        String s4 = s.substring(2,6);
        //System.out.println(s4);
        String s5 = s.substring(6,10);
        //System.out.println(s5);
        String s6 = "hate";
        System.out.println("Thay đổi chuỗi s từ \"I love you\" thành \"I hate you\" là: " + s3 + s6 + s5);

    }

}
