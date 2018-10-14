package pl.gosia;

public abstract class FanPrinter {
    public void createFan(Integer fanSize) {
        fanSize = Math.abs(fanSize);
        Character[][] fan = new Character[fanSize * 2][fanSize * 2];
        generateFan(fan, fanSize);
        print(fanSize, fan);
    }

    public abstract void generateFan(Character[][]fan, Integer fanSize);

    private void print(Integer fanSize, Character[][] fan) {
        for (int i = 0; i < fanSize * 2; i++) {
            for (int j = 0; j < fanSize * 2; j++) {
                System.out.print(fan[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
