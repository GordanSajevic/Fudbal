public class LigaPrvaka {

	//Simunalicja takmičenja
	
	private Tim[] klubovi;
	
	/**
	 * Konstruktor bez parametara
	 */
	
	public LigaPrvaka()
	{
		this.klubovi = new Tim [8];
	}
	
	/**
	 * Funkcija koja dodaje timove u niz
	 */
	
	public void dodajTimove()
	{
		
		this.klubovi[0] = new Arsenal();
		this.klubovi[1] = new Bayern();
		this.klubovi[2] = new Barcelona();
		this.klubovi[3] = new Chelsea();
		this.klubovi[4] = new Dortmund();
		this.klubovi[5] = new Juventus();
		this.klubovi[6] = new Real();
		this.klubovi[7] = new Atletico();
	}
	
	/**
	 * Funkcija koja uz pomoć funkcije utakmica() vodi takmičenje
	 */
	
	public void takmicenje()
	{
		dodajTimove();
		//Četvrtfinale
		System.out.println("Dobrodošli u četvrfinale Lige Prvaka!");
		Tim polufinalist1 = utakmica(klubovi[0], klubovi[7]);
		Tim polufinalist2 = utakmica(klubovi[1], klubovi[6]);
		Tim polufinalist3 = utakmica(klubovi[2], klubovi[5]);
		Tim polufinalist4 = utakmica(klubovi[3], klubovi[4]);
		System.out.println("Slijedi polufinale Lige prvaka!");
		System.out.println("U igri su ostali " +  polufinalist1.getIme() + ", " + 
			polufinalist2.getIme() + ", " + polufinalist3.getIme() + " i " + polufinalist4.getIme());
		Tim finalist1 = utakmica(polufinalist1, polufinalist4);
		Tim finalist2 = utakmica(polufinalist2, polufinalist3);
		System.out.println("Slijedi veliko finale!");
		Tim pobjednik = utakmica(finalist1, finalist2);
		System.out.println("Šampion je " + pobjednik.getIme() + " iz " + pobjednik.getGrad() + "!");
	}
	
	/**
	 * Funkcija koja određuje koji tim je bolji, na osnovu ocjena igrača
	 * @param tim1
	 * @param tim2
	 * @return Tim
	 */
	
	public Tim utakmica(Tim tim1, Tim tim2)
	{
		System.out.println("U ovo utakmici sastaju se " + tim1.getIme() + " iz " + tim1.getGrad()
				+ " i " + tim2.getIme() + " iz " + tim2.getGrad());
		System.out.println("Postava tima " + tim1.getIme() + ": ");
		ispisiPostave(tim1);
		System.out.println("\nPostava tima " + tim2.getIme() + ": ");
		ispisiPostave(tim2);
		double[] prvi = racunajProsjek(tim1);
		double[] drugi = racunajProsjek(tim1);
		double[] pobjednik = uporediTimove(prvi, drugi);
		System.out.println();
		if (pobjednik == prvi)
		{
			System.out.println("Pobjednik je: " + tim1.getIme() + " iz " + tim1.getGrad() + "!\n");
			return tim1;
		}
		else
		{
			System.out.println("Pobjednik je: " + tim2.getIme() + " iz " + tim2.getGrad() + "!\n");
			return tim2;
		}
	}

	/**
	 * Funkcija koja prima dva tima, računa prosjek svih ocjena i poredi prosjeke
	 * Tim koji ima više prosjeke svih ocjena prolazi dalje.
	 * Ukoliko su dva tima izjednačena, u obzir se uzima faktor sreće
	 * @param prvi
	 * @param drugi
	 * @return niz
	 */
	
	private double[] uporediTimove(double[] prvi, double[] drugi) {
		int prviTim = 0;
		int drugiTim = 0;
		for (int i=0; i<11; i++)
		{
			if (prvi[i] > drugi[i])
			{
				prviTim++;
			}
			else if (prvi[i] < drugi[i])
			{
				drugiTim++;
			}
		}
		if (prviTim > drugiTim)
		{
			return prvi;
		}
		else if (drugiTim > prviTim)
		{
			return drugi;
		}
		else
		{
			prviTim *= (int)(Math.random()*10);
			drugiTim *= (int)(Math.random()*10);
			if (prviTim > drugiTim)
			{
				return prvi;
			}
			else if (drugiTim > prviTim)
			{
				return drugi;
			}
		}
		return drugi;
	}

	/**
	 * Funkcija koja računa prosjeke svih ocjena jednog tima
	 * @param tim1
	 * @return niz
	 */
	
	private double[] racunajProsjek(Tim tim1) {
		double[] nizOcjena = new double[11];
		double sumaBrz = 0;
		for (int i=0; i<11; i++)
		{
			nizOcjena[0] += tim1.getIgraci()[i].getOcjene().getBrzina();
			if (i == 10)
			{
				nizOcjena[0] = nizOcjena[0]/11;
			}
		}
		for (int i=0; i<11; i++)
		{
			nizOcjena[1] += tim1.getIgraci()[i].getOcjene().getDodavanje();
			if (i == 10)
			{
				nizOcjena[1] = nizOcjena[1]/11;
			}
		}
		for (int i=0; i<11; i++)
		{
			nizOcjena[2] += tim1.getIgraci()[i].getOcjene().getDribling();
			if (i == 10)
			{
				nizOcjena[2] = nizOcjena[2]/11;
			}
		}
		for (int i=0; i<11; i++)
		{
			nizOcjena[3] += tim1.getIgraci()[i].getOcjene().getInstinkt();
			if (i == 10)
			{
				nizOcjena[3] = nizOcjena[3]/11;
			}
		}
		for (int i=0; i<11; i++)
		{
			nizOcjena[4] += tim1.getIgraci()[i].getOcjene().getKondicija();
			if (i == 10)
			{
				nizOcjena[4] = nizOcjena[4]/11;
			}
		}
		for (int i=0; i<11; i++)
		{
			nizOcjena[5] += tim1.getIgraci()[i].getOcjene().getSutiranje();
			if (i == 10)
			{
				nizOcjena[5] = nizOcjena[5]/11;
			}
		}
		for (int i=0; i<11; i++)
		{
			nizOcjena[6] += tim1.getIgraci()[i].getOcjene().getUklizavanje();
			if (i == 10)
			{
				nizOcjena[6] = nizOcjena[6]/11;
			}
		}
		for (int i=0; i<11; i++)
		{
			nizOcjena[7] += tim1.getIgraci()[i].getOcjene().getVugla();
			if (i == 10)
			{
				nizOcjena[7] = nizOcjena[7]/11;
			}
		}
		return nizOcjena;
	}

	/**
	 * Funkcija koja ispisuje imena, prezimena i brojeve igrača jednog tima
	 * @param tim
	 */
	
	private void ispisiPostave(Tim tim) {
		Igrac[] igraci = tim.getIgraci();
		for (int i=0; i<11; i++)
		{
			System.out.println(igraci[i].getIme() + " " + igraci[i].getPrezime() + ", " + igraci[i].getBroj());
		}
		
	}
	
}
