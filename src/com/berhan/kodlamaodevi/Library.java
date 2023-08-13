package com.berhan.kodlamaodevi;

public class Library extends Book implements IGoruntule{
	 String[] kitaplik; 
	int kapasite = 0;
	
	
	
	
	
	public void kitapEkle() {
		
		String[] yedekler = null;
	if(kitaplik == null) {
		kitaplik = new String[1];
		
		kitaplik[0] = "Kitabin başligi: " + getBaslik()+"\nKitabin ISBN numarasi: " +getISBN()+"\nKitabin yayin yili: "+ 
		getYayınYili()+"\nKitabin yazari: "+getYazar();
	}else {
		yedekler = new String[kapasite+1];
	for(int i = 0;i<kitaplik.length;i++) {
		yedekler[i] = kitaplik[i];
		
	}
		yedekler[kapasite]="Kitabin başligi: " + getBaslik()+"\nKitabin ISBN numarasi: " +getISBN()+"\nKitabin yayin yili: "+ 
				getYayınYili()+"\nKitabin yazari: "+getYazar();
		kitaplik = yedekler;
	}	
	kapasite++;
	}

	public void kitapSil(int index) {
		String[] yedekler = new String[kapasite - 1]; 
		int j = 0;
		for (int i = 0; i < kapasite; i++) {
			if (i != index) { 
				yedekler[i - j] = kitaplik[i]; 
			} else
				j = 1;
		}
		kitaplik = yedekler;
		kapasite--;
	}
	@Override
	public void konsolaYazdir() {
		for(int i =0;i<kitaplik.length;i++) {
			System.out.println((i+1)+ ". kitabin\n" +kitaplik[i]);
		}
		
	
		
	}

	@Override
	public void dosyayaYazdir() {

		
	}
	
	public void kitapAra(String aranicakKelime) {
		for(int i =0;i<kapasite;i++) {
			if(kitaplik[i].toLowerCase().contains(aranicakKelime.toLowerCase())) {
				System.out.println(kitaplik[i]);
			}
				
		}
	}
	

	
	
	
	
}
