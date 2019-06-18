package com.cg.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.cg.bean.FileModel;
import com.cg.repository.FileRepo;
import com.cg.service.FileStorageService;

@Service
public class FileStorageServiceImpl implements FileStorageService {

	@Autowired
	private FileRepo fileRepo;
	
	

	public FileStorageServiceImpl(FileRepo fileRepo) {
		this.fileRepo = fileRepo;
	}


	@Override
	public FileModel fileStorage(MultipartFile file) {

		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		
		FileModel fileModel = null;
		
		fileModel = new FileModel(0,fileName,file.getContentType(),file.getSize());

		return fileRepo.save(fileModel);

	}

	@Override
	public List<FileModel> getAllFiles() {
		List<FileModel> files = new ArrayList<FileModel>();
		files = fileRepo.findAll();

		return files;
	}

	@Override
	public Optional<FileModel> getFileById(String fileId) {

		Optional<FileModel> file;
		file = fileRepo.findById(fileId);

		return file;
	}

}
