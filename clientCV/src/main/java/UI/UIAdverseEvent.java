package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

/**
 *
 * @author Paolo Bruscagin
 */

public class UIAdverseEvent extends JFrame implements ActionListener {

    public UIAdverseEvent(){

        setBounds(0, 0, 1600, 900);
        setLayout(null);

        ImageIcon logo = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/logo.png")));
        setIconImage(logo.getImage());

        setTitle("Eventi Avversi");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1600, 900);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setForeground(Color.WHITE);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}