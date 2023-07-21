package observador;
import java.util.Observable;
import java.util.Observer;

public class compras implements Observer {
    public void update(Observable obs, Object obj) {
        System.out.println("Compras: ");
        System.out.println("Solicito nueva cotización...");
    }
}
