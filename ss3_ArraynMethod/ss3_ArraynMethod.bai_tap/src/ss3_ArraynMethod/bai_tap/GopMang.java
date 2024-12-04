package ss3_ArraynMethod.bai_tap;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập kích thước của mảng 1: ");
        int n1 = scanner.nextInt();
        System.out.print("Nhập kích thước của mảng 2: ");
        int n2 = scanner.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        System.out.println("Nhập các phần tử của mảng 1:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Nhập các phần tử của mảng 2:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        int[] arr3 = new int[n1 + n2];

        for (int i = 0; i < n1; i++) {
            arr3[i] = arr1[i];
        }

        for (int i = 0; i < n2; i++) {
            arr3[n1 + i] = arr2[i];
        }

        System.out.println("Mảng sau khi gộp:");
        for (int i = 0; i < n1 + n2; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}