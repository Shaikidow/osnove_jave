package d27_12_2022;

public class SmartAirConditioning {

    public String marka;
    public int temperatura;
    public String mod;

    public void stampajInfo() {
        System.out.println(this.marka + ", " + this.temperatura + "°C, " + this.mod);
    }

    public boolean jeToplijeNapolju(double spoljnaTemperatura) {
        return this.temperatura < spoljnaTemperatura;
    }

}
