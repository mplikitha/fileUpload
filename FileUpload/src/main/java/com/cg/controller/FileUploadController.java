package com.cg.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cg.bean.FileModel;
import com.cg.service.impl.FileStorageServiceImpl;

@RestController
@RequestMapping(value = "/api/v1")
public class FileUploadController {

	// logger
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	private FileStorageServiceImpl fileStorageServiceImpl;

	@Autowired
	public FileUploadController(FileStorageServiceImpl fileStorageServiceImpl) {
		
		this.fileStorageServiceImpl = fileStorageServiceImpl;
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public ResponseEntity<FileModel> uploadFile(@RequestParam("file") MultipartFile file) {

		FileModel uploadedFile = fileStorageServiceImpl.fileStorage(file);
		logger.info("file uploaded");

		return new ResponseEntity<FileModel>(uploadedFile, HttpStatus.OK);

	}

	@RequestMapping(value = "/files", method = RequestMethod.GET)
	public ResponseEntity<List<FileModel>> getAllFiles() {
		List<FileModel> files = fileStorageServiceImpl.getAllFiles();

		return new ResponseEntity<List<FileModel>>(files, HttpStatus.OK);
	}

}