package model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import mybatis.MySqlSession;

public class PickupDAO {//찾아가세요 분실물 DAO
	SqlSession session;
	public PickupDAO() {
		session = MySqlSession.getSqlSession();// TODO Auto-generated constructor stub
	}

	public boolean insert (PickupVO vo) {
		try {
			session.insert("tableMapper.piInsert", vo);			
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}finally {
			session.commit();			
		}
	}

	public boolean delete () {
		session.delete("tableMapper.piDelete");
		session.commit();
		return true;
	}

	public int getPiMaxNum() {
		try {
			return session.selectOne("tableMapper.piMaxNo");
		} catch (NullPointerException e) {
			return 0;
		}

	}

	public List<PickupVO> mainSelect() {
		return session.selectList("tableMapper.piMainSelect");
	}

	public List<PickupVO> moreSelect(int num) {//더보기 버튼 이벤트 리스너 동작 시, 더보기창에 데이터 불러오기 위한 함수(매개변수 고유번호에 매칭시켜서 사용)
		try {
			return session.selectList("tableMapper.piMoreSelect", num);
		} catch (NullPointerException e) {
			return null;
		}
	}

	public List<PickupVO> searchSelect(String word) {
		return session.selectList("tableMapper.piSearch",word);
	}
}