package com.m2i.formation.dna;

public class AminoAcid
{
	// ----------------------------------------------------------
	// Attributs
	// Collection de 22 AA
	private String longName;
	private String trigram;
	private char codeLetter;
	// ----------------------------------------------------------
	// ----------------------------------------------------------
	// Beans
	public String getLongName()
	{
		return longName;
	}
	public void setLongName(String longName)
	{
		this.longName = longName;
	}
	public String getTrigram()
	{
		return trigram;
	}
	public void setTrigram(String trigram)
	{
		this.trigram = trigram;
	}
	public char getCodeLetter()
	{
		return codeLetter;
	}
	public void setCodeLetter(char codeLetter)
	{
		this.codeLetter = codeLetter;
	}	
	// ----------------------------------------------------------
}
