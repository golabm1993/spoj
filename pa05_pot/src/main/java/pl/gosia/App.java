package pl.gosia;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] argumetns) {
        Scanner scanner = new Scanner(System.in);
        Integer numberOfCases = scanner.nextInt();
        Long basis = null, index = null;
        while (numberOfCases > 0) {
            basis = scanner.nextLong();
            index = scanner.nextLong();
            Integer lastNumberOfExponation = lastNumber(basis, index);
            System.out.println(lastNumberOfExponation);
            numberOfCases--;
        }
    }

    private static Integer lastNumber(Long basis, Long index) {
        Integer lastNumberOfExponation = null;
        Long lastNumberOfBasis = basis % 10;
        switch (lastNumberOfBasis.intValue()) {
            case 0:
                lastNumberOfExponation = 0;
                break;
            case 1:
                lastNumberOfExponation = 1;
                break;
            case 2: {
                if (index % 4 == 1)
                    lastNumberOfExponation = 2;
                else if (index % 4 == 2)
                    lastNumberOfExponation = 4;
                else if (index % 4 == 3)
                    lastNumberOfExponation = 8;
                else if (index % 4 == 0)
                    lastNumberOfExponation = 6;
            }
            break;
            case 3: {
                if (index % 4 == 1)
                    lastNumberOfExponation = 3;
                else if (index % 4 == 2)
                    lastNumberOfExponation = 9;
                else if (index % 4 == 3)
                    lastNumberOfExponation = 7;
                else if (index % 4 == 0)
                    lastNumberOfExponation = 1;
            }
            break;
            case 4: {
                if (index % 2 == 1)
                    lastNumberOfExponation = 4;
                else if (index % 2 == 0)
                    lastNumberOfExponation = 6;
            }
            break;
            case 5:
                lastNumberOfExponation = 5;
                break;
            case 6:
                lastNumberOfExponation = 6;
                break;
            case 7: {
                if (index % 4 == 1)
                    lastNumberOfExponation = 7;
                else if (index % 4 == 2)
                    lastNumberOfExponation = 9;
                else if (index % 4 == 3)
                    lastNumberOfExponation = 3;
                else if (index % 4 == 0)
                    lastNumberOfExponation = 1;
            }
            break;
            case 8: {
                if (index % 4 == 1)
                    lastNumberOfExponation = 8;
                else if (index % 4 == 2)
                    lastNumberOfExponation = 4;
                else if (index % 4 == 3)
                    lastNumberOfExponation = 2;
                else if (index % 4 == 0)
                    lastNumberOfExponation = 6;
            }
            break;
            case 9: {
                if (index % 2 == 1)
                    lastNumberOfExponation = 9;
                else if (index % 2 == 0)
                    lastNumberOfExponation = 1;
            }
            break;
            default:
                lastNumberOfExponation = 0;
                break;
        }
        return lastNumberOfExponation;
    }

}
