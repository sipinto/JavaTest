import java.util.Scanner;

public class StringTest2 {
    public static void main(String a[]) {
        String str;
        Scanner sc = new Scanner (System.in);

        while (true) {
            System.out.println("문자열을 입력하세요> ");
            str = sc.next();
            if (str.equals("quit") == true)
                break;
            if (str.maches("^www\\.(.+)")){
                System.out.println(str + " 은 'www'로 시작합니다. ")
            } else {
                System.out.println(str + " 은 'www'로 시작하지 않습니다.")
            }
        }

    }

}