package app;

public enum Items {

    CAP("cap"),
    TSHIRT("t-shirt");

    private final String item;

    Items(String item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return item;
    }
}