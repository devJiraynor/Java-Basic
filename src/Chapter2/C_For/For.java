package Chapter2.C_For;

//# For 반복문 
//? 규칙이 있는 작업을 반복하는 제어문
//? 일반적으로 반복 횟수가 정해져 있을 때 사용하는 반복문
public class For {
    public static void main(String[] args) {
        //# 반복문을 사용하는 이유 
        //? 길이가 5인 int 타입의 배열을 선언해서 초기화
        int[] numberArray5 = new int[5];
        numberArray5[0] = 1;
        numberArray5[1] = 2;
        numberArray5[2] = 3;
        numberArray5[3] = 4;
        numberArray5[4] = 5;

        //? 길이가 5인 배열을 위와 같이 초기화 할 수 있음
        //? 길이가 20인 배열을 초기화 하려하면 
        int[] numberArray20 = new int[20];
        numberArray20[0] = 1;
        numberArray20[1] = 2;
        numberArray20[2] = 3;
        numberArray20[3] = 4;
        numberArray20[4] = 5;
        numberArray20[5] = 6;
        numberArray20[6] = 7;
        numberArray20[7] = 8;
        numberArray20[8] = 9;
        numberArray20[9] = 10;
        numberArray20[10] = 11;
        numberArray20[11] = 12;
        numberArray20[12] = 13;
        numberArray20[13] = 14;
        numberArray20[14] = 15;
        numberArray20[15] = 16;
        numberArray20[16] = 17;
        numberArray20[17] = 18;
        numberArray20[18] = 19;
        numberArray20[19] = 20;

        //? 위와 같이 동일한 작업을 지속적으로 작성해야 함

        //! for 반복문 
        //? 특정 변수가 증감하며 조건에 부합할 때 까지 반복하는 반복문
        //? 사용 방법 :
        //? for (변수 선언 혹은 초기화; 조건; 증감식) { 실행되는 코드 }

        //? 변수 선언 혹은 초기화 : 반복문을 위해 사용할 변수를 선언 혹은 초기화
        //? 조건 : 반복을 계속하기 위한 조건, 조건이 true이면 반복, false면 반복문 탈출
        //? 실행되는 코드 : 조건이 true일 때 실행되는 코드

        for (int index = 0; index < numberArray20.length; index++) {
            numberArray20[index] = index + 1;
        }

        //? for 문의 경우 코드 블럭에 오는 실행할 코드가 한 줄일 경우
        //? {} 를 제거하고 사용 가능
        for (int index = 0; index < numberArray20.length; index++)
            numberArray20[index] = index + 1;

        //! foreach 반복문
        //? 배열의 요소 값을 직접 사용하고자 할 때 배열을 반복하면서
        //? 요소를 하나씩 복사해서 사용할 수 있음
        //? 사용 방법: for (배열요소의데이터타입 변수명: 배열) { 실행할 코드 }
        for (int number: numberArray20) System.out.println(number); 
    }
}
