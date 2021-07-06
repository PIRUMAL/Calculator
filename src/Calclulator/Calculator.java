package Calclulator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Calculator  implements ActionListener{
 JFrame frame=new JFrame();
 JPanel panel=new JPanel();
 JTextArea textarea=new JTextArea(2,10); 
 
 
 JButton button1 =new JButton();
 JButton button2 =new JButton();
 
 JButton button3 =new JButton();
 
 JButton button4 =new JButton();
 
 JButton button5 =new JButton();
 
 JButton button6=new JButton();
 
 JButton button7 =new JButton();
 
 JButton button8 =new JButton();
 
 JButton button9 =new JButton();
 
 JButton button0 =new JButton();
 
 
 
 
 JButton buttonadd =new JButton();
 JButton buttonsub =new JButton();
 JButton buttonmul =new JButton();
 JButton buttondiv =new JButton();
 JButton buttonclear =new JButton();
 JButton buttondot =new JButton();
 JButton buttonequal =new JButton();
  
 double number1,number2,result;
  int add=0,sub=0,mul=0,div=0;
  
  public Calculator()
  {
	  frame.setSize(340, 450);
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.setVisible(true);
	  frame.setTitle("Piru's calculator");
	  frame.setResizable(false);
	  frame.add(panel);
	  panel.setBackground(Color.BLUE);
	  Border border=BorderFactory.createLineBorder(Color.RED,4);
	  
	  panel.add(textarea);
	  textarea.setBackground(Color.DARK_GRAY);
	  Border tborder=BorderFactory.createLineBorder(Color.green, 3);
	  textarea.setBorder(tborder);
	  Font font=new Font("arial",Font.BOLD,33);	  
	  textarea.setFont(font);
	  textarea.setForeground(Color.GRAY);
	  textarea.setPreferredSize(new Dimension(2,10));
	  textarea.setLineWrap(true);
	  
	  button1.setPreferredSize(new Dimension (1024,1024));
	  
	  button1.setIcon(new ImageIcon("C:\\Users\\piru mohon mal\\Desktop\\istockphoto-465549296-1024x1024.jpg"));
	  
	  button2.setIcon(new ImageIcon("C:\\Users\\piru mohon mal\\Desktop\\images.jpg"));
	  
	  button3.setIcon(new ImageIcon("C:\\Users\\piru mohon mal\\Desktop\\images (1).jpg"));
	  
	  button4.setIcon(new ImageIcon("C:\\Users\\piru mohon mal\\Desktop\\images.png")); 
	  
	  button5.setIcon(new ImageIcon("C:\\Users\\piru mohon mal\\Desktop\\images (2).jpg"));
	  
	  
	  button6.setIcon(new ImageIcon("C:\\Users\\piru mohon mal\\Desktop\\download.jpg"));
	  
	  button7.setIcon(new ImageIcon("C:\\Users\\piru mohon mal\\Desktop\\images (3).jpg"));
	  
	  button8.setIcon(new ImageIcon("C:\\Users\\piru mohon mal\\Desktop\\images (4).jpg"));
	  
	  button9.setIcon(new ImageIcon("C:\\Users\\piru mohon mal\\Desktop\\download (1).jpg"));
	  
	  button0.setIcon(new ImageIcon("C:\\Users\\piru mohon mal\\Desktop\\images (5).jpg"));
	  
     button1.setPreferredSize(new Dimension (1024,1024));
	  
	  buttondot.setIcon(new ImageIcon("C:\\Users\\piru mohon mal\\Desktop\\download.png"));
	  
    button1.setPreferredSize(new Dimension (1024,1024));
	  
	  buttonadd.setIcon(new ImageIcon("C:\\Users\\piru mohon mal\\Desktop\\download (1).png"));
	  
	  
button1.setPreferredSize(new Dimension (1024,1024));
	  
	  buttonsub.setIcon(new ImageIcon("C:\\Users\\piru mohon mal\\Desktop\\images (1).png"));
	 

button1.setPreferredSize(new Dimension (1024,1024));
	  
	  buttonmul.setIcon(new ImageIcon("C:\\Users\\piru mohon mal\\Desktop\\images (7).png")); 
	  
button1.setPreferredSize(new Dimension (1024,1024));
	  
	  buttondiv.setIcon(new ImageIcon("C:\\Users\\piru mohon mal\\Desktop\\images (2).png"));
	  
	  
button1.setPreferredSize(new Dimension (1024,1024));
	  
	  buttonclear.setIcon(new ImageIcon("C:\\Users\\piru mohon mal\\Desktop\\images (3).png"));
	   
	  panel.add(button1);
	  
	  panel.add( button2);
	  
	  panel.add(button3);
	  
	  panel.add(button4);
	  
	  panel.add(button5);
	  
	  panel.add(button6);
	  
	  panel.add(button7);
	  
	  panel.add(button8);
	  
	  panel.add(button9);
	  
	  
	  panel.add(button0);
	  panel.add( buttondot);
	  
	  panel.add( buttonadd);
	  
	  panel.add(buttonsub );
	  
	  panel.add(buttonmul);
	  panel.add( buttondiv);
	  panel.add(buttonclear );
	  button1.addActionListener((ActionListener) this);
	  button2.addActionListener((ActionListener) this);
	  
	  button3.addActionListener((ActionListener) this);
	  
	  button4.addActionListener((ActionListener) this);
	  
	  button5.addActionListener((ActionListener) this);
	  
	  button6.addActionListener((ActionListener) this);
	  
	  button7.addActionListener((ActionListener) this);
	  
	  button8.addActionListener((ActionListener) this);
	  
	  button9.addActionListener((ActionListener) this);
	  
	  button0.addActionListener((ActionListener) this);
	  
	  buttondot.addActionListener((ActionListener) this);
	  
	  buttonadd.addActionListener((ActionListener) this);
	  
	  
	  buttonsub.addActionListener((ActionListener) this);
	  
	  buttonmul.addActionListener((ActionListener) this);
	  
	  buttonsub.addActionListener((ActionListener) this);
	  
	  
	  buttondiv.addActionListener((ActionListener) this);
	  
	  buttonclear.addActionListener((ActionListener) this);
	    
  }
 
  public class HelloActionListener implements ActionListener {

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        System.out.println("Hello Folks");
	    }
	}
  
  
 public void actionPerformed(ActionEvent e)
 {
	Object source=e.getSource(); 
	if(source== buttonclear) {
		number1=0.0;
		number2=0.0;
		textarea.setText("");
	}
	
	
	
 }
 
 
}
