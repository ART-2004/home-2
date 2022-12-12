public class Jackals extends Predators {
    private String name;
    private Integer height;

    public Jackals(Integer age, String name, Integer height) {
        super(age);
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public Integer getHeight() {
        return height;
    }

    @Override
    public void print() {
        System.out.println("The name of the jackal " + getName() +
                "\nJackal growth " + getHeight() +
                "\nage of the jackal " + getAge());


    }
}
