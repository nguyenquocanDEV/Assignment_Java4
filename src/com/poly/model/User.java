package com.poly.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the Users database table.
 * 
 */
@Entity
@Table(name = "Users")
@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "Id")
    private String id;

    @Column(name = "Admin")
    private boolean admin;

    @Column(name = "Email")
    private String email;

    @Column(name = "FullName")
    private String fullName;

    @Column(name = "Password")
    private String password;

    // bi-directional many-to-one association to Favorite
    @OneToMany(mappedBy = "user")
    private List<Favorite> favorites;

    // bi-directional many-to-one association to Share
    @OneToMany(mappedBy = "user")
    private List<Share> shares;

    public User() {
    }

    public String getId() {
	return this.id;
    }

    public void setId(String id) {
	this.id = id;
    }

    public boolean getAdmin() {
	return this.admin;
    }

    public void setAdmin(boolean admin) {
	this.admin = admin;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getFullName() {
	return fullName;
    }

    public void setFullName(String fullName) {
	this.fullName = fullName;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public List<Favorite> getFavorites() {
	return this.favorites;
    }

    public void setFavorites(List<Favorite> favorites) {
	this.favorites = favorites;
    }

    public Favorite addFavorite(Favorite favorite) {
	getFavorites().add(favorite);
	favorite.setUser(this);

	return favorite;
    }

    public Favorite removeFavorite(Favorite favorite) {
	getFavorites().remove(favorite);
	favorite.setUser(null);

	return favorite;
    }

    public List<Share> getShares() {
	return this.shares;
    }

    public void setShares(List<Share> shares) {
	this.shares = shares;
    }

    public Share addShare(Share share) {
	getShares().add(share);
	share.setUser(this);

	return share;
    }

    public Share removeShare(Share share) {
	getShares().remove(share);
	share.setUser(null);

	return share;
    }

}