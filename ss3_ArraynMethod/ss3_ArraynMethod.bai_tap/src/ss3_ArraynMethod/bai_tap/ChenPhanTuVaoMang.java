package ss3_ArraynMethod.bai_tap;
import java.util.Scanner;

public class ChenPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();

        }

        System.out.print("Nhập giá trị cần chèn: ");
        int x = scanner.nextInt();
        System.out.print("Nhập vị trí cần chèn: ");
        int index = scanner.nextInt();

        if (index < 0 || index > n - 1) {
            System.out.println("Vị trí chèn không hợp lệ!");
            return;
        }

        for (int i = n - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = x;

        System.out.println("Mảng sau khi chèn:");
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
