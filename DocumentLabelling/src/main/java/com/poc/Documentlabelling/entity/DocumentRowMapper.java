package com.poc.Documentlabelling.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;  

public class DocumentRowMapper implements RowMapper<Document> {
	
	@Override
	public Document mapRow(ResultSet row, int rowNum) throws SQLException {
		Document doc = new Document();
		doc.setFileid(row.getInt("fileid"));
		doc.setFilename(row.getString("filename"));
		doc.setFilesize(row.getInt("filesize"));
		doc.setFilecontent(row.getBytes("filecontent"));
		return doc;

  }
}
