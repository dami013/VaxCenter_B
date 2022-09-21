package UI;

import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 * Libreria utilizzata per cercare tramite caratteri nella JComboBox i nomi dei centri vaccinali
 */

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import java.time.LocalDate;





/**
 *  La classe UIRegisterVaccinated crea l'interfaccia dove l'operatore vaccinale è in gardo di inserire i dati di un vaccinato
 *
 * @author Paolo Bruscagin
 * @author Damiano Ficara
 */

public class UIRegisterVaccinated extends JFrame implements ActionListener {



    JComboBox nomeCV = new JComboBox<>(new String[]{"Paolo", "Damiano", "Alessandro", "Luca","Paolo", "Damiano", "Alessandro", "Luca","Paolo", "Damiano", "Alessandro", "Luca","Paolo", "Damiano", "Alessandro", "Luca"}); // da fare in modo diverso

    JTextField nome = new JTextField(30);

    JTextField cognome = new JTextField(30);

    JTextField codiceFiscale = new JTextField(16);

    LocalDate todaysDate = LocalDate.now();

    JTextField data = new JTextField(String.valueOf(todaysDate));

    JComboBox vaccinoSomministrato = new JComboBox<>(new String[]{"Pfizer", "AstraZeneca", "Moderna", "J&J"});

    JLabel IDUnivoco = new JLabel();
    JLabel warningIDUnivoco = new JLabel();
    JLabel status = new JLabel();

    JButton registraVaccinato = new JButton("REGISTRA");

    JButton backToVaccineOperator;

    JButton pulisci = new JButton();

    /**
     * costruttore che permette il caricamento dei componenti d'interfaccia grafica
     */

