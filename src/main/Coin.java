public class Coin {
    private final String name;
    private final double chance;
    private final int value;
    private final String feature;
    private final int existenceDuration;
    private final String description;

    private Coin(String name,
                 double chance,
                 int value,
                 String feature,
                 int existenceDuration,
                 String description) {
        this.name = name;
        this.chance = chance;
        this.value = value;
        this.feature = feature;
        this.existenceDuration = existenceDuration;
        this.description = description;
    }

    public static class Builder {
        private String name;
        private double chance;
        private int value;
        private String feature;
        private int existenceDuration;
        private String description;
        public Builder (String name, double chance, int value) {
            this.name = name;
            this.chance = chance;
            this.value = value;
        }
        public Builder setFeature(String feature) {
            this.feature = feature;
            return this;
        }
        public Builder setExistenceDuration(int existenceDuration) {
            this.existenceDuration = existenceDuration;
            return this;
        }
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }
        public Coin build() {
            return new Coin(name, chance, value, feature, existenceDuration, description);
        }
    }

    void showStats() {
        System.out.println("Name: " + name);
        System.out.println("Chance: " + chance);
        System.out.println("Value: " + value);
        System.out.println("Feature: " + feature);
        System.out.println("Existence Duration: " + existenceDuration);
        System.out.println("Description: " + description);
    }
}
