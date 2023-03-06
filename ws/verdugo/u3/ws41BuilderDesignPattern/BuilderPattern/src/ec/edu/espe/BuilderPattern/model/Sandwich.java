
package ec.edu.espe.BuilderPattern.model;

/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class Sandwich {
    private final String bread;
    private final String cheese;
    private final String dressing;
    private final String meat;

    private Sandwich(Builder builder) {
        this.bread = builder.bread;
        this.cheese = builder.cheese;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    public static class Builder {

        private String bread;
        private String cheese;
        private String dressing;
        private String meat;

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder cheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }

        public Sandwich build() {
            return new Sandwich(this);
        }
    }

    public String getBread() {
        return bread;
    }

    public String getCheese() {
        return cheese;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}
