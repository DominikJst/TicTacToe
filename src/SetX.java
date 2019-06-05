import javax.swing.*;

public class SetX {

    public void imageX(){

        ImageIcon iconLogoX = new ImageIcon("C://Users//jstd//Desktop//x.png"); // Upload Images


        if(Variabeln.check1 >= 5) {
            JOptionPane.showMessageDialog(null, "Deine Züge sind verbracht!"); // Check ob Züge verbraucht
        }
        else if(Variabeln.x >= 0 && Variabeln.x <= 200 && Variabeln.y <= 200 && Variabeln.y >= 0 && Variabeln.feld1Check.equals("")){ // Feld1
            Variabeln.feld1.setIcon(iconLogoX);
            Variabeln.feld1Check = "1";
        }
        else if(Variabeln.x >= 200 && Variabeln.x <= 400 && Variabeln.y <= 200 && Variabeln.y >= 0 && Variabeln.feld2Check.equals("")){ // Feld2
            Variabeln.feld2.setIcon(iconLogoX);
            Variabeln.feld2Check = "1";
        }
        else if(Variabeln.x >= 400 && Variabeln.x <= 600 && Variabeln.y <= 200 && Variabeln.y >= 0 && Variabeln.feld3Check.equals("")){ // Feld3
            Variabeln.feld3.setIcon(iconLogoX);
            Variabeln.feld3Check = "1";
        }
        else if(Variabeln.x >= 0 && Variabeln.x <= 200 && Variabeln.y <= 400 && Variabeln.y >= 200 && Variabeln.feld4Check.equals("")){ // Feld4
            Variabeln.feld4.setIcon(iconLogoX);
            Variabeln.feld4Check = "1";
        }
        else if(Variabeln.x >= 200 && Variabeln.x <= 400 && Variabeln.y <= 400 && Variabeln.y >= 200 && Variabeln.feld5Check.equals("")){ // Feld5
            Variabeln.feld5.setIcon(iconLogoX);
            Variabeln.feld5Check = "1";
        }
        else if(Variabeln.x >= 400 && Variabeln.y <= 600 && Variabeln.y <= 400 && Variabeln.y >= 200 && Variabeln.feld6Check.equals("")){ // Feld6
            Variabeln.feld6.setIcon(iconLogoX);
            Variabeln.feld6Check = "1";
        }
        else if(Variabeln.x >= 0 && Variabeln.x <= 200 && Variabeln.y <= 600 && Variabeln.y >= 400 && Variabeln.feld7Check.equals("")){ // Feld7
            Variabeln.feld7.setIcon(iconLogoX);
            Variabeln.feld7Check = "1";
        }
        else if(Variabeln.x >= 200 && Variabeln.x <= 400 && Variabeln.y <= 600 && Variabeln.y >= 400 && Variabeln.feld8Check.equals("")) { // Feld8
            Variabeln.feld8.setIcon(iconLogoX);
            Variabeln.feld8Check = "1";
        }
        else if(Variabeln.x >= 400 && Variabeln.x <= 600 && Variabeln.y <= 600 && Variabeln.y >= 400 && Variabeln.feld9Check.equals("")){ // Feld9
            Variabeln.feld9.setIcon(iconLogoX);
            Variabeln.feld9Check = "1";
        }

    }
}
