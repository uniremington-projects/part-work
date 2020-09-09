package co.edu.miremington.programming.parcial;

import co.edu.miremington.programming.Enum.Color;
import co.edu.miremington.programming.Enum.EnergyConsumption;

public class TipoElectrodomestico {
    protected double cost;
    protected Color color = Color.COLOR_BLACK;
    protected double weight = 3.5;
    protected EnergyConsumption energyConsumption = EnergyConsumption.DEFAULT;

    public TipoElectrodomestico() {
    }

    public TipoElectrodomestico(double cost, double weight) {
        this.cost = cost;
        this.weight = weight;
    }

    public TipoElectrodomestico(double cost, String color, double weight, String energyConsumption) {
        this.cost = cost;
        this.color = validarColor(color);
        this.weight = weight;
        this.energyConsumption = validarConsumoEnergia(energyConsumption);
    }

    /**
     *  Se valida el texto ingresado, y se le asigna un Enum
     * @param code String
     */
    private EnergyConsumption validarConsumoEnergia(String code) {
        EnergyConsumption result;
        switch (code) {
            case "A1":
                result = EnergyConsumption.A1;
                break;
            case "B1":
                result = EnergyConsumption.B1;
                break;
            case "C1":
                result = EnergyConsumption.C1;
                break;
            case "D1":
                result = EnergyConsumption.D1;
                break;
            case "E1":
                result = EnergyConsumption.E1;
                break;
            case "F1":
                result = EnergyConsumption.F1;
                break;
            default:
                result = EnergyConsumption.DEFAULT;
                break;
        }

        return result;
    }

    /**
     * Se incrementa el precio si cumple con los siguientes rangos de peso.
     * al final retorna un nuevo precio
     * @return double
     */
    public double precioFinal() {
        double increase = 0;
        if (weight >= 0 && weight <= 19) {
            increase = 40000;
        } else if (weight <=49) {
            increase = 20000;
        } else if (weight == 50 && weight >= 79) {
            increase = 320000;
        } else if (weight > 80) {
            increase = 400000;
        }
        if (cost == 0) {
            cost = energyConsumption.getCost() + increase;
        } else {
            cost += increase;
        }
        return cost;
    }

    private Color validarColor(String color) {
        Color result;
        switch (color) {
            case "Black":
                result = Color.COLOR_BLACK;
            case "Red":
                result = Color.COLOR_RED;
            case "Blue":
                result = Color.COLOR_BLUE;
            case "Yellow":
                result = Color.COLOR_YELLOW;
            default:
                result = Color.COLOR_BLACK;
        }
        return result;
    }

    public double getCost() {
        return cost;
    }

    public Color getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public EnergyConsumption getEnergyConsumption() {
        return energyConsumption;
    }
}
