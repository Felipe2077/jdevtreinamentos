package cursojava.threads;

import javax.swing.*;
import java.awt.*;

public class TelaTimeThread extends JDialog {

    private JPanel jPanel = new JPanel(new GridBagLayout());
    private JTextField mostraTempo = new JTextField();

    private  JLabel descricaoHora = new JLabel("Time da Thread 1");

    public TelaTimeThread() {

        setTitle("Minha tela de time com thread");
        setSize(new Dimension(600, 600));
        setLocationRelativeTo(null);
        setResizable(false);

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;

        descricaoHora.setPreferredSize(new Dimension(200, 25));
        jPanel.add(descricaoHora, gridBagConstraints);

        mostraTempo.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy++;
        jPanel.add(mostraTempo, gridBagConstraints);

        add(jPanel, BorderLayout.WEST);
        setVisible(true);
    }

}
