package racingcar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Application {



    public static void main(String[] args) throws IOException {

        List<Car> cars = new ArrayList<>();


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");

        String[] input = br.readLine().split(",");

        for (String carName : input) {
            cars.add(new Car(carName));
        }

        System.out.println("시도할 회수는 몇회인가요?");
        int n = Integer.parseInt(br.readLine());

        for (int i =0; i<n; i++) {
            for (Car car : cars) {
                car.move();
                System.out.println(car.getResult());
            }
        }

        int maxMove=0;
        for(Car car: cars) {
            maxMove = Math.max(maxMove, car.getMoveCount());
        }

        List<String> winner = new ArrayList<>();
        for (Car car : cars) {
            if (car.getMoveCount() == maxMove) {
                winner.add(car.getCarName());
            }
        }

        System.out.println("최종 우승자 : " + String.join(", ", winner));

    }


}
