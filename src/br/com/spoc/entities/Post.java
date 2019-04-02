/*
 * Essa classe cria um post, e recebe em sua lista de comments vários comentarios
 * 
 * Autor::elizeuebay@gmail.com
 */

package br.com.spoc.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	//Lista de comentarios;
	private List<Comment> comments = new ArrayList<>();
	
	//Construtor padrão;
	public Post() {
	}

	//Construtor com argumentos;
	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}
	
    //Metodos acessores geters and seters;
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}
	
}
