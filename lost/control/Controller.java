package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.JButton;

import model.LostDAO;
import model.LostVO;
import model.PickupDAO;
import model.PickupVO;
import view.FindForm;
import view.FindView;
import view.LostForm;
import view.LostView;
import view.MainView;
import view.WriteForm_find;
import view.WriteForm_lost;

/*
<컨트롤러 역할, 하는 일>
- 전체 어플리케이션의 흐름제어
- 뷰와 모델의 중계자 

1. 사용자의 (뷰를 통해) 요청 분석
2. 사용자가 입력한 데이터를 얻어오기  
3. Model(JavaBeans,File입출력을 구현한 클래스,계산기클래스,DB관련클래스)객체생성
  - 메소드호출
  - 호출한 결과 저장
4. 이동할 페이지(뷰--->모델의 결과를 전달) 결정
------------------------------------------------------------
5. 유효성 검사 : Controller또는 View에 정의 
  (사용자가 입력한 데이터가 정해진 범위내의 데이터인지를 검사)

 */

public class Controller implements ActionListener{
	//뷰등록
	MainView mainView;
	FindForm findform;
	LostForm lostform;
	FindView findview;
	LostView lostview;
	WriteForm_find writefind;
	WriteForm_lost writelost;

	int count;
	
	JButton []btn_showmore2;

	public Controller() {


		mainView = new MainView();
		findform = new FindForm();
		lostform = new LostForm();

		findview = new FindView();
		lostview = new LostView();

		writefind = new WriteForm_find();
		writelost = new WriteForm_lost();

		
		eventUp();	
	}   

	private void eventUp(){
		//----mainView----
		mainView.bt_Find.addActionListener(this);
		mainView.bt_Lost.addActionListener(this);


		//--FindForm---
		//검색버튼 bt_Search
		findform.bt_Search.addActionListener(this);
		//글쓰기버튼 bt_Write
		findform.bt_Write.addActionListener(this);


		//--LostForm--
		//검색버튼 bt_Search
		lostform.bt_Search.addActionListener(this);
		//글쓰기버튼 bt_Write
		lostform.bt_Write.addActionListener(this);


		//입력폼의 우측상단 'X'버튼 클릭시  메인화면으로 이동
		findform.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				findform.setVisible(false);
				mainView.setVisible(true);
			}
		});

		//입력폼의 우측상단 'X'버튼 클릭시  메인화면으로 이동
		lostform.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				lostform.setVisible(false);
				mainView.setVisible(true);
			}
		});

		//입력폼의 우측상단 'X'버튼 클릭시  메인화면으로 이동	//더보기
		findview.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				findview.setVisible(false);
				findform.setVisible(true);
			}
		});


		//입력폼의 우측상단 'X'버튼 클릭시  메인화면으로 이동	//더보기
		lostview.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				lostview.setVisible(false);
				lostform.setVisible(true);
			}
		});

		//입력폼의 우측상단 'X'버튼 클릭시  메인화면으로 이동
		writefind.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				writefind.setVisible(false);
				findform.setVisible(true);
				//				PickupDAO dao = new PickupDAO();
				//				List<PickupVO> list = dao.mainSelect();
				//				
				//				findform.displayPick(list);

			}
		});

		//입력폼의 우측상단 'X'버튼 클릭시  메인화면으로 이동
		writelost.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				writelost.setVisible(false);
				lostform.setVisible(true);
			}
		});

		//찾아가세요 enroll ActionListener 등록
		writefind.bt_enroll.addActionListener(this);


		//찾아주세요 enroll ActionListener 등록
		writelost.bt_enroll.addActionListener(this);
		
		
