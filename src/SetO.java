import javax.swing.*;

public class SetO {

    public void imageO(){

        ImageIcon iconLogoO = new ImageIcon("C://Users//jstd//Desktop//o.png");

        if(Variabeln.check2 >= 5) {
            JOptionPane.showMessageDialog(null, "Deine Züge sind verbracht!");  // Check ob Züge verbraucht
        }
        else if(Variabeln.x >= 0 && Variabeln.x <= 200 && Variabeln.y <= 200 && Variabeln.y >= 0 && Variabeln.feld1Check.equals("")){ // Feld1
            Variabeln.feld1.setIcon(iconLogoO);
            Variabeln.feld1Check = "2";
        }
        else if(Variabeln.x >= 200 && Variabeln.x <= 400 && Variabeln.y <= 200 && Variabeln.y >= 0 && Variabeln.feld2Check.equals("")){ // Feld2
            Variabeln.feld2.setIcon(iconLogoO);
            Variabeln.feld2Check = "2";
        }
        else if(Variabeln.x >= 400 && Variabeln.x <= 600 && Variabeln.y <= 200 && Variabeln.y >= 0 && Variabeln.feld3Check.equals("")){ // Feld3
            Variabeln.feld3.setIcon(iconLogoO);
            Variabeln.feld3Check = "2";
        }
        else if(Variabeln.x >= 0 && Variabeln.x <= 200 && Variabeln.y <= 400 && Variabeln.y >= 200 && Variabeln.feld4Check.equals("")){ // Feld4
            Variabeln.feld4.setIcon(iconLogoO);
            Variabeln.feld4Check = "2";
        }
        else if(Variabeln.x >= 200 && Variabeln.x <= 400 && Variabeln.y <= 400 && Variabeln.y >= 200 && Variabeln.feld5Check.equals("")){ // Feld5
            Variabeln.feld5.setIcon(iconLogoO);
            Variabeln.feld5Check = "2";
        }
        else if(Variabeln.x >= 400 && Variabeln.y <= 600 && Variabeln.y <= 400 && Variabeln.y >= 200 && Variabeln.feld6Check.equals("")){ // Feld6
            Variabeln.feld6.setIcon(iconLogoO);
            Variabeln.feld6Check = "2";
        }
        else if(Variabeln.x >= 0 && Variabeln.x <= 200 && Variabeln.y <= 600 && Variabeln.y >= 400 && Variabeln.feld7Check.equals("")){ // Feld7
            Variabeln.feld7.setIcon(iconLogoO);
            Variabeln.feld7Check = "2";
        }
        else if(Variabeln.x >= 200 && Variabeln.x <= 400 && Variabeln.y <= 600 && Variabeln.y >= 400 && Variabeln.feld8Check.equals("")) { // Feld8
            Variabeln.feld8.setIcon(iconLogoO);
            Variabeln.feld8Check = "2";
        }
        else if(Variabeln.x >= 400 && Variabeln.x <= 600 && Variabeln.y <= 600 && Variabeln.y >= 400 && Variabeln.feld9Check.equals("")){ // Feld9
            Variabeln.feld9.setIcon(iconLogoO);
            Variabeln.feld9Check = "2";
        }

    }
}
