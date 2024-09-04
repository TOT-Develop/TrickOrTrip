package totreviews.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import totreviews.domain.TReviewImageVO;
import totreviews.domain.TReviewResDTO;
import totreviews.domain.TReviewVO;

@Repository
public class TReviewDAO {

	private static final String NAMESPACE = "totreviews.mapper.TReviewMapper";

	@Autowired
	private SqlSession sqlSession;

	public void insertTReview(TReviewVO treviewVO) {
		sqlSession.insert(NAMESPACE + ".insertTReview", treviewVO);
	}

	public void insertTReviewImage(TReviewImageVO treviewImageVO) {
		sqlSession.insert(NAMESPACE + ".insertTReviewImage", treviewImageVO);
	}

	public List<TReviewResDTO> getAllTReviews() {
		return sqlSession.selectList(NAMESPACE + ".getAllTReviews");
	}

}
