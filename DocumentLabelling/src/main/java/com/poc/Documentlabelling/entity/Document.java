package com.poc.Documentlabelling.entity;


public class Document {
	private int fileid;
	private String filename;
	private int filesize;
	private  byte[] filecontent;
	
	public Document()
	{
		
	}
	
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