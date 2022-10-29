import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        nextNum(num);


    }
    public static void nextNum (int a){
        a = ( (a / 2) + 1 ) * 2;
        System.out.println(a);
    }
}