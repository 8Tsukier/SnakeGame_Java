import javax.swing.*;

public class MainWindow extends JFrame {
    MainWindow()
    {
        setTitle("Snakieeee");
        setSize(320, 345);
        setLocation(400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(new GameField());
        setVisible(true);
    }

    public static void main (String[] args)
    {
        MainWindow mw = new MainWindow();
    }
}
