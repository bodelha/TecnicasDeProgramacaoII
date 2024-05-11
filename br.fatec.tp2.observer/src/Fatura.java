import java.util.HashMap;
import java.util.Map;

public class Fatura implements EventListener {
    Map<String, Double> totais = new HashMap<>();
  
    @Override
    public void update(Evento event) {
      String tagIdentifier = event.tagIdentifier;
      totais.put(tagIdentifier, totais.getOrDefault(tagIdentifier, 0.0) + event.price);
    }
  }
  