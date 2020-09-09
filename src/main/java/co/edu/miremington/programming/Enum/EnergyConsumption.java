package co.edu.miremington.programming.Enum;

public enum EnergyConsumption {
    A1("A1", 520000),
    B1("B1", 320000),
    C1("C1", 240000),
    D1("D1", 200000),
    E1("E1", 120000),
    F1("F1", 50000),
    DEFAULT("default", 400000);

    private String code;
    private double cost;

    EnergyConsumption(String code, int cost) {
        this.code = code;
        this.cost = cost;
    }

    public String getCode() {
        return code;
    }

    public double getCost() {
        return cost;
    }
}
