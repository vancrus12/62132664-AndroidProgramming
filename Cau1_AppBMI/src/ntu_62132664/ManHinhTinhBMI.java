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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhBMI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCC;
	private JTextField txtCN;
	private JTextField txtKQ;
	private JTextField txtNX;
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
		
		JLabel lblNhapChieuCao = new JLabel("Chiều cao (m)");
		lblNhapChieuCao.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblNhapChieuCao.setBounds(31, 82, 132, 31);
		contentPane.add(lblNhapChieuCao);
		
		txtCC = new JTextField();
		txtCC.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		txtCC.setBounds(31, 124, 313, 31);
		contentPane.add(txtCC);
		txtCC.setColumns(10);
		
		JLabel lblNhapCanNang = new JLabel("Cân nặng (kg)");
		lblNhapCanNang.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblNhapCanNang.setBounds(31, 165, 132, 31);
		contentPane.add(lblNhapCanNang);
		
		txtCN = new JTextField();
		txtCN.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		txtCN.setColumns(10);
		txtCN.setBounds(31, 206, 313, 31);
		contentPane.add(txtCN);
		
		JButton btnTinhBMI = new JButton("Tính BMI");
		btnTinhBMI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TinhChiSoBMI();
			}
		});
		btnTinhBMI.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnTinhBMI.setBounds(116, 260, 132, 31);
		contentPane.add(btnTinhBMI);
		
		JLabel lblKetQua = new JLabel("Kết quả:");
		lblKetQua.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblKetQua.setBounds(31, 312, 66, 31);
		contentPane.add(lblKetQua);
		
		txtKQ = new JTextField();
		txtKQ.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtKQ.setEditable(false);
		txtKQ.setBounds(131, 312, 208, 27);
		contentPane.add(txtKQ);
		txtKQ.setColumns(10);
		
		JLabel lblNhanXet = new JLabel("Nhận xét:");
		lblNhanXet.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblNhanXet.setBounds(31, 365, 81, 31);
		contentPane.add(lblNhanXet);
		
		txtNX = new JTextField();
		txtNX.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtNX.setEditable(false);
		txtNX.setColumns(10);
		txtNX.setBounds(131, 368, 208, 27);
		contentPane.add(txtNX);
	}
	void TinhChiSoBMI() {
		String str_CC = txtCC.getText();
		String str_CN = txtCN.getText();
		double CC = Double.parseDouble(str_CC);
		double CN = Double.parseDouble(str_CN);
		double BMI = CN / (CC * CC);
		txtKQ.setText(String.valueOf(BMI));
		if(BMI < 16)
			txtNX.setText(String.valueOf("Bạn gầy độ III!"));
		else if(BMI >= 16 && BMI < 17)
			txtNX.setText(String.valueOf("Bạn gầy độ II!"));
		else if(BMI >= 17 && BMI < 18.5)
			txtNX.setText(String.valueOf("Bạn gầy độ I!"));
		else if(BMI >= 18.5 && BMI < 25)
			txtNX.setText(String.valueOf("Bạn bình thường!"));
		else if(BMI >= 25 && BMI < 30)
			txtNX.setText(String.valueOf("Bạn thừa cân!"));
		else if(BMI >= 30 && BMI < 35)
			txtNX.setText(String.valueOf("Bạn béo phì độ I!"));
		else if(BMI >= 35 && BMI < 40)
			txtNX.setText(String.valueOf("Bạn béo phì độ II!"));
		else if(BMI >= 40)
			txtNX.setText(String.valueOf("Bạn béo phì độ III!"));
	}
}
