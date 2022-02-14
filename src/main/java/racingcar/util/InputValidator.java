package racingcar.util;

import java.util.List;

public class InputValidator {
    private static final int MINIMUM_CAR_NAME_LENGTH = 5;

    public static void validateCarName(List<String> carNameList) {
        if (!carNameList.stream().allMatch(carName -> carName.length() <= MINIMUM_CAR_NAME_LENGTH)) {
            throw new IllegalArgumentException("자동차의 이름은 5자 이하여야 합니다.");
        }
    }

    public static void validateNameInput(String carNames) {
        if (carNames.isEmpty()) {
            throw new IllegalArgumentException("최소 1개 이상의 자동차가 입력되어야 합니다.");
        }
    }

    public static void validateTrialInput(String number) {
        try {
            Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도할 횟수는 숫자여야 합니다.");
        }
    }

    public static void validateDuplicateName(List<String> carNameList) {
        long distinctNum = carNameList.stream().distinct().count();
        if (distinctNum != carNameList.size()) {
            throw new IllegalArgumentException("자동차의 이름에 중복이 포함되면 안됩니다.");
        }
    }
}
