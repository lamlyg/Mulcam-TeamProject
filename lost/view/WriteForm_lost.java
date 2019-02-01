package view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class WriteForm_lost extends JFrame {

	private JPanel panel;
	public JTextField tf_lothing, tf_lothingmore, tf_loloc, tf_lodate, tf_lotime, tf_loyourinfo;

	public JButton bt_enroll;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WriteForm_lost frame = new WriteForm_lost();
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
	public WriteForm_lost() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(null);
		setContentPane(panel);

		JLabel TitleLabel = new JLabel("글쓰기");
		TitleLabel.setFont(new Font("나눔바른고딕",Font.BOLD,30));
		TitleLabel.setBounds(44, 34, 175, 87);
		panel.add(TitleLabel);

		JLabel lblNewLabel = new JLabel("분실물건(간략히)");
		lblNewLabel.setFont(new Font("나눔바른고딕",Font.BOLD,20));
		lblNewLabel.setBounds(141, 133, 162, 48);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("분실물건(자세히)");
		lblNewLabel_1.setFont(new Font("나눔바른고딕",Font.BOLD,20));
		lblNewLabel_1.setBounds(141, 205, 162, 66);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("분실장소");
		lblNewLabel_2.setFont(new Font("나눔바른고딕",Font.BOLD,20));
		lblNewLabel_2.setBounds(141, 421, 130, 59);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("분실날짜");
		lblNewLabel_3.setFont(new Font("나눔바른고딕",Font.BOLD,20));
		lblNewLabel_3.setBounds(141, 492, 147, 59);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_6 = new JLabel("(년,월,일)");
		lblNewLabel_6.setFont(new Font("나눔바른고딕",Font.BOLD,20));
		lblNewLabel_6.setBounds(139, 524, 132, 48);
		panel.add(lblNewLabel_6);

		JLabel lblNewLabel_4 = new JLabel("분실시간");
		lblNewLabel_4.setFont(new Font("나눔바른고딕",Font.BOLD,20));
		lblNewLabel_4.setBounds(141, 579, 210, 48);
		panel.add(lblNewLabel_4);

		JLabel lblNewLabel_7 = new JLabel("(대략적인 시간)");
		lblNewLabel_7.setFont(new Font("나눔바른고딕",Font.BOLD,20));
		lblNewLabel_7.setBounds(141, 609, 130, 48);
		panel.add(lblNewLabel_7);

		JLabel lblNewLabel_5 = new JLabel("습득시 연락처");
		lblNewLabel_5.setFont(new Font("나눔바른고딕",Font.BOLD,20));
		lblNewLabel_5.setBounds(141, 669, 193, 59);
		panel.add(lblNewLabel_5);

		JLabel lblNewLabel_8 = new JLabel("분실하신 물건을 간략히 적어주세요. ex)노트북, 이어폰, 휴대폰 (현금 금지)");
		lblNewLabel_8.setFont(new Font("나눔바른고딕",Font.BOLD,15));
		lblNewLabel_8.setBounds(317, 182, 524, 29);
		panel.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("분실하신 물건에 대해 자세히 적어주세요 ex) 색상, 크기, 브랜드, 기종 등");
		lblNewLabel_9.setFont(new Font("나눔바른고딕",Font.BOLD,15));
		lblNewLabel_9.setBounds(309, 393, 446, 18);
		panel.add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel("분실하신 날짜를 년,월,일만 적어주세요.");
		lblNewLabel_10.setFont(new Font("나눔바른고딕",Font.BOLD,15));
		lblNewLabel_10.setBounds(309, 554, 484, 18);
		panel.add(lblNewLabel_10);

		JLabel lblNewLabel_11 = new JLabel("물건을 분실하신 대략적인 시간을 알려주세요 ex)오후2시 등");
		lblNewLabel_11.setFont(new Font("나눔바른고딕",Font.BOLD,15));
		lblNewLabel_11.setBounds(309, 639, 464, 18);
		panel.add(lblNewLabel_11);

		tf_lothing = new JTextField();
		tf_lothing.setBounds(299, 146, 915, 24);
		panel.add(tf_lothing);
		tf_lothing.setColumns(10);

		tf_lothingmore = new JTextField();
		tf_lothingmore.setBounds(299, 227, 915, 154);
		panel.add(tf_lothingmore);
		tf_lothingmore.setColumns(10);

		tf_loloc = new JTextField();
		tf_loloc.setBounds(299, 439, 915, 29);
		panel.add(tf_loloc);
		tf_loloc.setColumns(10);

		tf_lodate = new JTextField();
		tf_lodate.setBounds(299, 508, 915, 29);
		panel.add(tf_lodate);
		tf_lodate.setColumns(10);

		tf_lotime = new JTextField();
		tf_lotime.setBounds(299, 592, 915, 35);
		panel.add(tf_lotime);
		tf_lotime.setColumns(10);

		tf_loyourinfo = new JTextField();
		tf_loyourinfo.setBounds(299, 687, 915, 29);
		panel.add(tf_loyourinfo);
		tf_loyourinfo.setColumns(10);

		bt_enroll = new JButton("등록");
		bt_enroll.setFont(new Font("나눔바른고딕",Font.BOLD,25));
		bt_enroll.setBounds(1397, 761, 153, 59);
		panel.add(bt_enroll);

	}

	//찾아주세요_글쓰기 페이지 초기화
	public void initForm(){//입력폼 초기화
		tf_lothing.setText("");
		tf_lothingmore.setText("");
		tf_loloc.setText("");
		tf_lodate.setText("");
		tf_lotime.setText("");
		tf_loyourinfo.setText("");

		tf_lothing.requestFocus();
	}//initForm

	public void showMsg(String msg){
		JOptionPane.showMessageDialog(this, msg);
	}//showMsg
}
