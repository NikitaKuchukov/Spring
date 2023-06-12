import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public abstract class Transport {
    private String brand;
    private String model;

    public Transport(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract void start();
}
