//Classe responsável por criar comentários;

//Autor:: elizeuebay@gmail.com
package br.com.spoc.entities;

public class Comment {
	
	private String text;
	
	public Comment() {
    }

	public Comment(String text) {
		this.text = text;
	}
 
	public void setText(String text) {
		this.text = text;
	}
	
	public String getText() {
		return this.text;
	}
	
}
