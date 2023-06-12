import lombok.NoArgsConstructor;


@NoArgsConstructor
public class Pickup extends Transport {
    public Pickup(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void start() {
        System.out.println("Pickup started");
    }
}
