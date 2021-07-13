package com.matthew.albums.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // increment that key when new object created
	private Long id;
	private String firstName;
	private String lastName;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
			name="likes",
			joinColumns = @JoinColumn(name="user_id"),
			inverseJoinColumns = @JoinColumn(name="album_id")
			)
	private List<Album> likedAlbums;
	
	
	public User() {

	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public List<Album> getLikedAlbums() {
		return likedAlbums;
	}
	public void setLikedAlbums(List<Album> likedAlbums) {
		this.likedAlbums = likedAlbums;
	}
	
	
}
