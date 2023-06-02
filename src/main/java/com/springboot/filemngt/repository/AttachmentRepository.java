package com.springboot.filemngt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.filemngt.model.Attachment;

public interface AttachmentRepository extends JpaRepository<Attachment, String> {

}
