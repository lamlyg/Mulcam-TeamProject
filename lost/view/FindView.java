package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import model.PickupDAO;
import model.PickupVO;

public class FindView extends JFrame{

	private JPanel contentPane;

	PickupDAO pdao;
	PickupVO pvo;

	JTable table;
	DefaultTableModel dtm;//테이블에 행데이터를 추가 또는 삭제 기능
	JScrollPane scrol_table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FindView frame = new FindView();
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
	public FindView() {

		String []columnNames = {"","","","","",""};
		//"습득물건(간략히)","습득물건(자세히)","습득장소","습득날짜","습득시간","보관장소"

		Object [][] data = new Object[0][6];

		pdao = new PickupDAO();

		dtm = new DefaultTableModel(data, columnNames);

		table = new JTable(dtm);

		scrol_table = new JScrollPane(table);//스크롤(데이터 많아질 경우, 페이지 부족->스크롤이용)
		scrol_table.setBounds(30, 156, 1251, 601);



		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JLabel title = new JLabel("찾아가세요");
		contentPane.add(title, BorderLayout.NORTH);
		title.setBounds(32, 12, 285, 70);
		title.setFont(new Font("맑은 고딕",Font.BOLD,50));

		JLabel prop = new JLabel("습득물건 (자세히)");
		contentPane.add(prop, BorderLayout.WEST);
		prop.setBounds(103, 220, 267, 39);
		prop.setFont(new Font("맑은 고딕",Font.BOLD,30));

		JLabel prop2 = new JLabel("습득물건 (간략히)");
		contentPane.add(prop2);
		prop2.setBounds(103, 143, 255, 49);
		prop2.setFont(new Font("맑은 고딕",Font.BOLD,30));

		JLabel date = new JLabel("습득날짜");
		date.setBounds(103, 353, 184, 70);
		contentPane.add(date);
		date.setFont(new Font("맑은 고딕",Font.BOLD,30));

		JLabel dates = new JLabel("습득날짜");
		dates.setBounds(100, 529, 217, 73);
		contentPane.add(dates);
		dates.setFont(new Font("맑은 고딕",Font.BOLD,30));

		JLabel loc = new JLabel("보관장소");
		loc.setBounds(103, 708, 146, 64);
		contentPane.add(loc);
		loc.setFont(new Font("맑은 고딕",Font.BOLD,30));

		JLabel ddetail = new JLabel("(년, 월, 일)");
		ddetail.setBounds(103, 414, 159, 55);
		contentPane.add(ddetail);
		ddetail.setFont(new Font("맑은 고딕",Font.BOLD,30));

		JLabel rtime = new JLabel("(대략적인 시간)");
		rtime.setBounds(90, 590, 227, 55);
		contentPane.add(rtime);
		rtime.setFont(new Font("맑은 고딕",Font.BOLD,30));
	}

	public void displayPickMore(List<PickupVO> list) {
		dtm.setRowCount(0);
	
		pdao = new PickupDAO();
		
		//"습득물건(간략히)","습득물건(자세히)","습득장소","습득날짜","습득시간","보관장소"
		for (int i = 0; i < list.size(); i++) {
			PickupVO vo = list.get(i);

			Object []data= {vo.getPithing(),vo.getPithingmore(),vo.getPiloc(),vo.getPidate(),vo.getPitime(),vo.getStorage()};
			dtm.addRow(data);

		}
	}
	
	
}