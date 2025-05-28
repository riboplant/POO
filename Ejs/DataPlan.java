package Ejs;

public enum DataPlan {
    PREPAGO(0, 15, 0){
        @Override
        public int extraGB(int usedGB){
            return usedGB;
        }
    },
    BASICO(100, 10, 1){
        @Override
        public int extraGB(int usedGB){
            return usedGB - BASICO.baseGB;
        }
    },
    PREMIUM(280, 8, 3){
        @Override
        public int extraGB(int usedGB){
            return usedGB - PREMIUM.baseGB;
        }
    },
    UNLIMITED(500, 0, 0){
        @Override
        public int extraGB(int usedGB){
            return 0;
        }
    };

    private final int baseCost;
    private final double GBprice;
    private int baseGB;
    DataPlan(int baseCost, double GBprice, int baseGB){
        this.baseGB = baseGB;
        this.baseCost = baseCost;
        this.GBprice = GBprice;
    }
    public abstract int extraGB(int usedGB);
    public boolean belowLimit(int usedGB){ return extraGB(usedGB) <= 0; }
    public double total(int usedGB){ return baseCost + extraGB(usedGB) * GBprice;}

}
