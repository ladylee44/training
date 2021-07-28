import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int n;
        System.out.println("Nhap vao mot so nguyen:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n >= 0) {
            System.out.println("day la nguyen duong");
        } else {
            System.out.println("day la nguyen am");
        }
    }
}
