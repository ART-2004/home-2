public class Horse extends Herbivores implements Printable{
    private Integer height;

    public Integer getHeight() {
        return height;
    }

    public Horse(Integer age, Integer height) {
        super(age);
        this.height = height;
    }

    @Override
    public void print() {
        System.out.println("Horse Age " + getAge() +
                "\n Horse Growth " + getHeight());
    }
}
