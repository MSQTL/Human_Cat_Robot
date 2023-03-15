package Ex2;

public class Wall implements Exercise{

    int length;
    public Wall(int length){
        this.length = length;
    }
    @Override
    public int getValue() {
        return 2;
    }

    @Override
    public int getLength() {
        return length;
    }
}

