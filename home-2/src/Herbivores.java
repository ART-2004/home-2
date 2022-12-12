public abstract class Herbivores implements Printable{
    public static Integer age;

    public Herbivores(Integer age) {
        this.age = age;
    }

    public static Integer getAge() {
        return age;
    }
}
