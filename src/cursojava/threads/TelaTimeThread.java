package cursojava.threads;

import javax.swing.*;
import java.awt.*;

public class TelaTimeThread extends JDialog {

    public TelaTimeThread(){

        setTitle("Minha tela de time com thread");
        setSize(new Dimension(600,600));
        setLocationRelativeTo(null);
        setResizable(false);

        setVisible(true);
    }

}
