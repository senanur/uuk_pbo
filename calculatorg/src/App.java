import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class App extends JFrame{
	private static JTextField tampilanTextField = new JTextField();

	private static String operant1 = "";
	private static String operant2 = "";
	private static String operatorDipilih = "";
	private boolean setelahOperator = false;

	private JButton button1 = new JButton("1");
	private JButton button2 = new JButton("2"); 
	private JButton AddButton = new JButton("+");
	private JButton EqualsButton = new JButton("=");
	private JPanel panel = new JPanel();

	Dimension dimensi = Toolkit.getDefaultToolkit().getScreenSize();
	private int jml=1;

	App(){
		super("KALKULATOR GLENN");
		panel.setLayout(null);
		setSize(350,200);
		setLocation(dimensi.width/2-getWidth()/2,dimensi.height/2-getHeight()/2);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		tampilanTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
		tampilanTextField.setEditable(false);
		tampilanTextField.setBounds(55,20,200,25);

		button1.addActionListener(new HandlerButton());
		button2.addActionListener(new HandlerButton());
		AddButton.addActionListener(new HandlerButton());
		EqualsButton.addActionListener(new HandlerButton());

		panel.add(tampilanTextField);

		panel.add(button1);
		panel.add(button2);
		panel.add(AddButton);
		panel.add(EqualsButton);

		getContentPane().add(panel);
		setVisible(true);
	}
	private class HandlerButton implements ActionListener{
		public void actionPerformed(ActionEvent e){
			JButton button = (JButton)e.getSource();

			if (button.getText().equals("1")) {
				if (setelahOperator) {tampilanTextField.setText("1");
				} else{
					tampilanTextField.setText(tampilanTextField.getText()+"1");
				}
				setelahOperator=false;
			}else if (button.getText().equals("2")){
				if (setelahOperator) {
					tampilanTextField.setText("2");
				}else {
					tampilanTextField.setText(tampilanTextField.getText()+"2");
				}
				setelahOperator = false;

			}else if (button.getText().equals("+")) {
				operatorDipilih = "+";
				setelahOperator = true;
		
			}else if (button.getText().equals("=")) {
				operant2 = tampilanTextField.getText();

				double operantPertama = 0;
				double operantKedua = 0;

				try{
					operantPertama = Double.parseDouble(operant1);
				}catch (Exception ex) {
				}

				try{
					operantKedua = Double.parseDouble(operant2);
				}catch (Exception ex) {
				}

				if (operatorDipilih == "+") {
					tampilanTextField.setText(Double.toString(operantPertama+operantKedua));
					
				}
				
			}
		}
	}
  public static void main(String args[]){
    new App();
  }

 }