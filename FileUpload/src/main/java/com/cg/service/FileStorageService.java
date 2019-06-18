package com.cg.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.cg.bean.FileModel;

public interface FileStorageService {

	public FileModel fileStorage(MultipartFile file);

	public List<FileModel> getAllFiles();

	public List<FileModel> getFileByName(String fileName);

	public FileModel getFileById(long id);

}
