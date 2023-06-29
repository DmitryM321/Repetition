package OOP.enums;

public enum Capacity {
    EXTRASMALL(0, 10),
    SMALL(11, 25),
    MEDIUM(40, 50),
    LARGE(60, 80),
    ESPECIALLYLARGE(100, 120);

    private final int lowerBound;
    private final int upperBound;

    Capacity(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    @Override
    public String toString() {
        if (lowerBound <= 0 && upperBound <= 0) {
            return "Вместимость не определена!";
        } else if (lowerBound <= 0) {
            return "Вместимость: до " + upperBound + " мест";
        } else if (upperBound > 120) {
            return "Вместимость: не определена";
        } else {
            return "Вместимость: от " + lowerBound + " до " + upperBound + " мест";
        }
    }
}

