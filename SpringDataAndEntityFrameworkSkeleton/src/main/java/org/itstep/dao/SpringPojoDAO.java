package org.itstep.dao;

import org.itstep.model.PojoObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringPojoDAO extends JpaRepository<PojoObject, Integer>{
	
}