//		findform.btn_showmore.addActionListener(this);			
	}


	private void eventUp2(){
	   for(int i=0; i<btn_showmore2.length; i++) {
		   btn_showmore2[i].addActionListener(this);
	   }
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob = e.getSource();//이벤트 소스의 레퍼런스 얻어오기

		String piSearch = findform.tf_Search.getText();
		
		
		
		if(btn_showmore2!= null && ob==btn_showmore2[0]) {
			System.out.println("첫번째버튼클릭");
		}

		if(ob==mainView.bt_Find){//메인뷰-"찾아가세요"버튼
            
			PickupDAO pidao = new PickupDAO();
			List<PickupVO> list = pidao.mainSelect();

			findform.displayPick(list);

			btn_showmore2= findform.btn_showmore2;
			eventUp2();
			
			mainView.setVisible(false);
			findform.setVisible(true);

		}else if(ob==mainView.bt_Lost) {//메인뷰-"찾아주세요"버튼

			LostDAO dao = new LostDAO();
			List<LostVO> list = dao.mainSelect();

			lostform.displayLost(list);

			mainView.setVisible(false);
			lostform.setVisible(true);
		}
		else if(ob==findform.bt_Search) {//찾아가세요 목록 - "검색"버튼
			String piSearch1 = findform.tf_Search.getText();
			PickupDAO pickupdao = new PickupDAO();
			List<PickupVO> list = pickupdao.searchSelect(piSearch1);
			
			findform.displayPick(list);
			//물품검색
			//검색창 초기화 메소드 호출
			findform.initForm();
		}
		else if(ob==findform.bt_Write) {//찾아가세요 목록 - "글쓰기"버튼
			findform.setVisible(false);
			writefind.setVisible(true);
		}
		else if(ob==lostform.bt_Search) {//찾아주세요 목록 - "검색"버튼
			String lothing = lostform.tf_Search.getText();
			//물품검색
		}
		else if(ob==lostform.bt_Write) {//찾아주세요 목록 - "글쓰기"버튼
			lostform.setVisible(false);
			writelost.setVisible(true);
		}
		else if(ob==writefind.bt_enroll) {//찾아가세요 글쓰기 - "등록"버튼
			PickupDAO pickupdao = new PickupDAO();

			int pino = (pickupdao.getPiMaxNum())+1;
			String pithing = writefind.tf_pithing.getText();
			String pithingmore = writefind.tf_pithingmore.getText();
			String piloc = writefind.tf_piloc.getText();
			String pidate = writefind.tf_pidate.getText();
			String pitime = writefind.tf_pitime.getText();
			String storage = writefind.tf_storage.getText();
			String yourinfo = writefind.tf_yourinfo.getText();

			SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");

			String regidate = date.format(System.currentTimeMillis());

			PickupVO pickupvo = new PickupVO(pino, pithing, pithingmore, piloc, pidate, pitime, storage,
					regidate, yourinfo);

			if(pickupdao.insert(pickupvo)) {
				writefind.showMsg("등록되었습니다.");
				//글쓰기 페이지 초기화 메소드 호출
				writefind.initForm();
				
				writefind.setVisible(false);
				findform.setVisible(true);
				//등록 성공 후 게시판 refresh
				PickupDAO dao = new PickupDAO();
				List<PickupVO> list = dao.mainSelect();
				
				findform.displayPick(list);
			}//else문 추가
			else {
				writefind.showMsg("다시 입력해주세요:  글자 수 초과");
			}
		}
		else if(ob==writelost.bt_enroll) {//찾아주세요 글쓰기 - "등록"버튼
			//			count
			LostDAO lostdao = new LostDAO();

			int pino=(lostdao.getLoMaxNum())+1;
			String lothing = writelost.tf_lothing.getText();
			String lothingmore = writelost.tf_lothingmore.getText();
			String loloc = writelost.tf_loloc.getText();
			String lodate = writelost.tf_lodate.getText();
			String lotime = writelost.tf_lotime.getText();
			String loyourinfo = writelost.tf_loyourinfo.getText();

			SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");

			String regidate = date.format(System.currentTimeMillis());

			LostVO lostvo = new LostVO(pino, lothing,lothingmore,loloc,lodate,lotime,regidate,loyourinfo);

			if(lostdao.insert(lostvo)) {
				writelost.showMsg("등록되었습니다.");

				writelost.initForm();
				writelost.setVisible(false);
				lostform.setVisible(true);


				//등록 성공 후 게시판 refresh
				LostDAO dao = new LostDAO();
				List<LostVO> list = dao.mainSelect();
				lostform.displayLost(list);

				lostform.setVisible(true);
			}
		}	
		else if(btn_showmore2!= null && ob==btn_showmore2[0]) {
			System.out.println("첫번째버튼클릭");
		

			String pino = findform.btn_showmore2[0].getName();
			System.out.println(pino);
			int num = Integer.parseInt(pino);
			PickupDAO dao = new PickupDAO();
			List<PickupVO> list = dao.moreSelect(num);

			findview.displayPickMore(list);


			findform.setVisible(false);
			findview.setVisible(true);

		}
	}//actionPerformed


	public static void main(String[] args) {
		new Controller();
	}

}