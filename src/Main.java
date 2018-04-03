import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Student student = new Student( "林子堯", "Andy", "資訊工程學系", "linyao8712@gmail.com", "0905668993","柳豐路500號", "106021152", (short) 2, 175, 48);
        System.out.println("姓名："+student.getCname());
        System.out.println("英文姓名："+student.getEname());
        System.out.println("系別："+student.getDepartment());
        System.out.println("信箱："+student.getEmail());
        System.out.println("電話："+student.getPhone());
        System.out.println("地址："+student.getAddress());
        System.out.println("Id："+student.getId());
        System.out.println("體重："+student.getWeight());
        System.out.println("身高："+student.getHeight());
    }
}
