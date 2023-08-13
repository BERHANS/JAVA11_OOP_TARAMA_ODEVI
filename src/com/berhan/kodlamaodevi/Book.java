package com.berhan.kodlamaodevi;

import java.util.UUID;

public class Book {

	private String baslik;
	private String yazar;
	private String ISBN;
	private String yayınYili;
	



	public String getBaslik() {
		return baslik;
	}



	public void setBaslik(String baslik) {
		this.baslik = baslik;
	}



	public String getYazar() {
		return yazar;
	}



	public void setYazar(String yazar) {
		this.yazar = yazar;
	}



	public String getISBN() {
		return ISBN;
	}



	public void setISBN() {
		ISBN = UUID.randomUUID().toString();
	}



	public String getYayınYili() {
		return yayınYili;
	}



	public void setYayınYili(String yayınYili) {
		this.yayınYili = yayınYili;
	}
	
	
	
	
}
