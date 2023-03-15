package Ex2;

public class Treadmill implements Exercise{

    int length;
    public Treadmill(int length) {
        this.length = length;
    }
    @Override
    public int getValue() {
        return 1;
    }

    @Override
    public int getLength() {
        return length;
    }
}

