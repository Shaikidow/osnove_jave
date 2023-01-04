package d29_12_2022;

public class SmartAirConditioning {

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCoolingPower() {
        return coolingPower;
    }
    public void setCoolingPower(int coolingPower) {
        this.coolingPower = coolingPower;
    }

    public int getHeatingPower() {
        return heatingPower;
    }
    public void setHeatingPower(int heatingPower) {
        this.heatingPower = heatingPower;
    }

    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getMode() {
        return mode;
    }
    public void setMode(String mode) {
        this.mode = mode;
    }

    private String brand;
    private int coolingPower; // kW/h
    private int heatingPower; // kW/h
    private int temperature; // °C
    private String mode; // samo "hladi" i "greje" su validne opcije

    public void print() {
        System.out.println(this.brand + " - " + this.mode + " - " + this.temperature + "°C");
    }

    public int monthlyPowerSpending() {
        if (this.mode.equals("hladi")) {
            return 30 * 15 * this.coolingPower;
        }
        if (this.mode.equals("greje")) {
            return 30 * 15 * this.heatingPower;
        }
        return -1;
    }

    public int monthlyCost() {
        int cumulativeCost = 0;
        for (int i = 1; i <= this.monthlyPowerSpending(); i++) {
            if (i <= 350) {
                cumulativeCost += 6;
            } else {
                cumulativeCost += 9;
            }
        }
        return cumulativeCost;
    }

}
