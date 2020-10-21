package li.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import li.dao.IBranchDao;
import li.model.Branch;
import li.service.IBranchService;

@Service
public class BranchService implements IBranchService {
	@Autowired
	private IBranchDao branchDao;
	
	@Override
	public List<Branch> list() {
		return branchDao.list();
	}
}
