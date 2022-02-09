package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class MiniCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void vista() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiniCalculadora frame = new MiniCalculadora();
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
	public MiniCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField_1 = new JTextField();
		textField_1.setBounds(37, 72, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(147, 72, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel = new JLabel("NUMERO 1");
		lblNewLabel.setBounds(37, 54, 74, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("NUMERO 2");
		lblNewLabel_1.setBounds(147, 54, 86, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("RESULTADO");
		lblNewLabel_2.setBounds(294, 54, 86, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("OPERACIONES");
		lblNewLabel_3.setBounds(10, 156, 74, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(294, 75, 114, 14);
		contentPane.add(lblNewLabel_4);

		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double operador1 = Double.valueOf(textField_1.getText());
					double operador2 = Double.valueOf(textField_2.getText());

					double suma = operador1 + operador2;
					lblNewLabel_4.setText(String.valueOf(suma));
				} catch (Exception ex) {
					System.out.println(ex);
				}

			}
		});

		btnNewButton.setBounds(10, 181, 89, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double operador1 = Double.valueOf(textField_1.getText());
					double operador2 = Double.valueOf(textField_2.getText());

					double suma = operador1 - operador2;
					lblNewLabel_4.setText(String.valueOf(suma));
				} catch (Exception ex) {
					System.out.println(ex);
				}
			}
		});

		btnNewButton_1.setBounds(109, 181, 89, 23);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("*");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double operador1 = Double.valueOf(textField_1.getText());
					double operador2 = Double.valueOf(textField_2.getText());

					double suma = operador1 * operador2;
					lblNewLabel_4.setText(String.valueOf(suma));
				} catch (Exception ex) {
					System.out.println(ex);
				}
			}
		});

		btnNewButton_2.setBounds(10, 215, 89, 23);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double operador1 = Double.valueOf(textField_1.getText());
					double operador2 = Double.valueOf(textField_2.getText());

					double suma = operador1 / operador2;
					lblNewLabel_4.setText(String.valueOf(suma));
				} catch (Exception ex) {
					System.out.println(ex);
				}
			}
		});

		btnNewButton_3.setBounds(109, 215, 89, 23);
		contentPane.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("ABOUT");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "APP REALIZADA POR ABEL, EDGAR Y RAÚL.");
			}
		});

		btnNewButton_4.setBounds(208, 181, 89, 23);
		contentPane.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("SALIR");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		btnNewButton_5.setBounds(208, 215, 89, 23);
		contentPane.add(btnNewButton_5);

	}
}
