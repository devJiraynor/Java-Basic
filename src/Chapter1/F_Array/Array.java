package Chapter1.F_Array;

//# 배열 
//? 같은 타입의 변수가 나열된 형태
//? 배열은 '생성'해서 사용함, 참조 변수
//? new 연산자로 생성 할 수 있음
//? 배열은 실제 데이터가 배열에 저장되는 것이 아니라
//? 데이터가 저장되기 시작한 첫 번째 메모리 주소가 저장됨
public class Array {
    public static void main(String[] args) {
        //? 동일한 그룹의 데이터를 변수로만 사용 하여 관리할 경우
        int age1, age2, age3, age4, age5, age6, age7, age8, age9, age10;
        age1 = 19;
        age2 = 22;
        age3 = 24;
        //? 위와 같이 변수를 여러번 선언하여 사용해야 함
        //? 관리의 어려움이 존재

        //# 배열 
        //? 동일한 그룹의 변수를 묶어서 관리해주는 형태
        //? 선언 방법: 데이터타입[] 배열명;
        //? 생성 방법: 배열명 = new 배열명[배열길이];
        int[] integers1;
        integers1 = new int[10];
        //? new : 참조형 데이터 타입에서 메모리공간을 할당해 주는 연산자
        //? new 연산자로 배열을 생성 한 후 출력해보면 주소가 저장된 것을 확인 할 수 있음
        System.out.println(integers1);
        //? 초기화 방법: 배열명 = new 데이터타입[]{요소1, 요소2, ...};
        integers1 = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        //? 접근 방법: 배열명[인덱스 번호];
        //? 프로그래밍 언어에서 배열의 인덱스는 0번부터 시작함
        System.out.println(integers1);
        System.out.println(integers1[0]);
        System.out.println(integers1[1]);

        //? 앞서 사용했던 String 타입은 문자타입의 배열임
        char[] string = { 'h', 'e', 'l', 'l', 'o' };
        System.out.println(string);
        System.out.println(string.length);
        string[0] = 'k';
        System.out.println(string);

        //# 다차원 배열 
        //? 배열의 요소로 배열이 들어간 배열
        int[][] multidimensionalArray = { {1, 2, 3}, {4, 5, 6} };
    }
}
