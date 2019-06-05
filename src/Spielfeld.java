import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Spielfeld extends JFrame {

    SetX setImageX = new SetX();
    SetO setImageO = new SetO();
    Gewinnreihen gewinnreihen = new Gewinnreihen();

    public void paint(Graphics g) {

        g.drawLine(0, 200, 600, 200);
        g.drawLine(0, 400, 600, 400);
        g.drawLine(200, 0, 200, 600);
        g.drawLine(400, 0, 400, 600);
        g.drawLine(0, 600, 600, 600);


        Variabeln.closeButton = new JButton("Close");
        add(Variabeln.closeButton);

        Variabeln.anweisung1 = new JLabel("Linke Maustaste = X");
        Variabeln.anweisung1.setBounds(100, 650, 200, 50);
        add(Variabeln.anweisung1);

        Variabeln.feld1 = new JLabel();
        Variabeln.feld1.setBounds(0, 0, 160, 150);
        add(Variabeln.feld1);

        Variabeln.feld2 = new JLabel();
        Variabeln.feld2.setBounds(200, 0, 160, 150);
        add(Variabeln.feld2);

        Variabeln.feld3 = new JLabel();
        Variabeln.feld3.setBounds(400, 0, 160, 150);
        add(Variabeln.feld3);

        Variabeln.feld4 = new JLabel();
        Variabeln.feld4.setBounds(0, 200, 160, 150);
        add(Variabeln.feld4);

        Variabeln.feld5 = new JLabel();
        Variabeln.feld5.setBounds(200, 200, 160, 150);
        add(Variabeln.feld5);

        Variabeln.feld6 = new JLabel();
        Variabeln.feld6.setBounds(400, 200, 160, 150);
        add(Variabeln.feld6);

        Variabeln.feld7 = new JLabel();
        Variabeln.feld7.setBounds(0, 400, 160, 150);
        add(Variabeln.feld7);

        Variabeln.feld8 = new JLabel();
        Variabeln.feld8.setBounds(200, 400, 160, 150);
        add(Variabeln.feld8);

        Variabeln.feld9 = new JLabel();
        Variabeln.feld9.setBounds(400, 400, 160, 150);
        add(Variabeln.feld9);


        addMouseListener(new MouseAdapter() { // Klick listener


            @Override
            public void mouseClicked(MouseEvent e) { // Mouse Clicklistener

                if (e.getButton() == MouseEvent.BUTTON1) {

                    Variabeln.x = e.getX();
                    Variabeln.y = e.getY();

                    setImageX.imageX(); // Set Label Image X
                    Variabeln.check1++;
                } else if (e.getButton() == MouseEvent.BUTTON3) {

                    Variabeln.x = e.getX();
                    Variabeln.y = e.getY();

                    setImageO.imageO(); // Set Label Image O
                    Variabeln.check2++;
                }

                gewinnreihen.reihen(); // Gewinnerreihen
            }
        });


    }

}
