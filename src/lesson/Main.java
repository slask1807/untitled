package lesson;

public class Main {

    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.engine = new Engine();
        auto.gearbox = new Gearbox();
        auto.engine.diaPiston =120;
        auto.engine.typePiston = "безвтыковые";
        auto.engine.volume = 1.4;
        auto.gearbox.gearRatio = 6;
        auto.gearbox.typyRatio = "механическая";
        System.out.println(auto);
    }
}
