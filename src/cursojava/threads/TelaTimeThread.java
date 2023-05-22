package cursojava.threads;

import javax.swing.*;
import java.awt.*;

public class TelaTimeThread extends JDialog {

    private JPanel jPanel = new JPanel(new GridBagLayout());

    private  JLabel descricaoHora = new JLabel("Time da Thread 1");
    private JTextField mostraTempo = new JTextField();

    private  JLabel descricaoHora2 = new JLabel("Time da Thread 2");
    private JTextField mostraTempo2 = new JTextField();

    private JButton jButton = new JButton("start");
    private JButton jButton2 = new JButton("stop");


    public TelaTimeThread() {

        setTitle("Minha tela de time com thread");
        setSize(new Dimension(240, 240));
        setLocationRelativeTo(null);
        setResizable(false);

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new Insets(5, 10,5,5);
        gridBagConstraints.anchor = GridBagConstraints.WEST;

        descricaoHora.setPreferredSize(new Dimension(200, 25));
        jPanel.add(descricaoHora, gridBagConstraints);

        mostraTempo.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy++;
        mostraTempo.setEditable(false);
        jPanel.add(mostraTempo, gridBagConstraints);

       descricaoHora2.setPreferredSize(new Dimension(200,25));
       gridBagConstraints.gridy++;
       jPanel.add(descricaoHora2, gridBagConstraints);

       mostraTempo2.setPreferredSize(new Dimension(200, 25));
       gridBagConstraints.gridy++;
       mostraTempo2.setEditable(false);
       jPanel.add(mostraTempo2, gridBagConstraints);

       gridBagConstraints.gridwidth = 1;

       jButton.setPreferredSize(new Dimension(92,25));
       gridBagConstraints.gridy++;
       jPanel.add(jButton,gridBagConstraints);

       jButton2.setPreferredSize(new Dimension(92,25));
        gridBagConstraints.gridx++;
        jPanel.add(jButton2, gridBagConstraints);


        add(jPanel, BorderLayout.WEST);
        setVisible(true);
    }

}
