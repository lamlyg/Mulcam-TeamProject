package view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainView extends JFrame{

	private JPanel Panel;

	public JButton bt_Find, bt_Lost;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainView frame = new MainView();
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
	public MainView() {
		setTitle("멀티캠퍼스3조");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		setVisible(true);
		Panel = new JPanel();
		Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		Panel.setLayout(null);
		setContentPane(Panel);


		JLabel lblTitleLabel = new JLabel("분실물 통합 관리 시스템");
		lblTitleLabel.setFont(new Font("맑은 고딕",Font.BOLD,50));
		lblTitleLabel.setBounds(480, 159, 665, 96);
		Panel.add(lblTitleLabel);

		bt_Find = new JButton("찾아가세요");
		bt_Find.setFont(new Font("나눔바른고딕",Font.BOLD,50));
		bt_Find.setBounds(600, 348, 311, 96);
		Panel.add(bt_Find);

		bt_Lost = new JButton("찾아주세요");
		bt_Lost.setFont(new Font("나눔바른고딕",Font.BOLD,50));
		bt_Lost.setBounds(600, 520, 311, 96);
		Panel.add(bt_Lost);

	}
	
	
	public void showMsg(String msg){
		JOptionPane.showMessageDialog(this, msg);
	}//showMsg

}
