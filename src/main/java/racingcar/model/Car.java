package racingcar.model;

import racingcar.util.NumberGenerator;

public class Car {
    private static final int MINIMUM_POSITION = 0;
    private static final int MOVE_FORWARD = 4;
    private static final int MAXIMUM_CAR_NAME_LENGTH = 5;

    private final Name name;
    private int position;

    public Car(Name name, int position) {
        this.name = name;
        this.position = position;
        validateCarNameLength(name);
    }

    public Car(Name name) {
        this(name, MINIMUM_POSITION);
    }

    private void validateCarNameLength(Name carName) {
        boolean isValidLength = carName.getName().length() <= MAXIMUM_CAR_NAME_LENGTH;
        if (!isValidLength) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하여야 합니다.");
        }
    }

    public void move(NumberGenerator numberGenerator) {
        int number = numberGenerator.generate();
        if (canMove(number)) {
            position++;
        }
    }

    private boolean canMove(int number) {
        return number >= MOVE_FORWARD;
    }

    public String getName() {
        return name.getName();
    }

    public int getPosition() {
        return position;
    }
}
