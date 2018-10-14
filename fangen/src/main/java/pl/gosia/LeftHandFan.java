package pl.gosia;

public class LeftHandFan extends FanPrinter {
    @Override
    public void generateFan(Character[][] fan, Integer fanSize) {
        for (int i = 0; i < fanSize; i++) {
            for (int j = 0; j < fanSize; j++) {
                generateFan(fan, fanSize, i, j);
            }
        }
    }

    private void generateFan(Character[][] fan, Integer fanSize, int i, int j) {
        fan[i][j] = j <= i ? '*' : '.';
        fan[fanSize * 2 - i - 1][fanSize * 2 - j - 1] = fan[i][j];
        fan[fanSize + i][fanSize - j - 1] = fan[i][j];
        fan[fanSize - i - 1][fanSize + j] = fan[i][j];
    }
}
