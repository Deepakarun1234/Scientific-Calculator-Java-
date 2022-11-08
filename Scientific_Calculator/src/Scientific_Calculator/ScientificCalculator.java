package Scientific_Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Label;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class ScientificCalculator {

	private JFrame frmStandardCalculator;
	private JTextField txtDisplay;
	private JTextField jlblConverts;

	double firstnum;
	double secondnum;
	double  result;
	String operations;
	String answer;
	
	double[] i = new double[5];
	
	double Nigerian_Naira = 535.96;
	double US_Dollar = 1.52;
	double Kenyan_Shilling = 156.21;
	double Brazilian_Real = 5.86;
	double Canadian_Dollar = 2.03;
	double Indian_Rupee = 100.68;
	double Philippine_Peso =71.74;
	double Indonesian_Rupiah = 20746.75;
	
	/** 
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScientificCalculator window = new ScientificCalculator();
					window.frmStandardCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ScientificCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStandardCalculator = new JFrame();
		frmStandardCalculator.setTitle("Standard Calculator");
		frmStandardCalculator.setBounds(100, 100, 273, 380);
		frmStandardCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmStandardCalculator.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem Standered = new JMenuItem("Standard");
		Standered.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmStandardCalculator.setTitle("Standard Calculator");
				frmStandardCalculator.setBounds(100, 100, 275, 377);
				txtDisplay.setBounds(10,11,243,37);
			}
		});
		mnNewMenu.add(Standered);
		
		JMenuItem Scientific = new JMenuItem("Scientific");
		Scientific.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmStandardCalculator.setTitle("Scientific Calculator");
				frmStandardCalculator.setBounds(100, 100, 485, 377);
				txtDisplay.setBounds(10,11,454,37);
			}
		});
		mnNewMenu.add(Scientific);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Unit Conversion");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmStandardCalculator.setTitle("Unit Conversion");
				frmStandardCalculator.setBounds(100, 100, 750, 377);
				txtDisplay.setBounds(10,11,454,37);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Exit");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		frmStandardCalculator.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setBounds(10, 11, 243, 37);
		frmStandardCalculator.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton btnNewButton = new JButton("\uF0E7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace=null;
				if(txtDisplay.getText().length()>0) {
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length()-1);
					backspace = strB.toString();
					txtDisplay.setText(backspace);
				}
			}
		});
		btnNewButton.setFont(new Font("Wingdings", Font.BOLD, 13));
		btnNewButton.setBounds(10, 59, 51, 52);
		frmStandardCalculator.getContentPane().add(btnNewButton);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum=txtDisplay.getText()+btn7.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn7.setBounds(10, 106, 51, 52);
		frmStandardCalculator.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum=txtDisplay.getText()+btn4.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn4.setBounds(10, 155, 51, 52);
		frmStandardCalculator.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum=txtDisplay.getText()+btn1.getText();
				txtDisplay.setText(iNum);
				
			}
		});
		btn1.setBounds(10, 202, 51, 52);
		frmStandardCalculator.getContentPane().add(btn1);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(null);
			}
		});
		btnCe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCe.setBounds(58, 59, 51, 52);
		frmStandardCalculator.getContentPane().add(btnCe);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum=txtDisplay.getText()+btn8.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn8.setBounds(58, 106, 51, 52);
		frmStandardCalculator.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum=txtDisplay.getText()+btn5.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn5.setBounds(58, 155, 51, 52);
		frmStandardCalculator.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum=txtDisplay.getText()+btn2.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn2.setBounds(58, 202, 51, 52);
		frmStandardCalculator.getContentPane().add(btn2);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum=txtDisplay.getText()+btn00.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn00.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn00.setBounds(105, 59, 51, 52);
		frmStandardCalculator.getContentPane().add(btn00);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum=txtDisplay.getText()+btn9.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn9.setBounds(105, 106, 51, 52);
		frmStandardCalculator.getContentPane().add(btn9);
		
		JButton btnPlusMinus = new JButton("±");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops =Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=ops*(-1);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPlusMinus.setBounds(154, 59, 51, 52);
		frmStandardCalculator.getContentPane().add(btnPlusMinus);
		
		JButton btnSqrt = new JButton("√");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops =Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=Math.sqrt(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnSqrt.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSqrt.setBounds(202, 59, 51, 52);
		frmStandardCalculator.getContentPane().add(btnSqrt);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 
					firstnum = Double.parseDouble(txtDisplay.getText());
					txtDisplay.setText("");
					operations = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDiv.setBounds(154, 106, 51, 52);
		frmStandardCalculator.getContentPane().add(btnDiv);
		
		JButton btnRMod = new JButton("%");
		btnRMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
			}
		});
		btnRMod.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRMod.setBounds(202, 106, 51, 52);
		frmStandardCalculator.getContentPane().add(btnRMod);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum=txtDisplay.getText()+btn6.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn6.setBounds(105, 155, 51, 52);
		frmStandardCalculator.getContentPane().add(btn6);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnMult.setBounds(154, 155, 51, 52);
		frmStandardCalculator.getContentPane().add(btnMult);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum=txtDisplay.getText()+btn3.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn3.setBounds(105, 202, 51, 52);
		frmStandardCalculator.getContentPane().add(btn3);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSub.setBounds(154, 202, 51, 52);
		frmStandardCalculator.getContentPane().add(btnSub);
		
		JButton btnx = new JButton("1/x");
		btnx.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnx.setBounds(202, 155, 51, 52);
		frmStandardCalculator.getContentPane().add(btnx);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum=txtDisplay.getText()+btnDot.getText();
				txtDisplay.setText(iNum);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDot.setBounds(105, 254, 51, 52);
		frmStandardCalculator.getContentPane().add(btnDot);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPlus.setBounds(154, 254, 51, 52);
		frmStandardCalculator.getContentPane().add(btnPlus);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum=txtDisplay.getText()+btn0.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn0.setBounds(10, 254, 99, 52);
		frmStandardCalculator.getContentPane().add(btn0);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum = Double.parseDouble(txtDisplay.getText());
				if(operations =="+")
				{
					result=firstnum +secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
		
				else if(operations == "-")
				{
					result =firstnum - secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations == "*")
				{
					result =firstnum * secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations == "/")
				{
					result =firstnum / secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
			}
		});
		btnEquals.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnEquals.setBounds(202, 202, 51, 104);
		frmStandardCalculator.getContentPane().add(btnEquals);
		
		JButton btnLog = new JButton("Log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops =Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=Math.log(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnLog.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnLog.setBounds(263, 59, 51, 52);
		frmStandardCalculator.getContentPane().add(btnLog);
		
		JButton btnPi = new JButton("π");
		btnPi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops;
				ops=(3.1415926535897932384636433832795);
						txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnPi.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnPi.setBounds(263, 108, 51, 52);
		frmStandardCalculator.getContentPane().add(btnPi);
		
		JButton btnxy = new JButton("x^y");
		btnxy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops =Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=Math.pow(ops,ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnxy.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnxy.setBounds(263, 157, 51, 52);
		frmStandardCalculator.getContentPane().add(btnxy);
		
		JButton btnx2 = new JButton("x^2");
		btnx2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops =Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=(ops*ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnx2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnx2.setBounds(263, 204, 51, 52);
		frmStandardCalculator.getContentPane().add(btnx2);
		
		JButton btnNewButton_11_1_16 = new JButton("x^3");
		btnNewButton_11_1_16.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_11_1_16.setBounds(263, 254, 51, 52);
		frmStandardCalculator.getContentPane().add(btnNewButton_11_1_16);
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				double ops =Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=Math.sin(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnSin.setBounds(312, 60, 51, 52);
		frmStandardCalculator.getContentPane().add(btnSin);
		
		JButton btnCos = new JButton("Cos");
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnCos.setBounds(312, 108, 51, 52);
		frmStandardCalculator.getContentPane().add(btnCos);
		
		JButton btnTan = new JButton("Tan");
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnTan.setBounds(312, 157, 51, 52);
		frmStandardCalculator.getContentPane().add(btnTan);
		
		JButton btnCbr = new JButton("Cbr");
		btnCbr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops =Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=Math.cbrt(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnCbr.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnCbr.setBounds(312, 204, 51, 52);
		frmStandardCalculator.getContentPane().add(btnCbr);
		
		JButton Bin = new JButton("Bin");
		Bin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a=Integer.parseInt(txtDisplay.getText());   //binary
				txtDisplay.setText(Integer.toString(a,2));
				
			}
		});
		Bin.setFont(new Font("Tahoma", Font.PLAIN, 9));
		Bin.setBounds(312, 253, 51, 52);
		frmStandardCalculator.getContentPane().add(Bin);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops =Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=Math.sinh(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnSinh.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnSinh.setBounds(361, 60, 51, 52);
		frmStandardCalculator.getContentPane().add(btnSinh);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnCosh.setBounds(361, 109, 51, 52);
		frmStandardCalculator.getContentPane().add(btnCosh);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTanh.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnTanh.setBounds(361, 158, 51, 52);
		frmStandardCalculator.getContentPane().add(btnTanh);
		
		JButton btnRound = new JButton("Rund");
		btnRound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops =Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=Math.round(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnRound.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnRound.setBounds(361, 205, 51, 52);
		frmStandardCalculator.getContentPane().add(btnRound);
		
		JButton btnHex = new JButton("Hex");
		btnHex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a=Integer.parseInt(txtDisplay.getText());   //binary
				txtDisplay.setText(Integer.toString(a,16));
			}
		});
		btnHex.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnHex.setBounds(361, 254, 51, 52);
		frmStandardCalculator.getContentPane().add(btnHex);
		
		JButton btnMod_1 = new JButton("Mod");
		btnMod_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "Mod";
			}
			
		});
		btnMod_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnMod_1.setBounds(409, 60, 51, 52);
		frmStandardCalculator.getContentPane().add(btnMod_1);
		
		JButton btnInx = new JButton("Inx");
		btnInx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops =Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=Math.log10(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnInx.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnInx.setBounds(409, 108, 51, 52);
		frmStandardCalculator.getContentPane().add(btnInx);
		
		JButton btnExp = new JButton("Exp");
		btnExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "Exp";
			}
		});
		btnExp.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnExp.setBounds(409, 157, 51, 52);
		frmStandardCalculator.getContentPane().add(btnExp);
		
		JButton btnPi2 = new JButton("2*π");
		btnPi2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops;
				ops=(3.1415926535897932384636433832795) *2;
						txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnPi2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnPi2.setBounds(409, 204, 51, 52);
		frmStandardCalculator.getContentPane().add(btnPi2);
		
		JButton btnOctal = new JButton("Octal");
		btnOctal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a=Integer.parseInt(txtDisplay.getText());   //binary
				txtDisplay.setText(Integer.toString(a,8));
			}
		});
		btnOctal.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnOctal.setBounds(409, 254, 51, 52);
		frmStandardCalculator.getContentPane().add(btnOctal);
		
		jlblConverts = new JTextField();
		jlblConverts.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jlblConverts.setBounds(510, 163, 193, 37);
		frmStandardCalculator.getContentPane().add(jlblConverts);
		jlblConverts.setColumns(10);
		
		JComboBox jcmbCurrencys = new JComboBox();
		jcmbCurrencys.setFont(new Font("Tahoma", Font.BOLD, 24));
		jcmbCurrencys.setModel(new DefaultComboBoxModel(new String[] {"Choose one..", "USA", "Nigeria", "Kenyan", "Canada", "Brazil", "Indonesia", "Philippine", "India"}));
		jcmbCurrencys.setBounds(510, 110, 193, 37);
		frmStandardCalculator.getContentPane().add(jcmbCurrencys);
		
		JButton jtxtConverts = new JButton("Convert");
		jtxtConverts.setFont(new Font("Tahoma", Font.BOLD, 16));
		jtxtConverts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double British_Pound = Double.parseDouble(jtxtConverts.getText());
				if(jcmbCurrencys.getSelectedItem().equals("Nigeria")) 
				{
					String cConvert1 = String.format("N%.2f", British_Pound*Nigerian_Naira);
					jlblConverts.setText(cConvert1);
				}
				if(jcmbCurrencys.getSelectedItem().equals("USA")) 
				{
					String cConvert1 = String.format("N%.2f", British_Pound*US_Dollar);
					jlblConverts.setText(cConvert1);
				}
				if(jcmbCurrencys.getSelectedItem().equals("Kenyan")) 
				{
					String cConvert2 = String.format("N%.2f", British_Pound*Kenyan_Shilling);
					jlblConverts.setText(cConvert2);
				}
				if(jcmbCurrencys.getSelectedItem().equals("Canada")) 
				{
					String cConvert4 = String.format("N%.2f", British_Pound*Canadian_Dollar);
					jlblConverts.setText(cConvert4);
				}
				if(jcmbCurrencys.getSelectedItem().equals("Brazil")) 
				{
					String cConvert5 = String.format("N%.2f", British_Pound*Brazilian_Real);
					jlblConverts.setText(cConvert5);
				}
				if(jcmbCurrencys.getSelectedItem().equals("India")) 
				{
					String cConvert6 = String.format("N%.2f", British_Pound*Indian_Rupee);
					jlblConverts.setText(cConvert6);
				}
				if(jcmbCurrencys.getSelectedItem().equals("Philippine")) 
				{
					String cConvert7 = String.format("N%.2f", British_Pound*Philippine_Peso);
					jlblConverts.setText(cConvert7);
				}
				if(jcmbCurrencys.getSelectedItem().equals("Indonesia")) 
				{
					String cConvert8 = String.format("N%.2f", British_Pound*Indonesian_Rupiah);
					jlblConverts.setText(cConvert8);
				}
			}
		});
		jtxtConverts.setBounds(510, 263, 107, 35);
		frmStandardCalculator.getContentPane().add(jtxtConverts);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jtxtConverts.setText(null);
				jlblConverts.setText(null);
				jcmbCurrencys.setSelectedItem("Choose One...");
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnClear.setBounds(627, 263, 89, 35);
		frmStandardCalculator.getContentPane().add(btnClear);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel.setBounds(510, 221, 193, 33);
		frmStandardCalculator.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_1.setBounds(498, 21, 227, 290);
		frmStandardCalculator.getContentPane().add(panel_1);
		
		JTextArea txtrCurrencyConvert = new JTextArea();
		panel_1.add(txtrCurrencyConvert);
		txtrCurrencyConvert.setFont(new Font("Tahoma", Font.BOLD, 23));
		txtrCurrencyConvert.setText("Currency Convert");
	}
}
