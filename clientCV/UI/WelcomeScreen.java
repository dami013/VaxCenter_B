package clientCV.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeScreen extends JFrame {

    Timer timer;
    public WelcomeScreen() {
        displayWelcomeScreen();
    }

    private void displayWelcomeScreen() {
        final JWindow win = new JWindow(this);

        win.setSize(1600,900);
        win.setLocationRelativeTo(null);
        win.setVisible(true);
        CurvesPanel cp = new CurvesPanel();
        win.add(cp);
        // immagine di prova
        String logoPath = "clientCV/images/dottori.png";
        JLabel label = new JLabel(new ImageIcon(logoPath));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        cp.add(label);
        cp.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JProgressBar progressBar = new JProgressBar(0,100);


        progressBar.setForeground(Color.decode("#ff930f"));
        win.add(BorderLayout.PAGE_END,progressBar);
        // alla fine della pb viene aperta nella stessa posizione
        win.revalidate();

        timer = new Timer(40, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int value = progressBar.getValue();
                if(value == 100) {
                    win.dispose();
                   new UIChoosingRooles();
                    timer.stop();
                } else {
                    progressBar.setValue(value+2);
                }
            }
        });
        timer.start();

    }


   /* public static void main(String[] args) {
        new WelcomeScreen();
    }

    */
}