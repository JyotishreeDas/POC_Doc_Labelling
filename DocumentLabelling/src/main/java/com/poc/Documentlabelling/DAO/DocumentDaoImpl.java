package com.poc.Documentlabelling.DAO;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import com.poc.Documentlabelling.entity.Document;
import com.poc.Documentlabelling.entity.DocumentRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository

public class DocumentDaoImpl implements DocumentDao{
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public DocumentDaoImpl(JdbcTemplate jdbcTemplate) {
		  this.jdbcTemplate = jdbcTemplate;
	    }

	
	@Override
     public List<Document> getAllDocuments() {
		String sql = "SELECT * FROM aisservice_locEnvDB.FILES";
   		RowMapper<Document> rowMapper = new DocumentRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}	

}



/*package com.poc.Documentlabelling.DAO;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.poc.Documentlabelling.model.Document

public class DocumentDaoImpl implements DocumentDao{

    @PersistenceContext
    private EntityManager entityManager;
	
	
	@Override
	public List<Document> getAllDocuments()
    {
        return entityManager.createQuery("select docs from Student aisservice_locEnvDB.FILES docs").getResultList();
    }	
	

}
*/

