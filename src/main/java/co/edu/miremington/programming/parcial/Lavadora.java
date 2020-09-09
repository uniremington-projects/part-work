package co.edu.miremington.programming.parcial;

public class Lavadora extends TipoElectrodomestico {
    private static final double CARGA = 5;

    public Lavadora() {
    }

    public Lavadora(double cost, double weight) {
        super(cost, weight);
    }

    public Lavadora(double cost, String color, double weight, String energyConsumption) {
        super(cost, color, weight, energyConsumption);
    }

    /**
     * Se sobreescribe el metodo heredado precioFinal para adicionar lógica en el peso de la lavadora y asi aumentar el precio de ser necesario.
     * @return double
     */
    @Override
    public double precioFinal() {
        weight += CARGA;

        double newValue = 0;
        if (weight > 30) {
            newValue = 50000;
        }
        double response = super.precioFinal();
        response += newValue;
        cost = response;

        return cost;
    }

    public static double getCARGA() {
        return CARGA;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "cost=" + cost +
                ", color=" + color +
                ", weight=" + weight +
                ", energyConsumption=" + energyConsumption +
                '}';
    }
}
