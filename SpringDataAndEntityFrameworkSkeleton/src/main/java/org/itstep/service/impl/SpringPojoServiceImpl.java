package org.itstep.service.impl;

import org.itstep.dao.SpringPojoDAO;
import org.itstep.model.PojoObject;
import org.itstep.service.SpringPojoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpringPojoServiceImpl implements SpringPojoService {

	@Autowired(required=false)
	SpringPojoDAO springPojoDAO;

	public PojoObject save(PojoObject springPojo) {
		if (springPojoDAO.findOne(springPojo.getId()) == null) {
			return springPojoDAO.save(springPojo);
		}
		return null;
	}

	public PojoObject update(PojoObject springPojo) {
		if (springPojoDAO.findOne(springPojo.getId()) != null) {
			return springPojoDAO.save(springPojo);
		}
		return null;
	}

	public PojoObject get(Integer id) {
		return springPojoDAO.findOne(id);
	}

	public void delete(Integer id) {
		springPojoDAO.delete(id);
	}

}
