package Chapter2.B_Switch;

//# switch 조건문 
//? 비교할 변수를 case 값과 비교하여 같은 case를 찾아 해당 case 구문부터 끝까지 실행
//? break 문으로 해당 case를 종료 함
//? default 문으로 해당하는 case가 없을때 실행할 구문을 작성
public class Switch {
    public static void main(String[] args) {
        //# switch 
        //? 사용 방법:
        //? switch (비교할 변수) {
        //? case 값1:
        //?     비교할 변수 값이 값1과 같을 경우 실행
        //? case 값2:
        //?     비교할 변수 값이 값2와 같을 경우 실행
        //?     break;
        //? default:
        //?     비교할 변수 값과 일치하는 값이 없을 경우 실행
        //? }

        //? break 문을 만나기 전까지 모두 실행됨
        //? 즉, switch문은 조건에 따라서 코드 실행 범위를 지정하는 것
        //? if 조건문과는 다름
        int chapter = 1;

        switch (chapter) {
            case 1:
                System.out.println("기본문법 공부");
            case 2:
                System.out.println("제어문 공부");
            case 3:
                System.out.println("객체지향 기본 공부");
            case 4: 
                System.out.println("객체지향 응용 공부");
            case 5:
                System.out.println("쓰레드 및 예외 공부");
                // break;
            case 6:
                System.out.println("자바 고급 공부");
                // break;
            default:
                System.out.println("범위 초과");
        }
    }
}
