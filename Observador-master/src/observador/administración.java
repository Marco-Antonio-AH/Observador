package observador;

import java.util.Observable;
import java.util.Observer;

public class administración implements Observer {
    public void update(Observable obs, Object obj) {
        System.out.println("Administración: ");
        System.out.println("Envío una queja formal...");
    }
}
