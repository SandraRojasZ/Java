// Sandra Rojas Zegarrundo GU3030768

import java.awt.Color;
import java.awt.Desktop.Action;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora01 extends JFrame{
	
	private JFrame janela 	  = new JFrame("Calculadora");
	private JPanel pnlDisplay = new JPanel();
	private JPanel pnlButtons = new JPanel();
	private JTextField display = new  JTextField(); //para exibir e aceitar a entrada de texto. 
	
	private JButton btn7 	 = new JButton("7");
	private JButton btn8 	 = new JButton("8");
	private JButton btn9 	 = new JButton("9");
	private JButton btnSoma  = new JButton("+");
	private JButton btn4 	 = new JButton("4");
	private JButton btn5 	 = new JButton("5");
	private JButton btn6 	 = new JButton("6");
	private JButton btnSubtr = new JButton("-");
	private JButton btn1 	 = new JButton("1");
	private JButton btn2 	 = new JButton("2");
	private JButton btn3 	 = new JButton("3");
	private JButton btnMulti = new JButton("*");
	private JButton btn0 	 = new JButton("0");
	private JButton btnPonto = new JButton(".");
	private JButton btnIgual = new JButton("=");
	private JButton btnDiv   = new JButton("/");
	private String operand = "";
	
	public Calculadora01() {
		
		
		this.janela.setBounds(200, 200, 400, 600);
		this.janela.setLayout(null);
		this.pnlDisplay.setBounds(
				0, 0, 
				(int)(this.janela.getWidth()*0.98),  
				(int) (this.janela.getHeight()*0.15) 
			);
		this.pnlDisplay.setBackground(Color.BLUE);
		this.pnlDisplay.setLayout(null);
		this.display.setBounds(
				0, 0, 
				this.pnlDisplay.getWidth(), 
				this.pnlDisplay.getHeight()
			);
		
		Font defaultFont = new Font("Courier New", Font.BOLD , 48);
		this.display.setFont(defaultFont);
		
		this.display.setEditable(false);
		this.display.setHorizontalAlignment( JTextField.RIGHT );
		
		this.pnlDisplay.add(this.display);
		this.janela.add( this.pnlDisplay );
		this.pnlButtons.setBounds(
				0, 
				(int) (this.janela.getHeight()*0.15), 
				this.janela.getWidth(), 
				(int) (this.janela.getHeight()*0.75)  
			);
		
		
		this.btn7.setFont(defaultFont);
		this.btn8.setFont(defaultFont);
		this.btn9.setFont(defaultFont);
		this.btnSoma.setFont(defaultFont);
		this.btn4.setFont(defaultFont);
		this.btn5.setFont(defaultFont);
		this.btn6.setFont(defaultFont);
		this.btnSubtr.setFont(defaultFont);
		this.btn1.setFont(defaultFont);
		this.btn2.setFont(defaultFont);
		this.btn3.setFont(defaultFont);
		this.btnMulti.setFont(defaultFont);
		this.btn0.setFont(defaultFont);
		this.btnPonto.setFont(defaultFont);
		this.btnIgual.setFont(defaultFont);
		this.btnDiv.setFont(defaultFont);		
		
		// Adição de espaçamento entre os botões
		this.pnlButtons.setLayout(new GridLayout(4,4, 3, 3));
		this.pnlButtons.add(btn7);
		this.pnlButtons.add(btn8);
		this.pnlButtons.add(btn9);
		this.pnlButtons.add(btnSoma);
		this.pnlButtons.add(btn4);
		this.pnlButtons.add(btn5);
		this.pnlButtons.add(btn6);
		this.pnlButtons.add(btnSubtr);
		this.pnlButtons.add(btn1);
		this.pnlButtons.add(btn2);
		this.pnlButtons.add(btn3);
		this.pnlButtons.add(btnMulti);
		this.pnlButtons.add(btn0);
		this.pnlButtons.add(btnPonto);
		this.pnlButtons.add(btnIgual);
		this.pnlButtons.add(btnDiv);	
		
		this.btn0.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(display.getText().length() < 13) {    // quantidade de caracteres limitar para aparecer no display
					String label = ((JButton) e.getSource()).getText();
					display.setText( display.getText() + label );
				}				
			}
		});
		this.btn1.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(display.getText().length() < 13) {
					String label = ((JButton) e.getSource()).getText();
					display.setText( display.getText() + label );
				}				
			}
		});
		this.btn2.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(display.getText().length() < 13) {
					String label = ((JButton) e.getSource()).getText();
					display.setText( display.getText() + label );
				}				
			}
		});
		this.btn3.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(display.getText().length() < 13) {
					String label = ((JButton) e.getSource()).getText();
					display.setText( display.getText() + label );
				}				
			}
		});
		this.btn4.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(display.getText().length() < 13) {
					String label = ((JButton) e.getSource()).getText();
					display.setText( display.getText() + label );
				}				
			}
		});
		this.btn5.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(display.getText().length() < 13) {
					String label = ((JButton) e.getSource()).getText();
					display.setText( display.getText() + label );
				}				
			}
		});
		this.btn6.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(display.getText().length() < 13) {
					String label = ((JButton) e.getSource()).getText();
					display.setText( display.getText() + label );
				}
			}
		});
		this.btn7.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(display.getText().length() < 13) {
					String label = ((JButton) e.getSource()).getText();
					display.setText( display.getText() + label );
				}
			}
		});
		this.btn8.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(display.getText().length() < 13) {
					String label = ((JButton) e.getSource()).getText();
					display.setText( display.getText() + label );
				}
			}
		});
		this.btn9.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(display.getText().length() < 13) {
					String label = ((JButton) e.getSource()).getText();
					display.setText( display.getText() + label );
				}
			}
		});		
		
		this.btnPonto.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(display.getText().length() < 13) {
					//String label = ((JButton) e.getSource()).getText();					
					operand = ".";
					display.setText(display.getText() + operand);					
				}
			}
		});		
		
		
        this.btnSoma.addActionListener(new ActionListener() {           
            public void actionPerformed(ActionEvent e) {
            	if(display.getText().length() < 13) {
            		operand = "+";
            		display.setText(display.getText() + operand);
            	}
			}            
        });
        
        this.btnSubtr.addActionListener(new ActionListener() {           
            public void actionPerformed(ActionEvent e) {
            	if(display.getText().length() < 13) {
            		operand = "-";
            		display.setText(display.getText() + operand);
            	}
            }
        });
        this.btnMulti.addActionListener(new ActionListener() {           
            public void actionPerformed(ActionEvent e) {
            	if(display.getText().length() < 13) {
            		operand = "*";
            		display.setText(display.getText() + operand);
            	}
            }
        });
        
        this.btnDiv.addActionListener(new ActionListener() {           
            public void actionPerformed(ActionEvent e) {
            	if(display.getText().length() < 13) {
            		operand = "/";
            		display.setText(display.getText() + operand);
            	}
            }
        });
        
        this.btnIgual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {            	
                String[] numbers = display.getText().split(Pattern.quote(operand));       
                
                if (numbers.length == 2) {
                    double num1 = Double.parseDouble(numbers[0]);
                    double num2 = Double.parseDouble(numbers[1]);
                    double result = 0;

                    switch (operand) {
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            if (num2 != 0) {
                                result = num1 / num2;
                            } else {
                                display.setText("Erro: Divisão por zero");
                                return;
                            }
                            break;
                        default:
                            display.setText("Erro: Operação inválida");
                            return;
                    }

                    display.setText(String.valueOf(result));                   
                } else {
                    display.setText("Erro: Formato de entrada inválido");
                }
            }
        });

		this.janela.add( this.pnlButtons );
		this.janela.setVisible(true);
	}
}
