public class Home {
    double water;
    double oil;

    Home(double water, double oil) {
        this.water = water;
        this.oil = oil;
    }

    String homeInfo() {
        return "Ilość wody: " + water + " litrów, ropa: " + oil + " litrów";
    }

    void takeShower() {
        water = water - 48;
        System.out.println("Bierzemy prysznic: ");
        System.out.println("Ilośc wody: " + water + ", ropa: " + oil + " litrów");
    }

    void takeBath() {
        water = water - 86;
        System.out.println("Bierzemy kąpiel: ");
        System.out.println("Ilośc wody: " + water + ", ropa: " + oil + " litrów");
    }

    void makeDinner() {
        water = water - 0.4;
        oil = oil - 0.1;
        System.out.println("Gotujemy obiad: ");
        System.out.println("Ilośc wody: " + water + ", ropa: " + oil + " litrów");

    }

    void boilWater() {
        water = water - 0.5;
        oil = oil - 0.05;
        System.out.println("Gotujrmy wodę: ");
        System.out.println("Ilośc wody: " + water + ", ropa: " + oil + " litrów");
    }

    void watchTv(double timeWatch) {
        double oilComsumption = timeWatch * 0.06;
        oil = oil - oilComsumption;
        System.out.println("Ogladamy Tv przez " + timeWatch + " godzin");
        System.out.println("Ilośc wody: " + water + ", ropa: " + oil + " litrów");

    }


}
