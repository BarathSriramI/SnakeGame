import javax.swing.*;

public class frame extends JFrame{
    // create frame constructor
    frame()
    {
        this.add(new panel());
        this.setTitle("Snake Game");
        this.setResizable(false);
        this.setVisible(true);
        this.pack();
    }

}
