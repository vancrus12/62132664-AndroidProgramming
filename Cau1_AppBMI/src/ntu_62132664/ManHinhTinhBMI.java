package ntu_62132664;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ManHinhTinhBMI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	public ManHinhTinhBMI() {
		setTitle("Ứng dụng tính chỉ số BMI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ứng dụng tính chỉ số BMI");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel.setBounds(31, 22, 313, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Chiều cao (cm)");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(31, 82, 132, 31);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		textField.setBounds(31, 124, 313, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cân nặng (kg)");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblNewLabel_1_1.setBounds(31, 165, 132, 31);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		textField_1.setColumns(10);
		textField_1.setBounds(31, 206, 313, 31);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("Tính BMI");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton.setBounds(116, 260, 132, 31);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Kết quả:");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblNewLabel_1_1_1.setBounds(31, 312, 66, 31);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_2.setEditable(false);
		textField_2.setBounds(131, 312, 208, 27);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Nhận xét:");
		lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblNewLabel_1_1_1_1.setBounds(31, 365, 81, 31);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(131, 368, 208, 27);
		contentPane.add(textField_3);
	}
}