    public UIRegisterVaccinated(){

        Border bordo = new LineBorder(new Color(0xFF000000, true), 2, true);
        Border bordoCombo = new LineBorder(new Color(0xFF000000, true), 1, true);
        Border bordobtn = new LineBorder(new Color(0xFF37C47A, true), 3, true);
        Border bordobtnInd = new LineBorder(new Color(0xFFF68E3B, true), 3, true);

        JLabel tiotoloVaccinato = new JLabel("Inserisci un nuovo Vaccinato:");
        tiotoloVaccinato.setFont(new Font("Georgia", Font.BOLD, 20));
        add(tiotoloVaccinato).setBounds(350, 0, 550, 55);


        JLabel labelnomeVac = new JLabel("Nome");
        labelnomeVac.setFont(new Font("Georgia", Font.ITALIC, 17));
        add(labelnomeVac).setBounds(140, 35, 550, 55);

        nome.setFont(new Font("Arial", Font.BOLD, 20));
        nome.setBorder(bordo);
        nome.setPreferredSize(new Dimension(325, 55));
        nome.setBounds(140, 80, 325, 55);

        JLabel labelcognomeVac = new JLabel("Cognome:");
        labelcognomeVac.setFont(new Font("Georgia", Font.ITALIC, 17));
        add(labelcognomeVac).setBounds(520, 35, 550, 55);

        cognome.setFont(new Font("Arial", Font.BOLD, 20));
        cognome.setBorder(bordo);
        cognome.setPreferredSize(new Dimension(325, 55));
        cognome.setBounds(520, 80, 325, 55);

        JLabel labelcf = new JLabel("Codice Fiscale:");
        labelcf.setFont(new Font("Georgia", Font.ITALIC, 17));
        add(labelcf).setBounds(140, 150, 550, 55);

        codiceFiscale.setFont(new Font("Arial", Font.BOLD, 20));
        codiceFiscale.setBorder(bordo);
        codiceFiscale.setPreferredSize(new Dimension(325, 55));
        codiceFiscale.setBounds(140, 195, 325, 55);

        JLabel labeldata = new JLabel("Data somministrazione (aaaa-mm-gg):");
        labeldata.setFont(new Font("Georgia",Font.ITALIC, 17));
        add(labeldata).setBounds(520, 150, 550, 55);

        data.setFont(new Font("Arial", Font.BOLD, 20));
        data.setBorder(bordo);
        data.setPreferredSize(new Dimension(325, 55));
        data.setBounds(520, 195, 325, 55);

        JLabel labelTipVac = new JLabel("Tipologia");
        labelTipVac.setFont(new Font("Georgia", Font.ITALIC, 17));
        add(labelTipVac).setBounds(140, 260, 550, 55);

        vaccinoSomministrato.setFont(new Font("Arial", Font.BOLD, 20));
        vaccinoSomministrato.setBorder(bordoCombo);
        vaccinoSomministrato.setBounds(140, 305, 325, 55);
        vaccinoSomministrato.setBackground(Color.WHITE);

        registraVaccinato.setBounds(380, 450, 230, 65);
        registraVaccinato.setFont(new Font("Georgia", Font.BOLD, 20));
        registraVaccinato.setBackground(new Color(0x07AF45));
        registraVaccinato.setForeground(Color.WHITE);
        registraVaccinato.setBorder(bordobtn);
        registraVaccinato.setFocusable(false);
        registraVaccinato.addActionListener(this);
        registraVaccinato.setOpaque(true);

        JLabel labelNome = new JLabel("Nome Centro Vaccinale:");
        labelNome.setFont(new Font("Georgia", Font.ITALIC, 17));
        add(labelNome).setBounds(520, 260, 550, 55);

        nomeCV.setFont(new Font("Arial", Font.BOLD, 20));
        nomeCV.setBorder(bordoCombo);
        nomeCV.setBounds(520, 305, 325, 55);
        nomeCV.setBackground(Color.WHITE);
        AutoCompleteDecorator.decorate(nomeCV);


       // ImageIcon ind = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/iconaindietro.png")));
        backToVaccineOperator =  new JButton("   INDIETRO");
        backToVaccineOperator.setBounds(90, 450, 230, 65);
        backToVaccineOperator.setFont(new Font("Georgia", Font.BOLD, 20));
        backToVaccineOperator.setBackground(new Color(0xFA4723));
        backToVaccineOperator.setForeground(Color.WHITE);
        backToVaccineOperator.setBorder(bordobtnInd);
        backToVaccineOperator.setFocusable(false);
        backToVaccineOperator.addActionListener(this);
        backToVaccineOperator.setOpaque(true);

        pulisci = new JButton("PULISCI");
        pulisci.setBounds(670, 450, 230, 65);
        pulisci.setFont(new Font("Georgia", Font.BOLD, 15));
        pulisci.setBackground(new Color(0xEF0808));
        pulisci.setForeground(Color.WHITE);
        pulisci.setBorder(bordobtnInd);
        pulisci.setFocusable(false);
        pulisci.addActionListener(this);
        pulisci.setOpaque(true);

        status.setFont(new Font("Georgia", Font.BOLD, 18));
        status.setBounds(125, 490, 400, 55);

        IDUnivoco.setFont(new Font("Georgia", Font.BOLD, 18));
        IDUnivoco.setBounds(125, 540, 400, 55);
        warningIDUnivoco.setFont(new Font("Georgia", Font.BOLD, 18));
        warningIDUnivoco.setBounds(125, 565, 600, 55);

        setLayout(null);

        add(backToVaccineOperator);
        add(nomeCV);
        add(nome);
        add(cognome);
        add(codiceFiscale);
        add(vaccinoSomministrato);
        add(registraVaccinato);
        add(pulisci);
        add(status);
        add(IDUnivoco);
        add(warningIDUnivoco);
        add(data);

        //Icona avvio del programma

        ImageIcon logo = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/logo.png")));
        setIconImage(logo.getImage());

        setTitle("Registra Vaccinato");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setSize (1000,600);
        setLocationRelativeTo(null);
        setForeground(Color.WHITE);
        setResizable(false);
        setVisible(true);

    }
    /**
     * metodo che permette la gestione degli eventi associati ai listener legati ai componenti d'interfaccia grafica
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backToVaccineOperator) {
            this.dispose();
            new UIVaccineOperator();
        }else  if (e.getSource() == registraVaccinato) {
            IDUnivoco.setText("");
            warningIDUnivoco.setText("");
            if (!nome.getText().equals("Paolo")){
                status.setForeground(new Color(0xEC0909));
                status.setText("I dati inseriti non sono corretti!");
            } else {
                status.setForeground(new Color(0x077507));
                status.setText("Centro Vaccinale registrato con successo!");
                IDUnivoco.setText("ID Univoco: 100000001");
                warningIDUnivoco.setText("ATTENZIONE! Memorizzare immediatamente l'id univoco!");

            }
        }else if(e.getSource() == pulisci) {
                nomeCV.setSelectedItem("Paolo");
                nome.setText("");
                cognome.setText("");
                codiceFiscale.setText("");
                data.setText(String.valueOf(todaysDate));
                vaccinoSomministrato.setSelectedItem("Pfizer");
                status.setText("");
                IDUnivoco.setText("");
                warningIDUnivoco.setText("");

            }
        }

    }

