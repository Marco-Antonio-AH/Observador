package observador;

import java.util.Observer;
import java.util.Observable;

public class stock implements Observer {

    public void update(Observable obs, Object obj) {
        System.out.println("Stock: ");
        System.out.println("Le doy de baja...");
    }
}
