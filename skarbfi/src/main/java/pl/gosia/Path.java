package pl.gosia;

import java.util.Scanner;

public class Path {

    public static void findTreasure(Integer wspX, Integer wspY, Integer direction, Integer numberOfStepsY, Integer numberOfStepsX) {
        Scanner scanner = new Scanner(System.in);
        if (direction == 0 || direction == 1)
            numberOfStepsY = scanner.nextInt();
        if (direction == 2 || direction == 3)
            numberOfStepsX = scanner.nextInt();
        switch (direction) {
            case 0:
                wspY += numberOfStepsY;
                break;
            case 1:
                wspY -= numberOfStepsY;
                break;
            case 2:
                wspX -= numberOfStepsX;
                break;
            case 3:
                wspX += numberOfStepsX;
                break;
        }
    }
}
