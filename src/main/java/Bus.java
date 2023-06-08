import lombok.NoArgsConstructor;


@NoArgsConstructor
public class Bus extends Transport {
    public Bus(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void start() {
        System.out.println("Bus started");
    }
}
