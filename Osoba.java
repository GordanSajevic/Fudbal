public class Osoba {

	//Zadatak za samostalni rad
	
	private String ime;
	private String prezime;
	private String mail;
	private String uloga;
	
	/**
	 * Konstruktor koji prima sve parametre
	 * @param ime
	 * @param prezime
	 * @param mail
	 * @param uloga
	 */
	
	public Osoba(String ime, String prezime, String mail, String uloga)
	{
		this.ime = ime;
		this.prezime = prezime;
		this.mail = mail;
		this.uloga = uloga;
	}
	
	/**
	 * Getter za ime
	 * @return ime
	 */
	
	public String getIme()
	{
		return ime;
	}
	
	/**
	 * Getter za prezime
	 * @return prezime
	 */
	
	public String getPrezime()
	{
		return prezime;
	}
	
	/**
	 * Getter za mail
	 * @return mail
	 */
	
	public String getMail()
	{
		return mail;
	}
	
	/**
	 * Getter za ulogu
	 * @return uloga
	 */
	
	public String getUloga()
	{
		return uloga;
	}
	
	/**
	 * Setter za ime
	 * @param ime
	 */
	
	public void setIme(String ime)
	{
		if (ime.length() < 1)
		{
			throw new IllegalArgumentException("Ime ne može biti prazno!");
		}
		else
		{
			this.ime = ime;
		}
	}
	
	/**
	 * Setter za prezime
	 * @param prezime
	 */
	
	public void setPrezime(String prezime)
	{
		if (prezime.length() < 1)
		{
			throw new IllegalArgumentException("Prezime ne može biti prazno!");
		}
		else
		{
			this.prezime = prezime;
		}
	}
	
	/**
	 * Setter za mail
	 * @param mail
	 */
	
	public void setMail(String mail)
	{
		boolean ludoA = false;
		for (int i=0; i<mail.length(); i++)
		{
			if (mail.charAt(i) == ('@'))
			{
				ludoA = true;
			}
		}
		if (ludoA == false)
		{
			throw new IllegalArgumentException("Niste ispravno unijeli e-mail adresu!");
		}
		else
		{
			this.mail = mail;
		}
	}
	
	/**
	 * Setter za ulogu
	 * @param uloga
	 */
	
	public void setUloga(String uloga)
	{
		if (uloga != "trener" && uloga != "menadžer" && uloga != "fizioterapeut" 
			&& uloga != "psiholog" && uloga != "doktor" && uloga != "predsjednik")
		{
			throw new IllegalArgumentException("Niste ispravno unijeli ulogu osobe!");
		}
		else
		{
			this.uloga = uloga;
		}
	}
	
	/**
	 * Funkcija koja vraća string sa svim podacima o osobi
	 */
	
	public String toString()
	{
		return "\nIme: " + ime + "\nPrezime: " + prezime + "\nE-mail: " + mail
				+ "\nUloga: " + uloga + "\n";
	}
}
