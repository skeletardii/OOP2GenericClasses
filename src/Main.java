import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        // ==== MyMap ==== //
        System.out.println("==== MyMap ====");
        MyMap<String, Integer> map = new MyMap();

        System.out.println("Adding Values: ");
        map.put("Snake",2025);
        map.put("Goat",2027);
        map.put("Monkey",2028);

        map.print();
        System.out.println("Goat = " + map.get("Goat") + " (Get)");
        System.out.println("Goat = " + map.remove("Goat") + " (Remove)");
        System.out.println("Goat = " + map.get("Goat") + " (Get)");
        System.out.println("Goat = " + map.remove("Goat") + " (Remove)");
        map.print();

        System.out.println("Updating Monkey: ");
        map.put("Monkey", 2040);
        map.print();



        // ==== Arithmetic ==== //
        DecimalFormat df = new DecimalFormat("0.#");

        System.out.println("\n==== Arithmetic ====");
        Arithmetic<Integer, Long> arith = new Arithmetic<>(1, 3L);

        arith.print();
        System.out.println("Add : \t\t" + df.format(arith.add()));
        System.out.println("Subtract : \t" + df.format(arith.subtract()));
        System.out.println("Multiply : \t" + df.format(arith.multiply()));
        System.out.println("Divide : \t" +  df.format(arith.divide()));
        System.out.println("Get Min : \t" + df.format(arith.getMin()));
        System.out.println("Get Max : \t" + df.format(arith.getMax()));
    }
}