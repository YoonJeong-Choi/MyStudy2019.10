package Calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btndelete;
	private JButton btnC;
	private JButton btnsquare;
	private JButton btnDenominator;
	private JButton btnDot;
	private JButton btnNegative;
	private JButton btnpercent;
	private JButton btnCE;
	private JButton btn0;
	private JButton btndevide;
	private JButton btnmultiple;
	private JButton btnminus;
	private JButton btnplus;
	private JButton btn15;

	private StringBuffer cal = new StringBuffer();
	private StringBuffer calscreen = new StringBuffer();
	private String calscreen1 = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorFrame frame = new CalculatorFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculatorFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 379, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("굴림", Font.PLAIN, 35));
		textField.setHorizontalAlignment(SwingConstants.TRAILING);
		textField.setText("0");
		textField.setBounds(12, 10, 340, 44);
		contentPane.add(textField);
		textField.setColumns(10);

		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("0")) {
				} else {
					cal.append("0");
					textField.setText(textField.getText() + "0");
				}
			}
		});
		btn0.setBounds(100, 334, 76, 44);
		contentPane.add(btn0);

		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("0") || textField.getText().equals("+")
						|| textField.getText().equals("-") || textField.getText().equals("×")
						|| textField.getText().equals("÷") || cal.length() == 0) {
					cal.append("1");
					textField.setText("1");
				} else {
					cal.append("1");
					textField.setText(textField.getText() + "1");
				}
			}
		});
		btn1.setBounds(12, 280, 76, 44);
		contentPane.add(btn1);

		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("0") || textField.getText().equals("+")
						|| textField.getText().equals("-") || textField.getText().equals("×")
						|| textField.getText().equals("÷") || cal.length() == 0) {
					cal.append("2");
					textField.setText("2");
				} else {
					cal.append("2");
					textField.setText(textField.getText() + "2");
				}
			}
		});
		btn2.setBounds(100, 280, 76, 44);
		contentPane.add(btn2);

		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("0") || textField.getText().equals("+")
						|| textField.getText().equals("-") || textField.getText().equals("×")
						|| textField.getText().equals("÷") || cal.length() == 0) {
					cal.append("3");
					textField.setText("3");
				} else {
					cal.append("3");
					textField.setText(textField.getText() + "3");
				}
			}
		});
		btn3.setBounds(188, 280, 76, 44);
		contentPane.add(btn3);

		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("0") || textField.getText().equals("+")
						|| textField.getText().equals("-") || textField.getText().equals("×")
						|| textField.getText().equals("÷") || cal.length() == 0) {
					cal.append("4");
					textField.setText("4");
				} else {
					cal.append("4");
					textField.setText(textField.getText() + "4");
				}
			}
		});
		btn4.setBounds(12, 226, 76, 44);
		contentPane.add(btn4);

		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("0") || textField.getText().equals("+")
						|| textField.getText().equals("-") || textField.getText().equals("×")
						|| textField.getText().equals("÷") || cal.length() == 0) {
					cal.append("5");
					textField.setText("5");
				} else {
					cal.append("5");
					textField.setText(textField.getText() + "5");
				}
			}
		});
		btn5.setBounds(100, 226, 76, 44);
		contentPane.add(btn5);

		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("0") || textField.getText().equals("+")
						|| textField.getText().equals("-") || textField.getText().equals("×")
						|| textField.getText().equals("÷") || cal.length() == 0) {
					cal.append("6");
					textField.setText("6");
				} else {
					cal.append("6");
					textField.setText(textField.getText() + "6");
				}
			}
		});
		btn6.setBounds(188, 226, 76, 44);
		contentPane.add(btn6);

		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("0") || textField.getText().equals("+")
						|| textField.getText().equals("-") || textField.getText().equals("×")
						|| textField.getText().equals("÷") || cal.length() == 0) {
					cal.append("7");
					textField.setText("7");
				} else {
					cal.append("7");
					textField.setText(textField.getText() + "7");
				}
			}
		});
		btn7.setBounds(12, 172, 76, 44);
		contentPane.add(btn7);

		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("0") || textField.getText().equals("+")
						|| textField.getText().equals("-") || textField.getText().equals("×")
						|| textField.getText().equals("÷") || cal.length() == 0) {
					cal.append("8");
					textField.setText("8");
				} else {
					cal.append("8");
					textField.setText(textField.getText() + "8");
				}
			}
		});
		btn8.setBounds(100, 172, 76, 44);
		contentPane.add(btn8);

		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("0") || textField.getText().equals("+")
						|| textField.getText().equals("-") || textField.getText().equals("×")
						|| textField.getText().equals("÷") || cal.length() == 0) {
					cal.append("9");
					textField.setText("9");
				} else {
					cal.append("9");
					textField.setText(textField.getText() + "9");
				}
			}
		});
		btn9.setBounds(188, 172, 76, 44);
		contentPane.add(btn9);

		btndelete = new JButton("←");
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("0")) {
				} else {
					cal.deleteCharAt(cal.length() - 1);
					textField.setText(cal.toString());
				}
			}
		});
		btndelete.setBounds(276, 64, 76, 44);
		contentPane.add(btndelete);

		btndevide = new JButton("÷");
		btndevide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] starray = new String[3];

				starray = cal.toString().split(" ");

				if (textField.getText().equals("0")) {
				} else if (starray.length == 3) {
					if (starray[1].equals("+")) {
						double d = Double.parseDouble(starray[0]) + Double.parseDouble(starray[2]);
						cal.delete(0, cal.length());
						cal.append(d + " / ");
						textField.setText("÷");
					} else if (starray[1].equals("-")) {
						double d = Double.parseDouble(starray[0]) - Double.parseDouble(starray[2]);
						cal.delete(0, cal.length());
						cal.append(d + " / ");
						textField.setText("÷");
					}
					if (starray[1].equals("*")) {
						double d = Double.parseDouble(starray[0]) * Double.parseDouble(starray[2]);
						cal.delete(0, cal.length());
						cal.append(d + " / ");
						textField.setText("÷");
					}
					if (starray[1].equals("/")) {
						double d = Double.parseDouble(starray[0]) / Double.parseDouble(starray[2]);
						cal.delete(0, cal.length());
						cal.append(d + " / ");
						textField.setText("÷");
					}
				} else if (starray.length == 2) {
					cal.delete(cal.length() - 3, cal.length());
					cal.append(" / ");
					textField.setText("÷");
				} else {
					cal.append(" / ");
					textField.setText("÷");
				}
			}
		});
		btndevide.setBounds(276, 118, 76, 44);
		contentPane.add(btndevide);

		btnmultiple = new JButton("×");
		btnmultiple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] starray = new String[3];
				starray = cal.toString().split(" ");

				if (textField.getText().equals("0")) {
				} else if (starray.length == 3) {
					if (starray[1].equals("+")) {
						double d = Double.parseDouble(starray[0]) + Double.parseDouble(starray[2]);
						cal.delete(0, cal.length());
						cal.append(d + " * ");
						textField.setText("×");
					} else if (starray[1].equals("-")) {
						double d = Double.parseDouble(starray[0]) - Double.parseDouble(starray[2]);
						cal.delete(0, cal.length());
						cal.append(d + " * ");
						textField.setText("×");
					}
					if (starray[1].equals("×")) {
						double d = Double.parseDouble(starray[0]) * Double.parseDouble(starray[2]);
						cal.delete(0, cal.length());
						cal.append(d + " * ");
						textField.setText("×");
					}
					if (starray[1].equals("/")) {
						double d = Double.parseDouble(starray[0]) / Double.parseDouble(starray[2]);
						cal.delete(0, cal.length());
						cal.append(d + " * ");
						textField.setText("×");
					}
				} else if (starray.length == 2) {
					cal.delete(cal.length() - 3, cal.length());
					cal.append(" * ");
					textField.setText("×");
				} else {
					cal.append(" * ");
					textField.setText("×");
				}
			}
		});
		btnmultiple.setBounds(276, 172, 76, 44);
		contentPane.add(btnmultiple);

		btnminus = new JButton("-");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] starray = new String[3];
				starray = cal.toString().split(" ");

				if (textField.getText().equals("0")) {
				} else if (starray.length == 3) {
					if (starray[1].equals("+")) {
						double d = Double.parseDouble(starray[0]) + Double.parseDouble(starray[2]);
						cal.delete(0, cal.length());
						cal.append(d + " - ");
						textField.setText("-");
					} else if (starray[1].equals("-")) {
						double d = Double.parseDouble(starray[0]) - Double.parseDouble(starray[2]);
						cal.delete(0, cal.length());
						cal.append(d + " - ");
						textField.setText("-");
					}
					if (starray[1].equals("×")) {
						double d = Double.parseDouble(starray[0]) * Double.parseDouble(starray[2]);
						cal.delete(0, cal.length());
						cal.append(d + " - ");
						textField.setText("-");
					}
					if (starray[1].equals("/")) {
						double d = Double.parseDouble(starray[0]) / Double.parseDouble(starray[2]);
						cal.delete(0, cal.length());
						cal.append(d + " - ");
						textField.setText("-");
					}
				} else if (starray.length == 2) {
					cal.delete(cal.length() - 3, cal.length());
					cal.append(" - ");
					textField.setText("-");
				} else {
					cal.append(" - ");
					textField.setText("-");
				}
			}
		});
		btnminus.setBounds(276, 226, 76, 44);
		contentPane.add(btnminus);

		btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] starray = new String[3];
				starray = cal.toString().split(" ");

				if (textField.getText().equals("0")) {
				} else if (starray.length == 3) {
					if (starray[1].equals("+")) {
						double d = Double.parseDouble(starray[0]) + Double.parseDouble(starray[2]);
						cal.delete(0, cal.length());
						cal.append(d + " + ");
						textField.setText("+");
					} else if (starray[1].equals("-")) {
						double d = Double.parseDouble(starray[0]) - Double.parseDouble(starray[2]);
						cal.delete(0, cal.length());
						cal.append(d + " + ");
						textField.setText("+");
					}
					if (starray[1].equals("×")) {
						double d = Double.parseDouble(starray[0]) * Double.parseDouble(starray[2]);
						cal.delete(0, cal.length());
						cal.append(d + " + ");
						textField.setText("+");
					}
					if (starray[1].equals("/")) {
						double d = Double.parseDouble(starray[0]) / Double.parseDouble(starray[2]);
						cal.delete(0, cal.length());
						cal.append(d + " + ");
						textField.setText("+");
					}
				} else if (starray.length == 2) {
					cal.delete(cal.length() - 3, cal.length());
					cal.append(" + ");
					textField.setText("+");
				} else {
					cal.append(" + ");
					textField.setText("+");
				}
			}
		});
		btnplus.setBounds(276, 280, 76, 44);
		contentPane.add(btnplus);

		btn15 = new JButton("=");
		btn15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] starray = new String[3];
				starray = cal.toString().split(" ");

				if (textField.getText().equals("0")) {
				} else if (starray.length == 3) {
					if (starray[1].equals("+")) {
						double d = Double.parseDouble(starray[0]) + Double.parseDouble(starray[2]);
						cal.delete(0, cal.length());
						textField.setText(d + "");
					} else if (starray[1].equals("-")) {
						double d = Double.parseDouble(starray[0]) - Double.parseDouble(starray[2]);
						cal.delete(0, cal.length());
						textField.setText(d + "");
					}
					if (starray[1].equals("×")) {
						double d = Double.parseDouble(starray[0]) * Double.parseDouble(starray[2]);
						cal.delete(0, cal.length());
						textField.setText(d + "");
					}
					if (starray[1].equals("/")) {
						double d = Double.parseDouble(starray[0]) / Double.parseDouble(starray[2]);
						cal.delete(0, cal.length());
						textField.setText(d + "");
					}
				} else if (starray.length == 2) {
					cal.delete(cal.length() - 3, cal.length());
					textField.setText(cal.toString());
				} else {
				}
			}
		});
		btn15.setBounds(276, 334, 76, 44);
		contentPane.add(btn15);

		btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
				cal.delete(0, cal.length());
			}
		});
		btnC.setBounds(188, 64, 76, 44);
		contentPane.add(btnC);

		btnsquare = new JButton("χ²");
		btnsquare.setBounds(100, 118, 76, 44);
		contentPane.add(btnsquare);
		btnsquare.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("square");
			}
		});

		btnDenominator = new JButton("¹/χ");
		btnDenominator.setBounds(12, 118, 76, 44);
		contentPane.add(btnDenominator);
		btnDenominator.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Deno");
			}
		});

		btnDot = new JButton(".");
		btnDot.setBounds(188, 334, 76, 44);
		contentPane.add(btnDot);
		btnDot.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(".");
			}
		});

		btnNegative = new JButton("+/-");
		btnNegative.setBounds(12, 334, 76, 44);
		contentPane.add(btnNegative);
		btnNegative.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("-");
			}
		});

		btnpercent = new JButton("%");
		btnpercent.setBounds(12, 64, 76, 44);
		contentPane.add(btnpercent);
		btnpercent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("percent");
				if (textField.getText().equals("0") || textField.getText().contains("+")) {

				} else {
				}
			}
		});

		btnCE = new JButton("CE");
		btnCE.setBounds(100, 64, 76, 44);
		contentPane.add(btnCE);
		btnCE.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("CE");
			}
		});

		JTextField text = new JTextField();
		contentPane.add(text, 10, 10);
	}
}
