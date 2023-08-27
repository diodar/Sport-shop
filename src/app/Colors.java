package app;

public enum Colors {
    RED("red"),
    BLUE("blue"),
    BLACK("black"),
    WHITE("white");

    private final String color;

    Colors(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}