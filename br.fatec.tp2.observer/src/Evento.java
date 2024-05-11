import java.time.LocalTime;

public class Evento {
    public String tagIdentifier;
    public LocalTime time;
    public String carIdentifier;
    public String collectPostIdentifier;
    public Double price;

    public Evento(String tagIdentifier, String carIdentifier, String collectPostIdentifier,
            Double price) {
        this.tagIdentifier = tagIdentifier;
        this.time = LocalTime.now();
        this.carIdentifier = carIdentifier;
        this.collectPostIdentifier = collectPostIdentifier;
        this.price = price;
    }
}
