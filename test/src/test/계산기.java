package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 계산기 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private String exp = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					계산기 frame = new 계산기();
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
	public 계산기() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		
		JLabel lblNewLabel = new JLabel("status");
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("0");
		textField.setEditable(false);
		panel_1.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(5, 4, 10, 5));
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				exp = exp + "7";
				textField.setText(exp);
			}
		});
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("8");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				exp = exp + "8";
				textField.setText(exp);
			}
		});
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("9");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				exp = exp + "9";
				textField.setText(exp);
			}
		});
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				exp = exp + "/";
				textField.setText(exp);
			}
		});
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				exp = exp + "4";
				textField.setText(exp);
			}
		});
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				exp = exp + "5";
				textField.setText(exp);
			}
		});
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				exp = exp + "6";
				textField.setText(exp);
			}
		});
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("*");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				exp = exp + "*";
				textField.setText(exp);
			}
		});
		panel_2.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("1");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				exp = exp + "1";
				textField.setText(exp);
			}
		});
		panel_2.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("2");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				exp = exp + "2";
				textField.setText(exp);
			}
		});
		panel_2.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("3");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				exp = exp + "3";
				textField.setText(exp);
			}
		});
		panel_2.add(btnNewButton_10);
		
		JButton btnNewButton_12 = new JButton("-");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				exp = exp + "-";
				textField.setText(exp);
			}
		});
		panel_2.add(btnNewButton_12);
		
		JButton btnNewButton_11 = new JButton("0");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				exp = exp + "0";
				textField.setText(exp);
			}
		});
		panel_2.add(btnNewButton_11);
		
		JButton btnNewButton_13 = new JButton("C");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				exp = "";
				textField.setText(exp);
			}
		});
		panel_2.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("=");
		btnNewButton_14.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // 수식이 비어있는 경우
		        if (exp.isEmpty()) {
		            textField.setText("수식을 입력하세요.");
		            return;
		        }
		        
		        String postfix = Infix2Postfix.convert(exp);
		        try {
		            double value = Calc.eval(postfix);
		            if (Double.isInfinite(value)) {
		                throw new ArithmeticException("0으로 나눌 수 없습니다.");
		            }

		            textField.setText(String.valueOf(value));
		        } catch (IllegalArgumentException ex) {
		            textField.setText("수식 오류: " + ex.getMessage());
		        } catch (ArithmeticException ex) {
		            textField.setText(ex.getMessage());
		        }
		    }

		    // 유효한 형식의 수식인지 검사하는 메서드
		    private boolean isValidExpression(String exp) {
		        if (exp == null || exp.isBlank()) {
		            return false;
		        }

		        // 수식에 유효하지 않은 연산자 조합이 있는 경우
		        String[] tokens = exp.split("\\s+");
		        for (String token : tokens) {
		            if (!token.matches("[0-9+\\-*/()]+")) {
		                return false;
		            }
		        }

		        return true;
		    }
		});
		
		panel_2.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("+");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				exp = exp + "+";
				textField.setText(exp);
			}
		});
		panel_2.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("(");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "(";
				textField.setText(exp);
			}
		});
		panel_2.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton(")");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + ")";
				textField.setText(exp);
			}
		});
		panel_2.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("New button");
		panel_2.add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("New button");
		panel_2.add(btnNewButton_19);
	}

	public JTextField TextField() {
		return textField;
	}
}
