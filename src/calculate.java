import java.util.Scanner;

public class calculate {

    public static void calculate() {
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

    public static void main(String[] args) {
        calculate();
    }
}

