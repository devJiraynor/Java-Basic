package Chapter1.A_Variable;

//# 1. 변수 
//? 모든 프로그래밍 언어는 데이터를 보관할 수 있는 변수가 존재함
//? 쉽게 말해 변수는 데이터를 담을 수 있는 열려 있는 상자

//? 변수는 반드시 선언 후 초기화 해야 사용할 수 있음
//? 선언: 사용할 변수를 만드는 행위
//? 초기화: 변수에 초기 데이터를 담는 행위

public class Variable {
    public static void main(String[] args) {
        //! 변수 선언 방법
        //? 데이터타입 변수명;
        int numberVar;

        //! 변수 초기화 방법
        //? 변수명 = 데이터;
        numberVar = 10;

        //! 선언과 동시에 초기화
        //? 데이터타입 변수명 = 데이터;
        double doubleVar = 10.00;

        //! 변수 명명 규칙
        //? lowerCamelCase
        //? 첫문자는 소문자로 지정하고 띄어 쓰기는 제거후 다음에 오는 문자를 대문자로 지정
        //? 자바 변수는 lowerCamelCase를 따르는것이 개발자간의 암묵적인 룰
    }
}
