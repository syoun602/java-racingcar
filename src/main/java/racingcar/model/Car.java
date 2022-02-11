package racingcar.model;

public class Car {
    public static final int MINIMUM_POSITION = 0;
    public static final int MOVE_FORWARD = 4;
    private final String name;
    private int position;

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public Car(String name) {
        this(name, MINIMUM_POSITION);
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void move(int number) {
        if (canMove(number)) {
            position++;
        }
    }

    public boolean canMove(int number) {
        return number >= MOVE_FORWARD;
    }
}
