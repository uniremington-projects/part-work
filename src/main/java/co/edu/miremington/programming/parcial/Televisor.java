package co.edu.miremington.programming.parcial;

public class Televisor extends TipoElectrodomestico {

    private int resolution = 20;
    private boolean tunerDTT  = false;

    public Televisor() {
    }

    public Televisor(double cost, double weight) {
        super(cost, weight);
    }

    public Televisor(double cost, String color, double weight, String energyConsumption, int resolution, boolean tunerDTT) {
        super(cost, color, weight, energyConsumption);
        this.resolution = resolution;
        this.tunerDTT = tunerDTT;
    }

    /**
     * Se sobreescribe el metodo heredado precioFinal para adicionar lógica referente a la resolution y tunerDTT para asi aumentar el precio de ser necesario.
     * @return double
     */
    @Override
    public double precioFinal() {
        double response = super.precioFinal();
        if (resolution > 40) {
            response = response + (response * .3);
        }

        if (tunerDTT) {
            response += 50000;
        }
        cost = response;

        return cost;
    }

    public int getResolution() {
        return resolution;
    }

    public boolean isTunerDTT() {
        return tunerDTT;
    }

    @Override
    public String toString() {
        return "Televisor{" +
                "resolution=" + resolution +
                ", tunerDTT=" + tunerDTT +
                ", cost=" + cost +
                ", color=" + color +
                ", weight=" + weight +
                ", energyConsumption=" + energyConsumption +
                '}';
    }
}
