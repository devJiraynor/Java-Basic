package Chapter1.C_DataType;

//# 데이터 타입 
//? 데이터에는 자바에서 지정한 여러 종류의 타입이 존재함
//? 기본적으로 정수형, 실수형, 문자형, 논리형이 존재함
//? 추가적으로 참조형 데이터 타입이 존재함

//? 또한 기본적으로 어떤 데이터 타입으로 정의 된 변수 혹은 상수에는 동일한 데이터 타입의 데이터로만 연산이 가능함

//# 형 변환 
//? '변수'의 데이터 타입을 변경해서 사용 할 수 있도록 해주는 자바의 기능
//? 형 변환에는 자동 형변환, 강제 형변환이 존재
public class DataType {
    public static void main(String[] args) {
        //# 정수 타입 
        //! byte
        //? 1byte (-128 ~ 127) 크기의 데이터를 가질 수 있는 정수형 데이터 타입 
        byte byte1 = 127;
        byte byte2 = -128;
        //? 범위를 초과하는 데이터로는 연산 불가능
        // byte byte3 = 128;
        // byte byte4 = -129;

        //! short
        //? 2byte (-32,768 ~ 32,767) 크기의 데이터를 가질 수 있는 정수형 데이터 타입
        short short1 = 32767;
        short short2 = -32768;
        //? 범위를 초과하는 데이터로는 연산 불가능
        // short short3 = 32768;
        // short short4 = -32769;

        //! int
        //? 4byte (-2,147,483,648 ~ 2,147,483,647) 크기의 데이터를 가질 수 있는 정수형 데이터 타입
        //? 큰 수를 표현 할때 1000 단위로 _를 추가하여 표현 가능
        int int1 = 2_147_483_647;
        int int2 = -2_147_483_648;
        //? 범위를 초과하는 데이터로는 연산 불가능
        // int int3 = 2_147_483_648;
        // int int4 = -2_147_483_649;

        //! long
        //? 8byte (-2^63 ~ 2^63 - 1) 크기의 데이터를 가질 수 있는 정수형 데이터 타입
        //? 정수 타입의 리터럴 상수의 데이터 타입은 int 이기 때문에 long 타입의 데이터를 지정 할 때는 리터럴 상수 뒤에 L을 붙여야 함
        long long1 = 12_147_483_647L;
        long long2 = -12_147_483_648L;

        //# 실수 타입 
        //! float
        //? 4byte (1.4 * 10^-45 ~ 3.4 * 10^38) 크기의 데이터를 가질 수 있는 정수형 데이터 타입
        //? 실수 타입의 리터럴 상수의 데이터 타입은 double 이기 때문에 float 타입의 데이터를 지정 할 때는 리터럴 상수 뒤에 F를 붙여야 함
        float float1 = 3.14F;
        float float2 = -3.14F;
        //? float 타입은 소숫점 6자리에서 오차가 발생함

        //! double
        //? 8byte (4.9 * 10^-324 ~ 1.8 * 10^308) 크기의 데이터를 가질 수 있는 정수형 데이터 타입
        double double1 = 3.14;
        double double2 = -3.14;
        //? double 타입은 소숫점 15자리에서 오차가 발생함

        //# 문자 타입 
        //! char
        //? 2byte (0 ~ 65,535) 크기의 데이터를 가질 수 있는 문자형 테이터 타입
        //? 문자(단어가 아님) 하나를 저장 할 수 있는 공간이며 한 문자를 표현 할 땐 ''으로 표현 할 수 있음
        //? 정수로 데이터를 지정하면 해당 정수의 아스키코드에 매칭되는 문자가 대입됨
        char char1 = 'a';
        char char2 = 97;
        //? 부호가 없는 데이터 타입이므로 음수 값을 지정 할 수 없음
        // char char3 = -1;

        //# 논리 타입 
        //! boolean
        //? 1byte (0, 1) 크기의 데이터를 가질 수 있는 문자형 데이터 타입
        //? 논리형 (true, false)를 저장 할 수 있는 공간
        boolean boolean1 = true;
        boolean boolean2 = false;

        //# 형 변환 
        //! 자동 형변환 (묵시적 형변환)
        //? 차지하는 범위가 작은 데이터 타입은 범위가 큰 데이터 타입으로 자동 형변환되어 대입 됨
        //? boolean의 경우는 자동 형변환이 불가능
        short1 = byte1;
        int1 = short1;
        int1 = char1;
        long1 = int1;

        float1 = byte1;
        float1 = char1;
        float1 = short1;

        double1 = int1;
        double1 = float1;
        double1 = long1;

        //! 강제 형변환 (명시적 형병환)
        //? 차지하는 범위가 큰 데이터 타입은 범위가 작은 데이터 타입으로 대입 형변환을 명시하여 대입 함
        //? 강제 형변환의 경우 overflow(범위 초과)가 발생 할 수 있음
        byte1 = (byte) short1;
        short1 = (short) int1;
        int1 = (int) long1;

        float1 = (float) int1;
        float1 = (float) double1;

        char1 = (char) byte1;
        char1 = (char) short1;
        char1 = (char) int1;
        char1 = (char) long1;
        char1 = (char) float1;
        char1 = (char) double1;

        //# 참조형 데이터 타입 
        //! 기본 데이터 타입이 아닌 메모리 주소를 참조하는 데이터 타입
        //? 클래스
        //? 일반 데이터 타입과 다르게 첫 문자가 대문자로 시작됨
        //? 이 부분은 Class 이후 깊게 학습
        //? 대표적인 참조형 데이터 타입 String 
        //? String은 문자열을 담을 수 있는 참조형 데이터 타입
        //? 문자열을 표현할 때는 ""로 묶어서 표현
        String string1 = "This is Comment";
    }
}
