import javax.swing.*;
import java.awt.*;

public class Microwave extends JFrame{
 
  //set width and height of the frame
  public static final int Width = 380;
  public static final int Height = 220;
    
    //create JPanel addPanel, LPanel, RPanel for put component 
    JPanel addPanel = new JPanel();
    JPanel LPanel = new JPanel();
    JPanel RPanel = new JPanel();
    
    //create all copomnent
    JButton one = new JButton("1");
    JButton two = new JButton("2");
    JButton three = new JButton("3");
    JButton four = new JButton("4");
    JButton five = new JButton("5");
    JButton six = new JButton("6");
    JButton seven = new JButton("7");
    JButton eight = new JButton("8");
    JButton nine = new JButton("9");
    JButton ten = new JButton("0");
    JButton start = new JButton("start");
    JButton stop = new JButton("stop");
    
    //Left Big button
    JButton Fbutton = new JButton("Food to be placed here");
    
    //Textfirld 
    JTextField Time = new JTextField("Time to be displayed here");
    
  //JFrame of Microwave
  public Microwave(String title){
    super(title);
    setSize(Width,Height);
    setVisible(true);
      
     //set Layout of the frame
    setLayout(new BorderLayout());
    
    //add LeftPanel and RightPanel into frame
    add(LPanel, BorderLayout.CENTER);
    add(RPanel, BorderLayout.EAST);
    
    //set and addcomponenet into LeftPanel 
    LPanel.setLayout(new BorderLayout());
    LPanel.add(Fbutton, BorderLayout.CENTER);
    
    
    //add Time and addPanel into RPanel
    RPanel.setLayout(new BorderLayout());
    RPanel.add(Time, BorderLayout.NORTH);
    RPanel.add(addPanel, BorderLayout.CENTER);
    
    
     //add components into the addPanel 
    addPanel.setLayout(new GridLayout(4,3));
    addPanel.add(one);
    addPanel.add(two);
    addPanel.add(three);
    addPanel.add(four);
    addPanel.add(five);
    addPanel.add(six);
    addPanel.add(seven);
    addPanel.add(eight);
    addPanel.add(nine);
    addPanel.add(ten);
    addPanel.add(start);
    addPanel.add(stop);

    }
  //method main for run GUI Interface
  public static void main (String []args){
      new Microwave("The Front View Of a Microwave Oven");
  }
}

    


    
