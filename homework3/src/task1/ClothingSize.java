package task1;

public enum ClothingSize {
    XXS(30){
        @Override
        String getDescription() {
            return "XXS";
        }
    },
    XS(32){
        @Override
        String getDescription() {
            return "XS";
        }
    },
    S(34){
        @Override
        String getDescription() {
            return "S";
        }
    },
    M(38){
        @Override
        String getDescription() {
            return "M";
        }
    },
    L(42){
        @Override
        String getDescription() {
            return "L";
        }
    };

    int euroSize;

    ClothingSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }

    abstract String getDescription();

    @Override
    public String toString() {
        return "ClothingSize{" +
                "euroSize=" + euroSize +
                '}';
    }
}
