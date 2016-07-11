package window;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import functions.Method;

public class Window extends JFrame implements ActionListener{
	

	protected static JButton num1, num2, num3, num4, num5, num6, num7, num8, num9, num0, multi, divide, minus, add, delete, equals;
	
	String op;
	
	double number1, number2;
	
	public String num = "number1";
	public JTextArea outputl;
	

	
	public Window(String title){
		
		super(title);
		
		
		
		this.setSize(400, 650);
		
		this.init();
		this.setVisible(true);
		this.setResizable(false);
	}
	void init(){
		
		outputl = new JTextArea("");
		
		JPanel panel2 = new JPanel();
		
		JPanel options = new JPanel(new GridLayout(1,2));
		
		JPanel buttion = new JPanel(new GridLayout(2,4));
		
		JPanel panel = new JPanel(new GridLayout(6,3));
		panel2.add(outputl);
		buttionDeclare(panel, options, buttion);
		
		this.setLayout(new BorderLayout());
		 
		panel.setBackground(Color.green);
		panel2.setBackground(Color.white);
		panel2.setBorder(BorderFactory.createTitledBorder("OutPut"));
		
		this.add(panel, BorderLayout.CENTER);
		this.add(panel2, BorderLayout.NORTH);
		this.add(buttion, BorderLayout.AFTER_LAST_LINE);
		this.add(options, BorderLayout.EAST);
		
		
		
		
	}
	
