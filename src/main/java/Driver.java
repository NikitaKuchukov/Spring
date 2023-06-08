import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@NoArgsConstructor
@Getter
@Setter
public class Driver {
    private String name;
    private Transport transport;

    public Driver(String name, Transport transport) {
        this.transport = transport;
        this.name = name;
    }

    public void startTheTransport() {
        System.out.println(transport + " ready to go");
        transport.start();
    }

    @PostConstruct
    private void init() {
        System.out.println("Водитель проснулся");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Водитель уснул");
    }

    @Override
    public String toString() {
        return "Driver: " +
                name + "\n" + transport;
    }
}
