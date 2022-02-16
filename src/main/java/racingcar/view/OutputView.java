package racingcar.view;

import racingcar.model.Car;
import racingcar.model.Cars;

public class OutputView {
    private static final String TRIAL_RESULT = System.lineSeparator() + "실행 결과";
    private static final String WINNER_MESSAGE = "가 최종 우승했습니다.";
    private static final String COLON = " : ";
    private static final String DASH = "-";
    private static final int MINIMUM_POSITION = 0;

    public static void printCarPosition(Cars cars) {
        cars.getCars().forEach(OutputView::printCarResult);
        System.out.println();
    }

    private static void printCarResult(Car car) {
        System.out.println(car.getName().getName() + COLON + makeDash(car.getPosition()));
    }

    private static String makeDash(int position) {
        return DASH.repeat(Math.max(MINIMUM_POSITION, position));
    }

    public static void printTrialResult() {
        System.out.println(TRIAL_RESULT);
    }

    public static void printWinnerName(String winnerName) {
        System.out.println(winnerName + WINNER_MESSAGE);
    }
}
