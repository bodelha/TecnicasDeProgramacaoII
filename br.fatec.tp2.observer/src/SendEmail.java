
public class SendEmail implements EventListener {
    private String email;

    @Override
    public void update(Evento event) {
        System.out.println(
                "Email to " + email + ": Someone has performed " + event + " operation.");
    }
}