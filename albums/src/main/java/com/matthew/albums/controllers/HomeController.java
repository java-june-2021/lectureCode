package com.matthew.albums.controllers;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.matthew.albums.models.Album;
import com.matthew.albums.models.Label;
import com.matthew.albums.services.AlbumService;
import com.matthew.albums.services.LabelService;

@Controller
public class HomeController {
	@Autowired
	private AlbumService aService;
	@Autowired
	private LabelService lService;	
	
	@GetMapping("/")
	public String index(Model viewModel) {
		viewModel.addAttribute("allAlbums", this.aService.allAlbums());
		return "/album/index.jsp";
	}
	
	@GetMapping("/new")
	public String newAbum(@ModelAttribute("album") Album album) {
		return "/album/new.jsp";
	}
	
	@PostMapping("/addRecord")
	public String addAlbumJSTL(@Valid @ModelAttribute("album") Album album, BindingResult result) {
		if(result.hasErrors()) {
			return "/album/new.jsp";
		}
		this.aService.createAlbum(album);
		return "redirect:/";
	}
	@PostMapping("/addRecordHTMLWay")
	public String addAlbum(@RequestParam("bandName") String bandName, @RequestParam("albumName") String albumName, @RequestParam("releaseYear") int releaseYear, RedirectAttributes redirectAttr) {
		ArrayList<String> errors = new ArrayList<String>();
		if(bandName.equals("")) {
			errors.add("Hey put in a name what were you thinking");
		}
		if(errors.size() > 0) {
			for(String e : errors) {
				redirectAttr.addFlashAttribute("error", e);
			}
			return "redirect:/new";
		}
		Album newAlbum = new Album(bandName, albumName, releaseYear);
		this.aService.createAlbum(newAlbum);
		return "redirect:/";
	}
	
	@GetMapping("/album/{id}")
	public String show(Model viewModel, @PathVariable("id") Long id, @ModelAttribute("label") Label label) {
		Album albumToShow = this.aService.getOneAlbum(id);
		viewModel.addAttribute("album", albumToShow);
		return "/album/show.jsp";
	}
	
	@PostMapping("/{albumId}/addlabel")
	public String addlabel(@Valid @ModelAttribute("label") Label label, BindingResult result, Model viewModel, @PathVariable("albumId") Long id) {
		if(result.hasErrors()) {
			Album albumToShow = this.aService.getOneAlbum(id);
			viewModel.addAttribute("album", albumToShow);
			return "/album/show.jsp";
		}
		Album albumForLabel = this.aService.getOneAlbum(id);
		label.setAlbum(albumForLabel);
		this.lService.createLabel(label);
		return "redirect:/album/{albumId}";
	}
	
	@GetMapping("/{id}/edit")
	public String edit(@ModelAttribute("album") Album album, Model viewModel, @PathVariable("id") Long id) {
		viewModel.addAttribute("album", this.aService.getOneAlbum(id));
		return "/album/edit.jsp";
	}
	
	@PostMapping("/{id}/edit")
	public String processEdit(@Valid @ModelAttribute("album") Album album, BindingResult result, Model viewModel, @PathVariable("id") Long id) {
		if(result.hasErrors()) {
			viewModel.addAttribute("album", this.aService.getOneAlbum(id));
			return "/album/edit.jsp";
		}
		
		this.aService.updateAlbum(album);
		return "redirect:/album/{id}";
	}
	
	@GetMapping("/{id}/delete")
	public String delete(@PathVariable("id") Long id) {
		this.aService.deleteAlbum(id);
		return "redirect:/";
	}
	
}
