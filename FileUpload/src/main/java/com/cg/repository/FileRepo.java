package com.cg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.bean.FileModel;

@Repository
public interface FileRepo extends JpaRepository<FileModel, String> {

	// Gets file details by fileName from database
	public List<FileModel> getByFileName(String fileName);

	// Gets file details by Id from database
	public FileModel getById(long id);

}
