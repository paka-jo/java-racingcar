package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

    private int moveCount;
    private String carName;

    public Car(String carName) {
        if(carName.length() > 5) {throw new IllegalArgumentException("차이름은 5자 이하가 되어야 됩니다");}
        this.carName = carName;
    }

    public void move() {
        if( Randoms.pickNumberInRange(0,9)>=4) {
            moveCount++;
        }
    }

    public String getResult() {
        return carName + " : " + "-".repeat(moveCount);
    }

    public String getCarName() {
        return carName;
    }
    public int getMoveCount() {
        return moveCount;
    }
}