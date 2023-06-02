package com.springboot.filemngt.service;

import org.springframework.web.multipart.MultipartFile;

import com.springboot.filemngt.model.Attachment;

public interface AttachmentService {

	Attachment saveAttachment(MultipartFile file) throws Exception;
	
	Attachment getAttachment(String fileId) throws Exception;
}
