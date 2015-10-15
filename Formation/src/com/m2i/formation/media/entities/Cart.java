package com.m2i.formation.media.entities;

import java.util.*;

/**
 * Classe qui gére un panier de média
 * 
 * @author adminlocal
 *
 */
public class Cart
{
	// ------------------------------------------------------------
	// Champs
	private List<Media> medias = new ArrayList<Media>();
	// private double vatPrice;

	// ------------------------------------------------------------
	// ------------------------------------------------------------
	// Beans
	public List<Media> getMedias()
	{
		return medias;
	}

	/**
	 * Retourne le prix TTC en fonction du média
	 * @return
	 */
	public double getVatPrice()
	{
		double price = 0;
		for (Media m : medias)
		{
			price += m.getVATPrice();
		}
		return price;
	}

	// ------------------------------------------------------------
	// ------------------------------------------------------------
	// Others Methods
	// public void addMedia(Media m)
	// {
	// medias.add(m);
	// }
	// ------------------------------------------------------------
}