	private void buttionDeclare(JPanel panel, JPanel panel2, JPanel buttions){
		num1 = new JButton("1");
		num2 = new JButton("2");
		num3 = new JButton("3");
		num4 = new JButton("4");
		num5 = new JButton("5");
		num6 = new JButton("6");
		num7 = new JButton("7");
		num8 = new JButton("8");
		num9 = new JButton("9");
		num0 = new JButton("0");
		add = new JButton("+");
		minus = new JButton("-");
		multi = new JButton("X");
		divide = new JButton("÷");
		equals = new JButton("=");
		delete = new JButton("⇐");
		
		num1.setFont(new Font("Arial", Font.PLAIN, 40));
		num2.setFont(new Font("Arial", Font.PLAIN, 40));
		num3.setFont(new Font("Arial", Font.PLAIN, 40));
		num4.setFont(new Font("Arial", Font.PLAIN, 40));
		num5.setFont(new Font("Arial", Font.PLAIN, 40));
		num6.setFont(new Font("Arial", Font.PLAIN, 40));
		num7.setFont(new Font("Arial", Font.PLAIN, 40));
		num8.setFont(new Font("Arial", Font.PLAIN, 40));
		num9.setFont(new Font("Arial", Font.PLAIN, 40));
		num0.setFont(new Font("Arial", Font.PLAIN, 40));
		add.setFont(new Font("Arial", Font.PLAIN, 40));
		minus.setFont(new Font("Arial", Font.PLAIN, 40));
		multi.setFont(new Font("Arial", Font.PLAIN, 40));
		divide.setFont(new Font("Arial", Font.PLAIN, 40));
		equals.setFont(new Font("Arial", Font.PLAIN, 40));
		
		panel.add(num1);
		panel.add(num2);
		panel.add(num3);
		panel.add(num4);
		panel.add(num5);
		panel.add(num6);
		panel.add(num7);
		panel.add(num8);
		panel.add(num9);
		panel.add(num0);
		buttions.add(add);
		buttions.add(minus);
		buttions.add(divide);
		buttions.add(multi);
		panel2.add(equals);
		panel2.add(delete);
		
		
		num1.addActionListener(this);
		num2.addActionListener(this);
		num3.addActionListener(this);
		num4.addActionListener(this);
		num5.addActionListener(this);
		num6.addActionListener(this);
		num7.addActionListener(this);
		num8.addActionListener(this);
		num9.addActionListener(this);
		num0.addActionListener(this);
		add.addActionListener(this);
		minus.addActionListener(this);
		divide.addActionListener(this);
		multi.addActionListener(this);
		delete.addActionListener(this);
		equals.addActionListener(this);
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == num1){ //Number 1
			switch(num){
				case "number1":
					outputl.append("1");
				break;
				case "number2":
					outputl.append("1");
				break;
			}
        }//end of number1
		else if(event.getSource() == num2){ //Number
			switch(num){
			case "number1":
				outputl.append("2");
			break;
			case "number2":
				outputl.append("2");
			break;
		}
        }//end of number
		else if(event.getSource() == num3){ //Number 1
			switch(num){
			case "number1":
				outputl.append("3");
			break;
			case "number2":
				outputl.append("3");
			break;
		}
        }//end of number1
		else if(event.getSource() == num4){ //Number
			switch(num){
			case "number1":
				outputl.append("4");
			break;
			case "number2":
				outputl.append("4");
			break;
		}
        }//end of number
		else if(event.getSource() == num5){ //Number
			switch(num){
			case "number1":
				outputl.append("5");
			break;
			case "number2":
				outputl.append("5");
			break;
		}
        }//end of number
		else if(event.getSource() == num6){ //Number
			switch(num){
			case "number1":
				outputl.append("6");
			break;
			case "number2":
				outputl.append("6");
			break;
		}
        }//end of number
		else if(event.getSource() == num7){ //Number
			switch(num){
			case "number1":
				outputl.append("7");
			break;
			case "number2":
				outputl.append("7");
			break;
		}
        }//end of number
		else if(event.getSource() == num8){ //Number
			switch(num){
			case "number1":
				outputl.append("8");
			break;
			case "number2":
				outputl.append("8");
			break;
		}
        }//end of number
		else if(event.getSource() == num9){ //Number
			switch(num){
			case "number1":
				outputl.append("9");
			break;
			case "number2":
				outputl.append("9");
			break;
		}
        }//end of number
		else if(event.getSource() == num0){ //Number
			switch(num){
			case "number1":
				outputl.append("0");
			break;
			case "number2":
				outputl.append("0");
			break;
		}
        }//end of number
		
//================================================={[Operations}]==========================================================
		else if(event.getSource() == add){ //Number
			switch(num){
			case "number1":
				number1 = Double.parseDouble(outputl.getText());
				outputl.setText("");
				num = "number2";
				op = "add";
			break;
			case "number2":
				 JOptionPane.showMessageDialog(null, "You already have an operation. Click =", "Calc-Addition-Error", JOptionPane.ERROR_MESSAGE);
			break;
		}
        }
		else if(event.getSource() == minus){ //Number
			switch(num){
			case "number1":
				number1 = Double.parseDouble(outputl.getText());
				outputl.setText("");
				num = "number2";
				op = "minus";
			break;
			case "number2":
				 JOptionPane.showMessageDialog(null, "You already have an operation. Click =", "Calc-Subtraction-Error", JOptionPane.ERROR_MESSAGE);
			break;
		}
        }
		else if(event.getSource() == multi){ //Number
			switch(num){
			case "number1":
				number1 = Double.parseDouble(outputl.getText());
				outputl.setText("");
				num = "number2";
				op = "multi";
			break;
			case "number2":
				 JOptionPane.showMessageDialog(null, "You already have an operation. Click =", "Calc-Multiply-Error", JOptionPane.ERROR_MESSAGE);
			break;
		}
        }
		else if(event.getSource() == divide){ //Number
			switch(num){
			case "number1":
				number1 = Double.parseDouble(outputl.getText());
				outputl.setText("");
				num = "number2";
				op = "divide";
			break;
			case "number2":
				 JOptionPane.showMessageDialog(null, "You already have an operation. Click =", "Calc-Division-Error", JOptionPane.ERROR_MESSAGE);
			break;
		}
        }
//=====================================================[Options]==================================================
		else if(event.getSource() == delete){ //Number
			outputl.setText("");
			num = "number1";
			number1 = 0;
			number2 = 0;
			JOptionPane.showMessageDialog(null, "You have succesfully reseted the calaculator", "Calc Reset", JOptionPane.DEFAULT_OPTION);
		
        }
		else if(event.getSource() == equals){ //Number
			switch(num){
			case "number1":
				JOptionPane.showMessageDialog(null, "You haven't selected an operation!", "Calc-equals-Error", JOptionPane.ERROR_MESSAGE);
			break;
			case "number2":
				if(outputl.getText().length() >= 1){
					number2 = Double.parseDouble(outputl.getText());
					switch(op){
					case "add":
						outputl.setText(Double.toString(Method.add(number1, number2)));
						break;
					case "minus":
						outputl.setText(Double.toString(Method.minus(number1, number2)));
						break;
					case "multi":
						outputl.setText(Double.toString(Method.multi(number1, number2)));
						break;
					case "divide":
						outputl.setText(Double.toString(Method.divide(number1, number2)));
						break;
					}//end of switch of op
				}else{
					JOptionPane.showMessageDialog(null, "There are no numbers!", "Calc-Number-Error", JOptionPane.ERROR_MESSAGE);
				}
			break;
		}
        }
         
    }//end of evaluation

	
	
}
