package UI;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;



/**
 * La classe UIChoosingRooles crea l'interfaccia dove l'utente decide il ruolo in cui vuole accedere
 *
 * @author Paolo Bruscagin
 */
public class UIChoosingRooles extends JFrame implements ActionListener {

    /**
     * Bottone per accedere alla sezione operatore vaccinale
     */
    JButton operatoreVaccinale = new JButton();

    /**
     * Bottone per accedere alla sezione cittadino
     */
    JButton cittadino = new JButton();


    /**
     * costruttore che permette il caricamento dei componenti d'interfaccia grafica
     */

    public UIChoosingRooles(){


        Border bordo = new LineBorder(new Color(0xFF37C47A, true), 4, true);

        JLabel scelta = new JLabel("SELEZIONA LA TIPOLOGIA DI UTENTE");
        scelta.setFont(new Font("Georgia", Font.BOLD, 17));
        scelta.setBounds(580, 100, 400, 30);


        //Personalizzazione bottone operatore vaccinale

        ImageIcon op = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/operatorevaccinale.png")));


        JLabel iconOV = new JLabel(op);
        JLabel operator = new JLabel("OPERATORE VACCINALE");
        operator.setFont(new Font("Georgia", Font.BOLD, 15));
        operator.setForeground(Color.WHITE);
        operatoreVaccinale.setLayout(new BorderLayout());
        operatoreVaccinale.add(iconOV,BorderLayout.WEST);
        operatoreVaccinale.add(operator,BorderLayout.CENTER);

        operatoreVaccinale.setBounds(600, 180, 310, 100);
        operatoreVaccinale.setFont(new Font("Georgia", Font.BOLD, 15));
        operatoreVaccinale.setBackground(new Color(0xA059E3B3));
        operatoreVaccinale.setHorizontalTextPosition(SwingConstants.RIGHT);
        operatoreVaccinale.setForeground(Color.WHITE);
        operatoreVaccinale.setBorder(bordo);
        operatoreVaccinale.setFocusable(false);
        operatoreVaccinale.addActionListener(this);
        operatoreVaccinale.setOpaque(true);


        //Personalizzazione bottone cittadino

        ImageIcon cit = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/cittadino.png")));

        JLabel icon = new JLabel(cit);
        JLabel citizen = new JLabel("         CITTADINO");
        citizen.setForeground(Color.WHITE);
        citizen.setFont(new Font("Georgia", Font.BOLD, 15));
        //cittadino = new JButton("CITTADINO", cit);
        cittadino.setLayout(new BorderLayout());
        cittadino.add(icon,BorderLayout.WEST);
        cittadino.add(citizen,BorderLayout.CENTER);
        cittadino.setBounds(600, 330, 310, 100);
        cittadino.setFont(new Font("Georgia", Font.BOLD, 15));
        cittadino.setBackground(new Color(0xA059E3B3));
        cittadino.setForeground(Color.WHITE);
       // cittadino.setHorizontalTextPosition(SwingConstants.RIGHT);
        cittadino.setIconTextGap(80);
        cittadino.setBorder(bordo);
        cittadino.setFocusable(false);
        cittadino.addActionListener(this);
        cittadino.setOpaque(true);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        //Icona avvio del programma

        ImageIcon logo = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/logo.png")));
        setIconImage(logo.getImage());

        setLayout(null);
        add(scelta);
        add(operatoreVaccinale);
        add(cittadino);
        setTitle("VaxCenter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize (1000, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setForeground(Color.WHITE);
        setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        setForeground(Color.WHITE);
        setVisible(true);
    }

    /**
     * metodo che permette la gestione degli eventi associati ai listener legati ai componenti d'interfaccia grafica
     */

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == operatoreVaccinale){
            this.dispose();
            new UIVaccineOperator();
        } else if(e.getSource() == cittadino){
            this.dispose();
            new UICitizen();
        }
    }
}
