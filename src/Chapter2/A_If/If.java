package Chapter2.A_If;

//# if 조건문 
//? 특정한 조건을 만족하면 수행할 작업과 만족하지 않을 때 수행할작업을 지정한 제어문
public class If {
    public static void main(String[] args) {
        //# if 문 
        //? 단순 if 문
        //? 조건이 true이면 실행하는 구문
        //? 사용 방법: if (조건) { 조건이 true일 때 실행 할 코드 }
        //? 조건: 결과가 true / false로 반환되는 변수 또는 식
        int age = 24;
        if (age > 19) {
            System.out.println("성인입니다.");
        }
        //? if 문의 경우 코드 블럭에 오는 실행할 코드가 한 줄일 경우
        //? {} 를 제거하고 사용 가능
        if (age > 19) System.out.println("성인입니다.");

        //# if else 문 
        //? 조건이 true일 경우와 false일 경우 실행되는 코드를 각각 지정한 구문
        //? 사용 방법: if (조건) { 조건이 true일 때 실행 할 코드 } else { 조건이 false일 때 실행 할 코드 }
        if (age > 19) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년자입니다.");
        }
        //? if 문과 마찬가지로 else 문도 코드 블럭에 오는 실행할 코드가 한 줄일 경우
        //? {} 를 제거하고 사용 가능
        if (age > 19) System.out.println("성인입니다.");
        else System.out.println("미성년자입니다.");

        //# 중첩 if 문 
        //? if 문 안에 if 문을 사용
        if (age <= 19) {
            if (age < 8) System.out.println("미취학 아동입니다.");
            else System.out.println("청소년입니다.");
        } else {
            System.out.println("성인입니다.");
        }

        if (age > 19) System.out.println("성인입니다.");
        else {
            if (age < 8) System.out.println("미취학 아동입니다.");
            else System.out.println("청소년입니다.");
        }

        //# if - else if - else 문 
        //? 중첩 if 문의 응용 
        //? else 문의 코드 블럭에 오는 코드가 한 줄일 때 {}를 제거 할 수 있음을 이용
        if (age > 19) System.out.println("성인입니다");
        else if (age < 8) System.out.println("미취학 아동입니다.");
        else System.out.println("청소년입니다.");
    }
}
