import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
public class Calculator implements ActionListener{
	
	boolean isOperatorClicked=false;
	
	
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton,clearButton;
	JButton twoButton;
	JButton threeButton;
	JButton zeroButton;
	JButton dotButton;
	JButton equalButton;
	JButton divButton;
	JButton minusButton;
	JButton mulButton;
	JButton plusButton;
	String oldValue;
	String operator;
	float result;

	
	
	
	
	public Calculator() {
		jf=new JFrame("calculator");
		jf.setLayout(null);
		jf.setSize(550,600);
		jf.setLocation(10, 10);
		
		displayLabel=new JLabel();
		displayLabel.setBounds(30,40,480,50);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		displayLabel.setFont(new Font("arial", Font.PLAIN, 26));
		
		
		sevenButton=new JButton("7");
		sevenButton.addActionListener(this);
		sevenButton.setFont(new Font("arial",Font.PLAIN,40));
		sevenButton.setBounds(30,130,80,80);
		
		jf.add(sevenButton);
		
	    eightButton=new JButton("8");
	    eightButton.addActionListener(this);
		eightButton.setFont(new Font("arial",Font.PLAIN,40));
		eightButton.setBounds(130,130,80,80);
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.addActionListener(this);
		nineButton.setFont(new Font("arial",Font.PLAIN,40));		
		nineButton.setBounds(230,130,80,80);
		jf.add(nineButton);
		
		
		fourButton=new JButton("4");
		fourButton.addActionListener(this);
		fourButton.setFont(new Font("arial",Font.PLAIN,40));
		fourButton.setBounds(30,230,80,80);
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.addActionListener(this);
		fiveButton.setFont(new Font("arial",Font.PLAIN,40));
        fiveButton.setBounds(130,230,80,80);
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.addActionListener(this);
		sixButton.setFont(new Font("arial",Font.PLAIN,40));
		sixButton.setBounds(230,230,80,80);
		jf.add(sixButton);
		
		
		oneButton=new JButton("1");
		oneButton.addActionListener(this);
		oneButton.setFont(new Font("arial",Font.PLAIN,40));
		oneButton.setBounds(30,330,80,80);
		jf.add(oneButton);
		
		twoButton=new	 JButton("2");
		twoButton.addActionListener(this);
		twoButton.setFont(new Font("arial",Font.PLAIN,40));
		twoButton.setBounds(130,330,80,80);
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.addActionListener(this);
		threeButton.setFont(new Font("arial",Font.PLAIN,40));
		threeButton.setBounds(230,330,80,80);
		jf.add(threeButton);
		
		
		dotButton=new JButton(".");
		dotButton.addActionListener(this);
		dotButton.setFont(new Font("arial",Font.PLAIN,40));
		dotButton.setBounds(30,430,80,80);
		jf.add(dotButton);
		
		zeroButton=new JButton("0");
		zeroButton.addActionListener(this);
		zeroButton.setFont(new Font("arial",Font.PLAIN,40));
		zeroButton.setBounds(130,430,80,80);
		jf.add(zeroButton);
		
		equalButton=new JButton("=");
		equalButton.addActionListener(this);
		equalButton.setFont(new Font("arial",Font.PLAIN,40));
		equalButton.setBounds(230,430,80,80);
		jf.add(equalButton);
		
		
		divButton=new JButton("/");
		divButton.addActionListener(this);
		divButton.setFont(new Font("arial",Font.PLAIN,40));
		divButton.setBounds(430,130,80,280);
		jf.add(divButton);
		
		
		mulButton=new JButton("X");
		mulButton.addActionListener(this);
		mulButton.setFont(new Font("arial",Font.PLAIN,40));
		mulButton.setBounds(330,230,80,80);
		jf.add(mulButton);
		
		
		minusButton=new JButton("-");
		minusButton.addActionListener(this);
		minusButton.setFont(new Font("arial",Font.PLAIN,40));
		minusButton.setBounds(330,330,80,80);
		jf.add(minusButton);
		
		plusButton=new JButton("+");
		plusButton.addActionListener(this);
		plusButton.setFont(new Font("arial",Font.PLAIN,40));
		plusButton.setBounds(330,430,180,80);
		jf.add(plusButton);
		
		clearButton=new JButton("C");
		clearButton.addActionListener(this);
		clearButton.setFont(new Font("arial",Font.PLAIN,40));
		clearButton.setBounds(330,130,80,80);
		jf.add(clearButton);
		
		
		
		
		
		jf.add(displayLabel);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args) {
		new Calculator();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==equalButton) {
		jf.getContentPane().setBackground(Color.blue);
		String newValue=displayLabel.getText();
		float oldValueF=Float.parseFloat(oldValue);
		float newValueF=Float.parseFloat(newValue);
		result=newValueF+oldValueF;
		displayLabel.setText(result+"");
		
		}else if(e.getSource()==sevenButton) {
			
			if(isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked=false;
			}else {
				
			displayLabel.setText(displayLabel.getText()+"7");
			}
		
		}else if(e.getSource()==eightButton) {

			
			if(isOperatorClicked) {
				displayLabel.setText("8");
				isOperatorClicked=false;
			}else {
				
			displayLabel.setText(displayLabel.getText()+"8");
			}
		
		
		}else if(e.getSource()==nineButton) {

			
			if(isOperatorClicked) {
				displayLabel.setText("9");
				isOperatorClicked=false;
			}else {
				
			displayLabel.setText(displayLabel.getText()+"9");
			}
		
		
		}else if(e.getSource()==fourButton) {

			
			if(isOperatorClicked) {
				displayLabel.setText("4");
				isOperatorClicked=false;
			}else {
				
			displayLabel.setText(displayLabel.getText()+"4");
			}
		
		
		}else if(e.getSource()==fiveButton) {

			
			if(isOperatorClicked) {
				displayLabel.setText("5");
				isOperatorClicked=false;
			}else {
				
			displayLabel.setText(displayLabel.getText()+"5");
			}
		
		
		}else if(e.getSource()==sixButton) {

			
			if(isOperatorClicked) {
				displayLabel.setText("6");
				isOperatorClicked=false;
			}else {
				
			displayLabel.setText(displayLabel.getText()+"6");
			}
		
		
		}else if(e.getSource()==zeroButton) {

			
			if(isOperatorClicked) {
				displayLabel.setText("0");
				isOperatorClicked=false;
			}else {
				
			displayLabel.setText(displayLabel.getText()+"0");
			}
		
		
		}else if(e.getSource()==oneButton) {

			
			if(isOperatorClicked) {
				displayLabel.setText("1");
				isOperatorClicked=false;
			}else {
				
			displayLabel.setText(displayLabel.getText()+"1");
			}
		
		
		}else if(e.getSource()==twoButton) {

			
			if(isOperatorClicked) {
				displayLabel.setText("2");
				isOperatorClicked=false;
			}else {
				
			displayLabel.setText(displayLabel.getText()+"2");
			}
		
		
		}else if(e.getSource()==threeButton) {

			
			if(isOperatorClicked) {
				displayLabel.setText("3");
				isOperatorClicked=false;
			}else {
				
			displayLabel.setText(displayLabel.getText()+"3");
			}
		
		
		}else if(e.getSource()==dotButton) {

			
			if(isOperatorClicked) {
				displayLabel.setText(".");
				isOperatorClicked=false;
			}else {
				
			displayLabel.setText(displayLabel.getText()+".");
			}
		
		
		}else if(e.getSource()==clearButton) {
			jf.getContentPane().setBackground(Color.white);
			displayLabel.setText("");
		}else if(e.getSource()==plusButton) {
			operator="+";
			oldValue=displayLabel.getText();
			isOperatorClicked=true;
		}else if(e.getSource()==minusButton) {
			operator="-";
			oldValue=displayLabel.getText();
			isOperatorClicked=true;
		}else if(e.getSource()==divButton) {
			operator="/";
			oldValue=displayLabel.getText();
			isOperatorClicked=true;
		}else if(e.getSource()==mulButton) {
			operator="*";
			oldValue=displayLabel.getText();
			isOperatorClicked=true;
		}
		
	
		
		
		
	}
}
