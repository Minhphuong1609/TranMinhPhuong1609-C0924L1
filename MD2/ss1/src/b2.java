package ss1.src;

import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rate = 25384.0;
        System.out.print("Nhap tien USD: ");
        double usd = Double.parseDouble(scanner.nextLine());
        double vnd = usd * rate;
        System.out.println("Kq :" + vnd + " VND.");
    }
}
