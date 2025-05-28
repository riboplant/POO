package Ejs;

public class Client {
    private final String name;
    private final DataPlan dataPlan;
    private int usedGB;

    public Client(String name, DataPlan dataPlan){
        this.name = name;
        this.dataPlan = dataPlan;
    }
    public void addGB(int gb){
        usedGB += gb;
    }
    public boolean belowLimit(){
        return dataPlan.belowLimit(usedGB);
    }
    public double total() {
        return dataPlan.total(usedGB);
    }
}
