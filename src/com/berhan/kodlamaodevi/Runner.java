package com.berhan.kodlamaodevi;

public class Runner {

	public static void main(String[] args) {

	Library library = new Library();
	library.setBaslik("kırmızı");
	library.setYayınYili("2010");
	library.setYazar("ahmet");
	library.setISBN();
	library.kitapEkle();
	library.setBaslik("beyaz");
	library.setYayınYili("2015");
	library.setYazar("mahmut");
	library.setISBN();
	library.kitapEkle();
	library.setBaslik("mor");
	library.setYayınYili("05510");
	library.setYazar("taylan");
	library.setISBN();
	library.kitapEkle();
	library.setBaslik("sdsdsd");
	library.setYayınYili("2778");
	library.setYazar("asasdasds");
	library.setISBN();
	library.kitapEkle();
	
	library.kitapSil(2);

	library.kitapAra("BEYAZ");
	
		
	}

}
