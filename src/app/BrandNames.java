package app;

public enum BrandNames {

    ACTIVESPORTS("Active Sports"),
    SMARTCAPS("Smart Caps");

    private final String brandName;

    BrandNames(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return brandName;
    }
}