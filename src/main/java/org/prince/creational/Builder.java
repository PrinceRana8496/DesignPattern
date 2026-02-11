package org.prince.creational;

class Pizza {

    private String size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean mushrooms;

    // Private constructor
    private Pizza(Builder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.mushrooms = builder.mushrooms;
    }
    public static class Builder {

        private String size;
        private boolean cheese;
        private boolean pepperoni;
        private boolean mushrooms;

        public Builder(String size) {   // mandatory field
            this.size = size;
        }

        public Builder cheese(boolean value) {
            this.cheese = value;
            return this;
        }

        public Builder pepperoni(boolean value) {
            this.pepperoni = value;
            return this;
        }

        public Builder mushrooms(boolean value) {
            this.mushrooms = value;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", mushrooms=" + mushrooms +
                '}';
    }
}

public class Builder {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder("Large")
                .cheese(true)
                .pepperoni(true)
                .mushrooms(false)
                .build();
        Pizza p1=new Pizza.Builder("Medium").cheese(true).build();
        System.out.println(p1);
    }
}
