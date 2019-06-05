import javax.swing.*;

public class Gewinnreihen  {

    public void reihen(){


        // Gewinnerreihen X

        if(Variabeln.feld1Check.equals("1") && Variabeln.feld2Check.equals("1") && Variabeln.feld3Check.equals("1")){ // Obere Reihe gewinnt
            JOptionPane.showMessageDialog(null, "X hat gewonnen!");
            System.exit(0);
        }
        else if(Variabeln.feld4Check.equals("1") && Variabeln.feld5Check.equals("1") && Variabeln.feld6Check.equals("1")){ // Mittlere Reihe gewinnt
            JOptionPane.showMessageDialog(null, "X hat gewonnen!");
            System.exit(0);
        }
        else if(Variabeln.feld7Check.equals("1") && Variabeln.feld8Check.equals("1") && Variabeln.feld9Check.equals("1")){ // Untere Reihe gewinnt
            JOptionPane.showMessageDialog(null, "X hat gewonnen!");
            System.exit(0);
        }
        else if(Variabeln.feld1Check.equals("1") && Variabeln.feld4Check.equals("1") && Variabeln.feld7Check.equals("1")){ // Linke Reihe gewinnt
            JOptionPane.showMessageDialog(null, "X hat gewonnen!");
            System.exit(0);
        }
        else if(Variabeln.feld2Check.equals("1") && Variabeln.feld5Check.equals("1") && Variabeln.feld8Check.equals("1")){ // Mittlere Reihe gewinnt
            JOptionPane.showMessageDialog(null,"X hat gewonnen!");
            System.exit(0);
        }
        else if(Variabeln.feld3Check.equals("1") && Variabeln.feld6Check.equals("1") && Variabeln.feld9Check.equals("1")){ // Rechte Reihe gewinnt
            JOptionPane.showMessageDialog(null, "X hat gewonnen!");
            System.exit(0);
        }
        else if(Variabeln.feld1Check.equals("1") && Variabeln.feld5Check.equals("1") && Variabeln.feld9Check.equals("1")){ // Oben links nach unten rechts
            JOptionPane.showMessageDialog(null, "X hat gewonnen!");
            System.exit(0);
        }
        else if(Variabeln.feld3Check.equals("1") && Variabeln.feld5Check.equals("1") && Variabeln.feld7Check.equals("1")){ // Oben rechts nach unten links
            JOptionPane.showMessageDialog(null, "X hat gewonnen!");
            System.exit(0);
        }


        // Gewinnerreihen O
        else if(Variabeln.feld1Check.equals("2") && Variabeln.feld2Check.equals("2") && Variabeln.feld3Check.equals("2")) { // Obere Reihe gewinnt
            JOptionPane.showMessageDialog(null, "O hat gewonnen!");
            System.exit(0);
        }
        else if(Variabeln.feld4Check.equals("2") && Variabeln.feld5Check.equals("2") && Variabeln.feld6Check.equals("2")) { // Mittlere Reihe gewinnt
            JOptionPane.showMessageDialog(null, "O hat gewonnen!");
            System.exit(0);
        }
        else if(Variabeln.feld7Check.equals("2") && Variabeln.feld8Check.equals("2") && Variabeln.feld9Check.equals("2")) { // Untere Reihe gewinnt
            JOptionPane.showMessageDialog(null, "O hat gewonnen!");
            System.exit(0);
        }
        else if(Variabeln.feld1Check.equals("2") && Variabeln.feld4Check.equals("2") && Variabeln.feld7Check.equals("2")) { // Linke Reihe gewinnt
            JOptionPane.showMessageDialog(null, "O hat gewonnen!");
            System.exit(0);
        }
        else if(Variabeln.feld2Check.equals("2") && Variabeln.feld5Check.equals("2") && Variabeln.feld8Check.equals("2")) { // Mittlere Reihe gewinnt
            JOptionPane.showMessageDialog(null, "O hat gewonnen!");
            System.exit(0);
        }
        else if(Variabeln.feld3Check.equals("2") && Variabeln.feld6Check.equals("2") && Variabeln.feld9Check.equals("2")) { // Rechte Reihe gewinnt
            JOptionPane.showMessageDialog(null, "O hat gewonnen!");
            System.exit(0);
        }
        else if(Variabeln.feld1Check.equals("2") && Variabeln.feld5Check.equals("2") && Variabeln.feld9Check.equals("2")) { // Oben links nach unten rechts
            JOptionPane.showMessageDialog(null, "O hat gewonnen!");
            System.exit(0);
        }
        else if(Variabeln.feld3Check.equals("2") && Variabeln.feld5Check.equals("2") && Variabeln.feld7Check.equals("2")) { // Oben rechts nach unten links
            JOptionPane.showMessageDialog(null, "O hat gewonnen!");
            System.exit(0);
        }


    }
}
