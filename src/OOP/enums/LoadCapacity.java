package OOP.enums;

import static java.lang.Float.MAX_VALUE;

public enum LoadCapacity {
    N1(0f, 3.5f),
    N2(3.5f, 12f),
    N3(12f, MAX_VALUE);

    private final Float lowerBound;
    private final Float upperBound;

    LoadCapacity(Float lowerBound, Float upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }


    @Override
    public String toString() {
        if (lowerBound == null && upperBound == null) {
            return "Грузоподъемность не определена!";
        } else if (lowerBound == null) {
            return "Грузоподъемность: до " + upperBound + " тонн";
        } else if (upperBound == null) {
            return "Грузоподъемность: от " + lowerBound + " тонн";
        } else {
            return "Грузоподъемность: от " + lowerBound + " тонн до " + upperBound + " тонн";
        }
    }
}
