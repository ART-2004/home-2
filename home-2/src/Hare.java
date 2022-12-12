public class Hare extends Herbivores {
    private static String name;

    public static String getName() {
        return name;
    }

    public Hare(Integer age, String name) {
        super(age);
        this.name = name;
    }


    @Override
    public void print() {

    }
}
