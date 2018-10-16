package pl.gosia;


public class Path {

    public static void findTreasure(Integer wspX, Integer wspY, Integer direction, Integer numberOfStepsY, Integer numberOfStepsX) {
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
                default: direction = 0;
        }
    }
}
