package Chapter1.E_Operator;

//# 연산자 
//? 산술연산, 대입연산, 비교연산, 논리연산, 삼항연산
public class Operator {
    public static void main(String[] args) {
        //# 산술 연산자 
        //! 사칙연산과 관련된 기본 연산자
        int a = 10;
        int b = 7;

        //? + : 덧셈 연산자 - 좌항에 우항을 더한 값을 반환
        int plus = a + b;

        //? - : 뺄셈 연산자 - 좌항에 우항을 뺀 값을 반환
        int minus = a - b;

        //? * : 곱셈 연산자 - 좌항에 우항을 곱한 값을 반환
        int times = a * b;

        //? / : 나눗셈 연산자 - 좌항에 우항을 나눈 값을 반환
        int division1 = a / b;
        //? int / int의 경우 연산결과를 int로만 받을 수 있기 때문에 연산 결과의 실수부는 소멸됨
        //? 좌항과 우항 중 하나라도 실수형이 존재한다면 실수형태로 연산 결과를 받을 수 있음
        double division2 = a / (double) b;
        
        //? % : 나머지 연산자 - 좌항에 우항을 나눈 나머지를 반환
        int remainder = a % b;

        //? ++, -- : 증감연산자 - '변수'에 1을 증가 혹은 감소 시킴
        int increase = 10;
        //? 증감 연산자를 후위에 작성하면 출력 후 증가
        System.out.println(increase++);
        System.out.println(increase);
        //? 증감 연산자를 전위에 작성하면 증가 후 출력
        System.out.println(++increase);
        System.out.println(increase);
        
        int decrease = 10;
        //? 증감 연산자를 후위에 작성하면 감소 후 증가
        System.out.println(decrease--);
        System.out.println(decrease);
        //? 증감 연산자를 전위에 작성하면 감소 후 출력
        System.out.println(--decrease);
        System.out.println(decrease);

        //# 대입 연산자 
        //! 좌항에 우항을 대입하는 연산자

        //? = : 좌항에 우항을 대입, 프로그래밍 언어에서는 '='는 같다의 의미가 아님, 같다의 의미는 '=='
        int int1 = 10;

        //? += : 좌항에 우항을 더한 값을 좌항에 저장
        int1 += 7;
        System.out.println(int1);

        //? -= : 좌항에 우항을 뺀 값을 좌항에 저장
        int1 -= 8;
        System.out.println(int1);

        //? *= : 좌항에 우항을 나눈 값을 좌항에 저장
        int1 *= 3;
        System.out.println(int1);

        //? /= : 좌항에 우항을 나눈 값을 좌항에 저장 (정수형일 경우 몫만 저장)
        int1 /= 4;
        System.out.println(int1);

        //? %= : 좌항에 우항을 나눈 나머지를 좌항에 저장
        int1 %= 3;
        System.out.println(int1);

        //# 비교 연산자 
        //! 좌항을 우항과 비교하는 연산자
        int ten = 10;
        int nine = 9;;
        boolean boolean1;

        //? == : 좌항이 우항과 같은지 비교하여 같다면 true, 아니면 false를 반환
        boolean1 = ten == nine;
        System.out.println(boolean1);
        
        //? != : 좌항이 우항과 다른지 비교하여 다르다면 true, 아니면 false를 반환
        boolean1 = ten != nine;
        System.out.println(boolean1);
        
        //? > : 좌항이 우항보다 큰지 비교하여 크면 true, 아니면 fasle를 반환
        boolean1 = ten > nine;
        System.out.println(boolean1);
        
        //? > : 좌항이 우항보다 크거나 같은지 비교하여 크거나 같으면 true, 아니면 fasle를 반환
        boolean1 = ten >= nine;
        System.out.println(boolean1);
        
        //? > : 좌항이 우항보다 작은지 비교하여 작으면 true, 아니면 fasle를 반환
        boolean1 = ten < nine;
        System.out.println(boolean1);
        
        //? > : 좌항이 우항보다 작거나 같은지 비교하여 작거나 같으면 true, 아니면 fasle를 반환
        boolean1 = ten <= nine;
        System.out.println(boolean1);

        //# 논리 연산자 
        //! 논리 값을 연산하는 연산자
        boolean true1 = true;
        boolean false1 = false;
        boolean boolean2;

        //? && : 좌항과 우항이 모두 true일 때 true를 반환, 둘 중 하나라도 false이면 false를 반환
        boolean2 = true1 && true1;
        System.out.println(boolean2);
        boolean2 = false1 && true1;
        System.out.println(boolean2);

        //? || : 좌항과 우항 중 하나라도 true이면 true를 반환, 모두 fasle이면 fasle를 반환
        boolean2 = true1 || false1;
        System.out.println(boolean2);
        boolean2 = false1 || false1;
        System.out.println(boolean2);

        //? ! : 피연산자의 역을 반환
        boolean2 = false1;
        System.out.println(boolean2);

        //! 논리 연산자의 특성
        //? 논리연산자 && , || 연산자의 특성상
        //? && 연산자의 경우 연산과정 중 false를 만나면 뒤에 오는 모든 연산을 진행하지 않음
        //? || 연산자의 경우 연산과정 중 true를 만나면 뒤에 오는 모든 연산을 진행하지 않음
        int comparedInt = 10;
        boolean boolean3;

        boolean3 = comparedInt != 10 && ++comparedInt == 11;
        System.out.println(comparedInt);

        boolean3 = comparedInt == 10 || ++comparedInt != 11;
        System.out.println(comparedInt);

        //# 삼항 연산자 
        //! 항이 3개인 연산자 조건에 따라 true일 때 false일 때 결과를 다르게 반환하는 연산자
        //? 조건 ? true일 때 반환값 : false일 때 반환값
        int comparedInt2 = 20;
        String resultComment;

        resultComment = comparedInt2 > 0 ? "양수입니다." : "음수입니다.";
        System.out.println(resultComment);
    }
}
