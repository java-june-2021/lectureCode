package com.matthew.albums.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matthew.albums.models.Label;
import com.matthew.albums.repositories.LabelRepository;

@Service
public class LabelService {
	@Autowired
	private LabelRepository lRepo;
	
	public Label createLabel(Label label) {
		return this.lRepo.save(label);
	}
	
}
