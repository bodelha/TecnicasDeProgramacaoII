import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Publisher {
    Map<String, List<EventListener>> listeners = new HashMap<>();

    public Publisher(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(Evento event, EventListener listener) {
        List<EventListener> users = listeners.get(event);
        users.add(listener);
    }

    public void unsubscribe(Evento event, EventListener listener) {
        List<EventListener> users = listeners.get(event);
        users.remove(listener);
    }

    public void notify(Evento event) {
        List<EventListener> users = listeners.get(event);
        for (EventListener listener : users) {
            listener.update(event);
        }
    }
}