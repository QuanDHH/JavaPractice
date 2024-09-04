import java.util.Scanner;

public class Main {
    public static long result(String str){
        long number = 0;
        for (int i = 0; i < str.length(); i++){
            char chr = str.charAt(i);
            switch (chr){
                case '0':
                case '8':
                case '9':
                    number = number * 10;
                    break;
                case '1':
                    number = number * 10 + 1;
                    break;
                default:
                    return 0;
            }
        }
        return number;
    }

    public static void main(String[] args){
        Scanner getInput = new Scanner(System.in);
        int cases = getInput.nextInt();
        while (cases-- > 0){
            String str = getInput.next();
            if (result(str) == 0) System.out.println("INVALID");
            else System.out.println(result(str));
        }
    }
}