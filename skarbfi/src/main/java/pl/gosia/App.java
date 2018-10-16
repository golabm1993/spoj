package pl.gosia;

import java.util.Scanner;

import static pl.gosia.Path.findTreasure;

/**
 * Hello world!
 */
public class App {
    private static final String WELL = "studnia";
    private static final String NORTH = "0 ";
    private static final String SOUTH = "1 ";
    private static final String EAST = "3 ";
    private static final String WEST = "2 ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer numberOfDataSets = scanner.nextInt();
        Integer numberOfTips, wspX = 0, wspY = 0;
        Integer direction, numberOfStepsX = 0, numberOfStepsY = 0;
        while (numberOfDataSets > 0) {
            numberOfTips = scanner.nextInt();
            while (numberOfTips > 0) {
                direction = scanner.nextInt();
                if (direction == 0 || direction == 1)
                    numberOfStepsY = scanner.nextInt();
                if (direction == 2 || direction == 3)
                    numberOfStepsX = scanner.nextInt();
                findTreasure(wspX, wspY, direction, numberOfStepsY, numberOfStepsX);
                numberOfTips--;
            }
            if (isWell(wspX, wspY)) {
                System.out.println(WELL);
            }
            if (wspY != 0) {
                System.out.println(calculateDirectionAndSteps(wspY, NORTH, SOUTH));
            }
            if (wspX != 0) {
                System.out.println(calculateDirectionAndSteps(wspX, EAST, WEST));
            }
            wspX = 0;
            wspY = 0;
            numberOfDataSets--;

            numberOfStepsX = 0;
            numberOfStepsY = 0;
        }
    }

    private static String calculateDirectionAndSteps(Integer value, String direction1, String direction2) {
        return value > 0 ? direction1 + value : direction2 + Math.abs(value);
    }

    private static boolean isWell(Integer wspX, Integer wspY) {
        return wspX == 0 && wspY == 0;
    }

}
