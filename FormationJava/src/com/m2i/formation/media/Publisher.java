package com.m2i.formation.media;


public class Publisher
{
	private int id;
	private String nom;
	private String siret;	
	
	public String getNom()
	{
		return nom;
	}
	public void setNom(String nom)
	{
		this.nom = nom;
//		autoInc(id);
	}
	public String getSiret()
	{
		return siret;
	}
	
	public void setSiret(String siret)
	{
		this.siret = siret;
	}
	public int getId()
	{
		return id;
	}
	
//	private void autoInc(int id)
//	{
//		this.id++;
//	}
	public String toString()
	{
		String about = " Editeur :\n";
		about += " Id	 : "+ this.getId()+"\n";
		about += " Nom   : "+ this.getNom()+"\n";
		about += " Siret : "+ this.getSiret()+"\n";
		
		return about;
	}
	
}
