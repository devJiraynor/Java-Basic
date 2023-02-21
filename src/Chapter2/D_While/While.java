package Chapter2.D_While;

//# while 반복문 
//? 일반적으로 반복 횟수가 정해져 있지 않을 때 사용하는 반복문
public class While {
    public static void main(String[] args) {
        //! while 반복문
        //? 조건을 검사하고 해당 조건이 true일 경우 코드 블럭을 반복하는 반복문
        //? if문의 반복문 형태라 볼 수 있음
        //? 반복할 실행문이 종료되면 조건을 다시 검사하고 true이면 반복, false이면 반복문 탈출
        //? 사용방법 :
        //? while (조건) { 실행되는 코드 }
        int number = 0;

        while(number < 20) {
            System.out.println(number);
            number += 2;
        }

        //? while 문의 경우 코드 블럭에 오는 실행할 코드가 한 줄일 경우
        //? {} 를 제거하고 사용 가능
        number = 0;
        while (number < 20) System.out.println(number++);

        //? 실행 코드내에서 조건에서 검사하는 변수가 변화하지 않으면
        //? 무한 루프에 빠지게 됨
        number = 0;
        while (number < 20) System.out.println(number);

        //! do - while 문
        //? 실행할 코드 블럭을 무조건 한번 실행 한 후 조건을 검사하는 반복문
        //? 사용방법:
        //? do { 실행되는 코드 } while (조건);
        do {
            System.out.println(number);
            number += 2;
        } while (number < 20);
    }
}
