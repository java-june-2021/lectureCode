package com.matthew.albums.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.matthew.albums.models.Song;
import com.matthew.albums.services.AlbumService;
import com.matthew.albums.services.SongService;

@Controller
@RequestMapping("/song")
public class SongController {
	@Autowired
	private SongService sService;
	@Autowired
	private AlbumService aService;
	
	@GetMapping("/new")
	public String createSong(@ModelAttribute("song") Song song, Model viewModel) {
		viewModel.addAttribute("albums", this.aService.allAlbums());
		return "/song/song.jsp";
	}
	
	@PostMapping("/add")
	public String addSong(@Valid @ModelAttribute("song") Song song, BindingResult result, Model viewModel) {
		Long albumId = song.getAlbum().getId();
		if(result.hasErrors()) {
			viewModel.addAttribute("albums", this.aService.allAlbums());
			return "/song/song.jsp";
		}
		this.sService.create(song);
		return "redirect:/album/" + albumId;
	}
}
