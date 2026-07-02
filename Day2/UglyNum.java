import java.util.Scanner;
public class UglyNum {
    static int maxDivide(int a, int b) {
        while (a % b == 0)
            a = a / b;
        return a;
    }
    static boolean isUgly(int no) {
        no = maxDivide(no, 2);
        no = maxDivide(no, 3);
        no = maxDivide(no, 5);
        return (no == 1) ? true : false;
    }

    static int getNthUglyNo(int n) {
        int i = 1;
        int count = 1;

        while (n > count) {
            i++;
            if (isUgly(i))
                count++;
        }
        return i;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 1; i <= t; i++) {
            int n = scanner.nextInt(); 
            System.out.println(getNthUglyNo(n));
        }
        scanner.close();
    }    
}

