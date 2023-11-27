public class HomeTest {
    public static void main(String[] args) {
        Home home = new Home(10000, 1000);


        System.out.println(home.homeInfo());

        home.takeShower();
        home.takeBath();
        home.makeDinner();
        home.boilWater();
        home.watchTv(4);
    }
}
