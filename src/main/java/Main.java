// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import javax.swing.*;

public class Main {
  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        NumClicks.runGUI();
      }
    });
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}