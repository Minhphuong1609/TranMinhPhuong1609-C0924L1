package ss3_ArraynMethod.bai_tap;

import java.util.Scanner;

public class TimPhanTuLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số hàng của ma trận: ");
        int hang = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cot = scanner.nextInt();

        int[][] matrix = new int[hang][cot];
        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int max = matrix[0][0];
        int hangMax = 0;
        int cotMax = 0;
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    hangMax = i;
                    cotMax = j;
                }
            }
        }

        System.out.println("Phần tử lớn nhất là: " + max);
        System.out.println("Tọa độ của phần tử lớn nhất là: (" + hangMax + ", " + cotMax + ")");
    }
}

