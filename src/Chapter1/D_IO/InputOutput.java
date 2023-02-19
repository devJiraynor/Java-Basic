package Chapter1.D_IO;

import java.util.Scanner;

//# 입 출력 
//? console을 통해서 사용자로 입력을 받을 땐 Scanner 객체를 사용
//? console로 데이터를 출력할 땐 System객체를 사용
public class InputOutput {
    public static void main(String[] args) {
        //# 출력 
        //? System.out.println(변수 | 데이터);
        System.out.println("이것을 문자열 리터럴 상수입니다.");
        String comment = "이것은 변수에 저장된 문자열입니다.";
        System.out.println(comment);
        //? System.out.println(변수 | 데이터)의 변수 | 데이터 에는 모든 타입의 데이터가 들어 갈 수 있음
        System.out.println(100);
        int int1 = 10;
        System.out.println(int1);

        //# 입력 
        //? Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        //? 입력을 받고자 하는 데이터의 타입에 해당하는 next타입 메서드를 사용하여 입력을 받을 수 있음
        int int2 = scanner.nextInt();
        double double1 = scanner.nextDouble();
        String string1 = scanner.nextLine();
    }
}
