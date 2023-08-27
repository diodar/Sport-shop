package app;

public record ItemBuilder(Items item, Colors color, BrandNames brandNames, int cost) {

    public ItemBuilder(Builder builder) {
        this(builder.item, builder.color, builder.brandName, builder.cost);
    }

    @Override
    public String toString() {
        return "Item: " + item +
                ", Color: " + color +
                ", Brand: " + brandNames +
                ", Cost:" + cost +
                "was successfully delivered and added to the stock";
    }

    public static class Builder {

        private final Items item;
        private final Colors color;
        private BrandNames brandName;
        private int cost;


        public Builder(Items item, Colors color) {
            if (item == null || color == null) {
                throw new IllegalArgumentException("item and color" +
                        "can not be null");
            }
            this.item = item;
            this.color = color;
        }

        public Builder withCost(int cost) {
            this.cost = cost;
            return this;
        }

        public Builder withBrandName(BrandNames brandName) {
            this.brandName = brandName;
            return this;
        }

        public ItemBuilder build() {
            return new ItemBuilder(this);
        }
    }
}

