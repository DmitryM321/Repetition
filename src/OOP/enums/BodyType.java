package OOP.enums;

public enum BodyType {
 SEDAN("Седан"), HATCHBACK("Хетчбек"),  COUPE("Купе"),
    UNIVERSAL("Универсал"),  OFFROAD("Внедорожник"), PICKUP("Пикап");
    private final String bodyType;

    BodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }

    @Override
    public String toString() {
        return "Тип кузова = " + bodyType ;
    }
}
