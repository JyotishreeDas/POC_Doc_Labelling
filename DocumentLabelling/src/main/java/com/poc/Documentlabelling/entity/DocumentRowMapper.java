package com.poc.Documentlabelling.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;  

public class DocumentRowMapper implements RowMapper<Document> {
	
	@Override
	public Document mapRow(ResultSet row, int rowNum) throws SQLException {
		Document doc = new Document();
		doc.setFile_id(row.getInt("file_id"));
		doc.setFile_name(row.getString("file_name"));
		doc.setFile_size(row.getInt("file_size"));
		doc.setFile_content(row.getBytes("file_content"));
		return doc;

  }
}
