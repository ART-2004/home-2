public class Tiger extends Predators{
    private Integer weight;
    private String name;public Tiger(Integer age, Integer weight, String name) {
        super(age);
        this.weight = weight;
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("tiger name " + getName() +
                "\n Tiger weight " + getWeight() );
    }
}
