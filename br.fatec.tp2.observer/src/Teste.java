public class Teste {

    Publisher geradorPassagem = new GeradorDeEventoDePassagem();

    geradorPassagem.subscribe(Fatura);
    geradorPassagem.subscribe(SendEmail);


    Evento EventoPassagem1 = new Evento(
        "ffuygvasd",
        "C9VOA6D",
        "fxhbxdpz",
        10.0
    );

    GeradorDeEvento.notify(EventoPassagem1);

    
}
