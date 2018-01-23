package com.poc.Documentlabelling.entity;


public class Document {
	private int file_id;
	private String file_name;
	private int file_size;
	private  byte[] file_content;
	
	
	public Document()
	{
	}
	
	public Document(int file_id, String file_name, int file_size, byte[] file_content) {
		super();
		this.file_id = file_id;
		this.file_name = file_name;
		this.file_size = file_size;
		this.file_content = file_content;
	}
	
	
	public int getFile_id() {
		return file_id;
	}

	public void setFile_id(int file_id) {
		this.file_id = file_id;
	}

	public String getFile_name() {
		return file_name;
	}

	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}

	public int getFile_size() {
		return file_size;
	}

	public void setFile_size(int file_size) {
		this.file_size = file_size;
	}

	public byte[] getFile_content() {
		return file_content;
	}

	public void setFile_content(byte[] file_content) {
		this.file_content = file_content;
	}

		
}





/*
  
 
package com.poc.Documentlabelling.model; 

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="aisservice_locEnvDB.FILES")

public class Document {

    @Id
    @Column(name="fileid")
    
	private int fileid;
	
	@Column(name="filename")
	private String filename;
	
	@Column(name="filesize")
	private int filesize;
	
	@Column(name="filecontent")
	private  byte[] filecontent;
	
	public Document(int fileid, String filename, int filesize, byte[] filecontent) {
		super();
		this.fileid = fileid;
		this.filename = filename;
		this.filesize = filesize;
		this.filecontent = filecontent;
	}
	
	
	
	public int getFileid() {
		return fileid;
	}
	public void setFileid(int fileid) {
		this.fileid = fileid;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public int getFilesize() {
		return filesize;
	}
	public void setFilesize(int filesize) {
		this.filesize = filesize;
	}
	public byte[] getFilecontent() {
		return filecontent;
	}
	public void setFilecontent(byte[] filecontent) {
		this.filecontent = filecontent;
	}
	

}
*/