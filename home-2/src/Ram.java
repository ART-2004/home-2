public class Ram extends Herbivores implements Printable {
    private static Integer weght;

    public static Integer getWeght() {
        return weght;
    }

    public Ram(Integer age, Integer weght) {
        super(age);
        this.weght = weght;
    }

    public Ram(Integer age) {
        super(age);
    }

    @Override
    public void print() {
        System.out.println("ram age " + getAge() +
                "\nRam weight " + getWeght() );

    }
}
