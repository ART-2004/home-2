public class Wolf extends Predators{
    private String howl;
    private Integer weight;

    public Wolf(Integer age, String howl, Integer weight) {
        super(age);
        this.howl = howl;
        this.weight = weight;
    }

    public String getVoice() {
        return howl;
    }

    public Integer getWeight() {
        return weight;
    }

    @Override
    public void print() {
        System.out.println("wolf howl " + getVoice() +
                "\nwolf weight " + getWeight() +
                "\nWolf Age " + getAge());
    }
}
