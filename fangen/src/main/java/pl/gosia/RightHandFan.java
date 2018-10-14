package pl.gosia;

public class RightHandFan extends FanPrinter {
    @Override
    public void generateFan(Character[][] fan, Integer fanSize) {
        for (int i = 0; i < fanSize; i++) {
            for (int j = 0; j < fanSize; j++) {
                generateFan(fan, fanSize, i, j);
            }
        }
    }

    private void generateFan(Character[][] fan, Integer fanSize, int i, int j) {
        fan[j][i] = j <= i ? '*' : '.';
        fan[fanSize + i][fanSize + j] = fan[j][i];
        fan[fanSize * 2 - 1 - i][0 + j] = fan[j][i];
        fan[0 + i][fanSize * 2 - 1 - j] = fan[j][i];
    }
}
