/**
 * 
 */
/**
 * @author User
 *
 */
package gpw;

import java.util.Observable;
import java.util.Observer;

public class WyswietlaczTikow implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        Tik tik = (Tik) arg;
        System.out.println("WT:Sp�ka: " + tik.getNazwa() + " cena: " + tik.getCena());
    }
}