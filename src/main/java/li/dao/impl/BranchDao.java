package li.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import li.dao.IBranchDao;
import li.model.Branch;

@Repository
public class BranchDao extends SqlSessionDaoSupport implements IBranchDao {

	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	};

	@Override
	public List<Branch> list() {
		return getSqlSession().getMapper(IBranchDao.class).list();
	}

}
