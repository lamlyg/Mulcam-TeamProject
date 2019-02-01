package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

import model.PickupDAO;
import model.PickupVO;

public class FindForm extends JFrame {

	private int size; //'더보기'버튼 수
	private JPanel contentPane;
	public JTextField tf_Search;

	PickupDAO pdao;
	PickupVO pvo;

	JTable table;
	DefaultTableModel dtm;//테이블에 행데이터를 추가 또는 삭제 기능
	JScrollPane scrol_table;

	public JButton btn_showmore;
	public JButton []btn_showmore2;

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
	public FindForm() {

		String []columnNames = {"","","","",""};
		//		String []columnNames = {"습득물건","습득위치","습득날짜","보관장소","등록일자"};

		Object [][] data = new Object[0][5];

		pdao = new PickupDAO();
		int size = pdao.getPiMaxNum();
		btn_showmore2 = new JButton[size];

		dtm = new DefaultTableModel(data, columnNames);

		table = new JTable(dtm);

		scrol_table = new JScrollPane(table);//스크롤(데이터 많아질 경우, 페이지 부족->스크롤이용)
		scrol_table.setBounds(30, 156, 1251, 601);

		setTitle("찾아가세요");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		contentPane.add(scrol_table);


		JLabel Label1 = new JLabel("습득물건");
		Label1.setFont(new Font("나눔바른고딕",Font.BOLD,30));
		Label1.setBounds(91, 100, 182, 61);
		contentPane.add(Label1);

		JLabel lblNewLabel_0 = new JLabel("습득위치");
		lblNewLabel_0.setFont(new Font("나눔바른고딕",Font.BOLD,30));
		lblNewLabel_0.setBounds(342, 100, 182, 61);
		contentPane.add(lblNewLabel_0);

		JLabel lblNewLabel_1 = new JLabel("습득날짜");
		lblNewLabel_1.setFont(new Font("나눔바른고딕",Font.BOLD,30));
		lblNewLabel_1.setBounds(589, 100, 182, 61);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("보관장소");
		lblNewLabel_2.setFont(new Font("나눔바른고딕",Font.BOLD,30));
		lblNewLabel_2.setBounds(842, 100, 182, 61);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("등록일자");
		lblNewLabel_3.setFont(new Font("나눔바른고딕",Font.BOLD,30));
		lblNewLabel_3.setBounds(1099, 100, 182, 61);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("더보기");
		lblNewLabel_4.setFont(new Font("나눔바른고딕",Font.BOLD,30));
		lblNewLabel_4.setBounds(1370, 100, 182, 61);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("검색");
		lblNewLabel_5.setFont(new Font("나눔바른고딕",Font.BOLD,25));
		lblNewLabel_5.setBounds(1089, 24, 48, 61);
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
		
		
//		btn_showmore = new JButton("더보기");
//		btn_showmore.setBounds(1285, 160, 259, 15);
//		contentPane.add(btn_showmore);
		
		//		
		//		JButton btnNewButton_1 = new JButton("New button");
		//		btnNewButton_1.setBounds(1295, 226, 259, 19);
		//		contentPane.add(btnNewButton_1);

		//		displayShowMore();//더보기 버튼 객체 생성

	}

	public void showMsg(String msg){
		JOptionPane.showMessageDialog(this, msg);
	}//showMsg


	public void displayPick(List<PickupVO> list) {
		dtm.setRowCount(0);
		int bound = 160;

		pdao = new PickupDAO();
		size = pdao.getPiMaxNum();
		btn_showmore2 = new JButton[size];

		//		"습득물건","습득위치","습득날짜","보관장소","등록일자","더보기"
		for (int i = 0; i < list.size(); i++) {
			PickupVO vo = list.get(i);

			Object []data= {vo.getPithing(),vo.getPiloc(),vo.getPidate(), vo.getStorage(), vo.getRegidate()};
			dtm.addRow(data);

			btn_showmore2[i] = new JButton("더보기");
			btn_showmore2[i].setName(Integer.toString(vo.getPino()));
			btn_showmore2[i].setBounds(1285, bound, 259, 15);
			contentPane.add(btn_showmore2[i]);
			//btn_showmore[i].addActionListener(this);
			bound+=16;
		}
	}

	//찾아주세요_글쓰기 페이지 초기화
	public void initForm(){//입력폼 초기화
		tf_Search.setText("");	         

		tf_Search.requestFocus();
	}//initForm
	//	public void actionPerformed(ActionEvent e) {//ActionListener가 반드시 생성해야하는 메소드?
	//		// TODO Auto-generated method stub
	//		System.out.println(e.getSource().getClass().getName());
	//		System.out.println("Button Press!");
	//	}

}











