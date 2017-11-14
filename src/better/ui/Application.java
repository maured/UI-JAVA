package better.ui;
import static javax.swing.SwingUtilities.invokeLater;

public class Application {
    public static void main(String[] args) {
        invokeLater(new Runnable() {
            @Override
            public void run() {
                MenuWindow window = new MenuWindow();
                window.setVisible(true);
            }
        });
    }
}
