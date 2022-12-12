public class Main {
    public static void main(String[] args) {
        Ram ram = new Ram(3, 30);
        Horse horse = new Horse(5, 170);
        Hare hare = new Hare(14, "Крош");
        ram.print();
        horse.print();
        hare.print();

        Predators Jackals = createObject("Jackals");
        Predators wolf = createObject("Wolf");
        Predators Tiger = createObject("Tiger");
        Jackals.print();
        wolf.print();
        Tiger.print();
    }

    private static Predators createObject(String className) {
        switch (className) {
            case "Jackals" -> {
                return new Jackals(13, "Табаки", 123);
            }
            case "Wolf" -> {
                return new Wolf(9, "Ааууу", 67);
            }
            case "Tiger" -> {
                return new Tiger(5, 56, "Шер Хан");
            }
        }
        return null;
    }
}
