package pl.gosia;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer fanSize;

        do {
            fanSize = scanner.nextInt();
            if(fanSize == 0)
                break;
            preprocessAction(fanSize);
        } while (true);
    }

    private static void preprocessAction(Integer fanSize) {
        FanPrinter fanPrinter = fanSize > 0 ? new LeftHandFan() : new RightHandFan();
        fanPrinter.createFan(fanSize);
    }
}
