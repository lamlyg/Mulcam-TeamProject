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

//찾아가세요-글쓰기
public class WriteForm_find extends JFrame /*implements ActionListener*/{

	private JPanel panel;
	public JTextField tf_pithing ,tf_pithingmore,tf_piloc,tf_pidate,tf_pitime,tf_storage, tf_yourinfo;

	public JButton bt_enroll;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WriteForm_find frame = new WriteForm_find();
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
	public WriteForm_find() {
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

		JLabel lblNewLabel = new JLabel("습득물건(간략히)");
		lblNewLabel.setFont(new Font("나눔바른고딕",Font.BOLD,20));
		lblNewLabel.setBounds(141, 123, 162, 48);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("습득물건(자세히)");
		lblNewLabel_1.setFont(new Font("나눔바른고딕",Font.BOLD,20));
		lblNewLabel_1.setBounds(141, 195, 162, 66);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("습득장소");
		lblNewLabel_2.setFont(new Font("나눔바른고딕",Font.BOLD,20));
		lblNewLabel_2.setBounds(141, 411, 130, 59);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("습득날짜");
		lblNewLabel_3.setFont(new Font("나눔바른고딕",Font.BOLD,20));
		lblNewLabel_3.setBounds(141, 482, 147, 59);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_6 = new JLabel("(년,월,일)");
		lblNewLabel_6.setFont(new Font("나눔바른고딕",Font.BOLD,20));
		lblNewLabel_6.setBounds(139, 514, 132, 48);
		panel.add(lblNewLabel_6);

		JLabel lblNewLabel_4 = new JLabel("습득시간");
		lblNewLabel_4.setFont(new Font("나눔바른고딕",Font.BOLD,20));
		lblNewLabel_4.setBounds(141, 569, 210, 48);
		panel.add(lblNewLabel_4);

		JLabel lblNewLabel_7 = new JLabel("(대략적인 시간)");
		lblNewLabel_7.setFont(new Font("나눔바른고딕",Font.BOLD,20));
		lblNewLabel_7.setBounds(141, 599, 130, 48);
		panel.add(lblNewLabel_7);

		JLabel lblNewLabel_5 = new JLabel("보관장소");
		lblNewLabel_5.setFont(new Font("나눔바른고딕",Font.BOLD,20));
		lblNewLabel_5.setBounds(141, 659, 193, 59);
		panel.add(lblNewLabel_5);

		JLabel lblNewLabel_12 = new JLabel("습득자");
		lblNewLabel_12.setFont(new Font("나눔바른고딕",Font.BOLD,20));
		lblNewLabel_12.setBounds(141, 720, 193, 59);
		panel.add(lblNewLabel_12);


		JLabel lblNewLabel_8 = new JLabel("습득하신 물건을 간략히 적어주세요. ex)노트북, 이어폰, 휴대폰 (현금 금지)");
		lblNewLabel_8.setFont(new Font("나눔바른고딕",Font.BOLD,15));
		lblNewLabel_8.setBounds(317, 172, 524, 29);
		panel.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("습득하신 물건에 대해 자세히 적어주세요 ex) 색상, 크기, 브랜드, 기종 등");
		lblNewLabel_9.setFont(new Font("나눔바른고딕",Font.BOLD,15));
		lblNewLabel_9.setBounds(309, 383, 446, 18);
		panel.add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel("습득하신 날짜를 년,월,일만 적어주세요.");
		lblNewLabel_10.setFont(new Font("나눔바른고딕",Font.BOLD,15));
		lblNewLabel_10.setBounds(309, 544, 484, 18);
		panel.add(lblNewLabel_10);

		JLabel lblNewLabel_11 = new JLabel("물건을 습득하신 대략적인 시간을 알려주세요 ex)오후2시 등");
		lblNewLabel_11.setFont(new Font("나눔바른고딕",Font.BOLD,15));
		lblNewLabel_11.setBounds(309, 629, 464, 18);
		panel.add(lblNewLabel_11);

		JLabel lblNewLabel_13 = new JLabel("물건을 찾은 분이 감사를 표할 수 있도록 습득자분의 정보를 알려주세요 (선택사항)");
		lblNewLabel_13.setFont(new Font("나눔바른고딕",Font.BOLD,15));
		lblNewLabel_13.setBounds(309, 783, 829, 18);
		panel.add(lblNewLabel_13);

		JLabel lblNewLabel_14 = new JLabel("습득자분의 정보는 물건 주인이 따로 문의하실때 알려드리며 모두에게 노출되지 않습니다.");
		lblNewLabel_14.setFont(new Font("나눔바른고딕",Font.BOLD,15));
		lblNewLabel_14.setBounds(309, 813, 774, 18);
		panel.add(lblNewLabel_14);

		//습득물건-텍스트필드
		tf_pithing = new JTextField();
		tf_pithing.setBounds(299, 136, 915, 24);
		panel.add(tf_pithing);
		tf_pithing.setColumns(10);

		//습득물건(자세히)-텍스트필드
		tf_pithingmore = new JTextField();
		tf_pithingmore.setBounds(299, 217, 915, 154);
		panel.add(tf_pithingmore);
		tf_pithingmore.setColumns(10);

		//습득장소-텍스트필드
		tf_piloc = new JTextField();
		tf_piloc.setBounds(299, 429, 915, 29);
		panel.add(tf_piloc);
		tf_piloc.setColumns(10);

		//습득날짜-텍스트필드
		tf_pidate = new JTextField();
		tf_pidate.setBounds(299, 498, 915, 29);
		panel.add(tf_pidate);
		tf_pidate.setColumns(10);

		//습득시간-텍스트필드
		tf_pitime = new JTextField();
		tf_pitime.setBounds(299, 582, 915, 35);
		panel.add(tf_pitime);
		tf_pitime.setColumns(10);

		//보관장소-텍스트필드
		tf_storage = new JTextField();
		tf_storage.setBounds(299, 677, 915, 29);
		panel.add(tf_storage);
		tf_storage.setColumns(10);

		//습득자-텍스트필드
		tf_yourinfo = new JTextField();
		tf_yourinfo.setBounds(299, 736, 915, 29);
		panel.add(tf_yourinfo);
		tf_yourinfo.setColumns(10);

		//등록-버튼
		bt_enroll = new JButton("등록");
		bt_enroll.setFont(new Font("나눔바른고딕",Font.BOLD,25));
		bt_enroll.setBounds(1397, 751, 153, 59);
		panel.add(bt_enroll);



		//		bt_enroll.addActionListener(this);
	}

	//찾아주세요_글쓰기 페이지 초기화
	public void initForm(){//입력폼 초기화
		tf_pithing.setText("");
		tf_pithingmore.setText("");
		tf_piloc.setText("");
		tf_pidate.setText("");
		tf_pitime.setText("");
		tf_storage.setText("");
		tf_yourinfo.setText("");	         

		tf_pithing.requestFocus();
	}//initForm

	public void showMsg(String msg){
		JOptionPane.showMessageDialog(this, msg);
	}//showMsg

	//	public void actionPerformed(ActionEvent e) {//ActionListener가 반드시 생성해야하는 메소드?
	//		// TODO Auto-generated method stub
	//		System.out.println("Button Press!");
	//	}
}
