import javax.swing.*;
import java.awt.event.*;
  
public class NumClicks implements ActionListener{
  final static String LABEL_TEXT = "Click Me!";
  JFrame frame; 
  JPanel contentPane; 
  JLabel label;
  JButton button; 
  int clicks = 0; 

  public NumClicks(){
    frame = new JFrame("NumClicks");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    contentPane = new JPanel(); 
    contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS)); 
    contentPane.setBorder(BorderFactory.createEmptyBorder(20,50,20,50));

    
    label = new JLabel(LABEL_TEXT);
    label.setAlignmentX(JLabel.CENTER_ALIGNMENT);
    label.setBorder(BorderFactory.createEmptyBorder(20,50,20,50));
    contentPane.add(label);

    button = new JButton("You have clicked " + clicks + " times.");
    button.setAlignmentX(JButton.CENTER_ALIGNMENT);
    button.setActionCommand("Hide");
    button.addActionListener(this);
    contentPane.add(button);
    
    frame.setContentPane(contentPane);

    frame.pack();
    frame.setVisible(true);
  }
  public void actionPerformed(ActionEvent event) {
    String eventName = event.getActionCommand();
    if (eventName.equals("Hide")) {
      button.setText("You have clicked " + clicks + " times.");
      button.setActionCommand("Hide");
      clicks++;
    } else {
      button.setText("You have clicked " + clicks + " times.");
      button.setActionCommand("Hide");
      clicks++;
    }
  }
  
  public static void runGUI() {
    JFrame.setDefaultLookAndFeelDecorated(true);

    NumClicks greeting = new NumClicks();
  }
}