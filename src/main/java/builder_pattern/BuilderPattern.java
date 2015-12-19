package builder_pattern;

/**
 * @author Oreste Luci
 */
public class BuilderPattern {

    public static void main(String[] args) {

        Vehicle camaro = new Vehicle.Builder().
                type("Car").
                color("Red").
                doors(2).
                horsePower(320).
                make("Chevrolet").
                model("Camaro").
                price(4999.99).
                build();

        System.out.println(camaro);
    }
}
