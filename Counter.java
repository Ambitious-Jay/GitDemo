public class Counter {
    int value = 1;

    Counter(int startVal) {
        value = startVal;
    }

    public void increment(int val) {
        value += val;
    }
    public void decrement(int val) {
        value -= 1;
        value -= val;
    }
}
