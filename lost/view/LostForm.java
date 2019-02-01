package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import model.LostDAO;
import model.LostVO;

public class LostForm extends JFrame {

	private int size; //'더보기'버튼 수
	private JPanel contentPane;
	public JTextField tf_Search;

	LostDAO ldao;
	LostVO lvo;

	JTable table;
	DefaultTableModel dtm;//테이블에 행데이터를 추가 또는 삭제 기능
	JScrollPane scrol_table;

	JButton []btn_showmore;

	public JButton bt_Search, bt_Write;//등록버튼, 글쓰기버튼

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FindForm frame = new FindForm();
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
	public LostForm() {

		String []columnNames = {"","","",""};

		Object [][] data = new Object[0][4];

		ldao = new LostDAO();
		int size = ldao.getLoMaxNum();
		btn_showmore = new JButton[size];

		dtm = new DefaultTableModel(data, columnNames);

		table = new JTable(dtm);

		scrol_table = new JScrollPane(table);//스크롤(데이터 많아질 경우, 페이지 부족->스크롤이용)
		scrol_table.setBounds(30, 153, 1179, 598);


		setTitle("찾아주세요");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		contentPane.add(scrol_table);
		
		JLabel Label1 = new JLabel("분실물건");
		Label1.setFont(new Font("나눔바른고딕",Font.BOLD,30));
		Label1.setBounds(100, 100, 182, 61);
		contentPane.add(Label1);

		JLabel lblNewLabel_0 = new JLabel("분실위치");
		lblNewLabel_0.setFont(new Font("나눔바른고딕",Font.BOLD,30));
		lblNewLabel_0.setBounds(400, 100, 182, 61);
		contentPane.add(lblNewLabel_0);

		JLabel lblNewLabel_1 = new JLabel("분실날짜");
		lblNewLabel_1.setFont(new Font("나눔바른고딕",Font.BOLD,30));
		lblNewLabel_1.setBounds(700, 100, 182, 61);
		contentPane.add(lblNewLabel_1);


		JLabel lblNewLabel_3 = new JLabel("등록일자");
		lblNewLabel_3.setFont(new Font("나눔바른고딕",Font.BOLD,30));
		lblNewLabel_3.setBounds(1000, 100, 182, 61);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("더보기");
		lblNewLabel_4.setFont(new Font("나눔바른고딕",Font.BOLD,30));
		lblNewLabel_4.setBounds(1300, 100, 182, 61);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("검색");
		lblNewLabel_5.setFont(new Font("나눔바른고딕",Font.BOLD,25));
		lblNewLabel_5.setBounds(1090, 24, 48, 61);
		contentPane.add(lblNewLabel_5);

		tf_Search = new JTextField();
		tf_Search.setBounds(1151, 24, 273, 61);
		contentPane.add(tf_Search);
		tf_Search.setColumns(10);

		bt_Search = new JButton("Search");
		bt_Search.setFont(new Font("나눔바른고딕",Font.BOLD,20));
		bt_Search.setBounds(1438, 24, 116, 61);
		contentPane.add(bt_Search);

		bt_Write = new JButton("글쓰기");
		bt_Write.setFont(new Font("나눔바른고딕",Font.BOLD,20));
		bt_Write.setBounds(1423, 772, 133, 52);
		contentPane.add(bt_Write);

	}


	public void showMsg(String msg){
		JOptionPane.showMessageDialog(this, msg);
	}//showMsg
	
	
	public void displayLost(List<LostVO> list) {
		dtm.setRowCount(0);
		int bound = 160;
		
		ldao = new LostDAO();
		int size = ldao.getLoMaxNum();
		btn_showmore = new JButton[size];
		
//		"분실물건","분실위치","분실날짜","등록일자","더보기"
		for (int i = 0; i < list.size(); i++) {
			LostVO vo = list.get(i);
				
			Object []data= {vo.getLothing(),vo.getLoloc(),vo.getLodate(), vo.getRegidate()};
			dtm.addRow(data);
			
			btn_showmore[i] = new JButton("더보기");
			btn_showmore[i].setName(Integer.toString(vo.getLono()));
			btn_showmore[i].setBounds(1210, bound, 259, 15);
			contentPane.add(btn_showmore[i]);

			bound+=16;
		}
		
	}
}

