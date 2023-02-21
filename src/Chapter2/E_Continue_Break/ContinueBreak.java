package Chapter2.E_Continue_Break;

//# 반복 제어 
//? continue, break 키워드를 사용하여 반복분을 제어 할 수 있음
public class ContinueBreak {
    public static void main(String[] args) {
        //! continue
        //? 반복문이 코드 실행 중 continue 문을 만나게 되면
        //? 해당 코드 아래에 있는 로직을 무시하고
        //? 다음 반복을 실행하기 위한 조건 검사를 진행함
        for (int index = 0; index < 20; index++) {
            if (index % 2 != 0) continue;
            System.out.println(index);
        }

        //! break
        //? 반복문이 코드 실행 중 break 문을 만나게 되면
        //? 해당 코드 아래에 있는 로직을 무시하고
        //? 반복문이 즉시 종료 됨
        for (int index = 0; index < 2000; index++) {
            if (index == 20) break;
            System.out.println(index);
        }
    }
}
