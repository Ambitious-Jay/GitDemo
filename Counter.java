public class Counter {
    int value = 0;

    Counter(int startVal) {
        value = startVal;
    }

    public void increment(int val) {
        value += val;
    }

    public void decement(int val) {
        value -= val;
    }
}
