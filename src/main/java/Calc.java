public class Calc {
    int x, y, sum1, sum2= 0;

    public int add(int x, int y) {
        sum1 = x + y;
        return sum1;
    }

    public void minus(int x, int y) {
        sum2 = x - y;
    }
    public int getSum2() {
        return sum2;
    }
}
