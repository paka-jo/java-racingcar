package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        Scanner sc = new Scanner(System.in);

        String[] input = sc.next().split(",");

        System.out.println("시도할 회수는 몇회인가요?");
        int num = sc.nextInt();

        System.out.println("실행 결과");
        int random = Randoms.pickNumberInRange(0, 9);

        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i] + " : " + random);
        }
    }
}
