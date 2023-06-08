import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Car extends Transport {
    public Car(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void start() {
        System.out.println("Car started");
    }
}
