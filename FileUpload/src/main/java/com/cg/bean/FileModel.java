package com.cg.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "images")
public class FileModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private long id;

	@Column(name="fileName")
	private String fileName;

	@Column(name="fileType")
	private String fileType;

	@Column(name="size")
	private long size;

	public FileModel() {
		
	}

	public FileModel(long id, String fileName, String fileType, long size) {
		
		this.id = id;
		this.fileName = fileName;
		this.fileType = fileType;
		this.size = size;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "FileModel [id=" + id + ", fileName=" + fileName + ", fileType=" + fileType + ", size=" + size + "]";
	}

	
}
