package org.itstep.service;

import org.itstep.model.PojoObject;

public interface SpringPojoService {

	PojoObject save(PojoObject springPojo);
	
	PojoObject update(PojoObject springPojo);
	
	PojoObject get(Integer id);
	
	void delete(Integer id);
	
}
