package lesson;

public class Engine {
    public int diaPiston;
    public String typePiston;
    public double volume;

    @Override
    public String toString() {
        return "lesson.Engine{" +
                "diaPiston=" + diaPiston +
                ", typePiston='" + typePiston + '\'' +
                ", volume=" + volume +
                '}';
    }
}
