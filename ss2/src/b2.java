package ss2.src;


public class b2 {
    public static void main(String[] args) {
        System.out.println("20 so nguyen dau tien");
        int number = 2;
        int count = 0;
        while (count < 20) {
            Boolean isPrime = true;
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(count+1 + ". " + number);
                count++;
            }
            number++;
        }
    }
}
