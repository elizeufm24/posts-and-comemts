package br.com.spoc.aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import br.com.spoc.entities.Comment;
import br.com.spoc.entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
	    Comment c1 = new Comment("Have a nice trip");
	    Comment c2 = new Comment("I to go with you..kkkkk");
        Post post = new Post(
        		sdf.parse("23/04/2019 12:34:22"), 
        		"Traveling to france", 
        		"I'm goin to wonderful country", 23);
        post.addComment(c1);
        post.addComment(c2);
        
        System.out.println(post);
		
	}
}
