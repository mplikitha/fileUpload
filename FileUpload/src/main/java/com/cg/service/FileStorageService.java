package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.web.multipart.MultipartFile;

import com.cg.bean.FileModel;

public interface FileStorageService {

	public FileModel fileStorage(MultipartFile file);
	
	public List<FileModel> getAllFiles();
	
	public Optional<FileModel> getFileById(String fileId);
	
	
}
