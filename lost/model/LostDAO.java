package model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import mybatis.MySqlSession;

public class LostDAO {//찾아주세요 분실물 DAO
   SqlSession session;
   public LostDAO() {
      session = MySqlSession.getSqlSession();// TODO Auto-generated constructor stub
   }
   
   public boolean insert (LostVO vo) {
      session.insert("tableMapper.loInsert",vo);
      session.commit();
      return true;
   }
   
   public boolean delete () {
      session.delete("tableMapper.loDelete");
      session.commit();
      return true;
   }
  
   public int getLoMaxNum() {
	   try {
			return session.selectOne("tableMapper.loMaxNo");
		} catch (NullPointerException e) {
			return 0;
		}
   }
   
   public List<LostVO> mainSelect() {
      return session.selectList("tableMapper.loMainSelect");
   }
   
   public List<Object> moreSelect(int num) {//더보기 버튼 이벤트 리스너 동작 시, 더보기창에 데이터 불러오기 위한 함수(매개변수 고유번호에 매칭시켜서 사용)
      return session.selectList("tableMapper.loMoreSelect");
   }
   
   public List<Object> searchSelect(String word) {
      return session.selectList("tableMapper.loSearch");
   }
}