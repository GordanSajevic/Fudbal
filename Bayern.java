public class Bayern extends Tim{

	//Unos podataka za klub
	
	public Bayern()
	{
		super("Bayern Munchen", "Munchen");
		// igrači
		Ocjene ocjeneIgrac1 = new Ocjene(77, 83, 79, 85, 79, 85, 72, 75);
		Igrac igrac1 = new Igrac("Robert", "Lewandowski", ocjeneIgrac1, 9);
		dodajIgraca(igrac1);
		Ocjene ocjeneIgrac2 = new Ocjene(89, 82, 88, 72, 87, 79, 77, 81);
		Igrac igrac2 = new Igrac("Arjen", "Robben", ocjeneIgrac2, 10);				
		dodajIgraca(igrac2);
		Ocjene ocjeneIgrac3 = new Ocjene(85, 85, 87, 71, 83, 76, 77, 79);
		Igrac igrac3 = new Igrac("Franck", "Ribery", ocjeneIgrac3, 7);
		dodajIgraca(igrac3);
		Ocjene ocjeneIgrac4 = new Ocjene(81, 81, 83, 77, 79, 79, 75, 78);
		Igrac igrac4 = new Igrac("Thomas", "Muller", ocjeneIgrac4, 25);
		dodajIgraca(igrac4);
		Ocjene ocjeneIgrac5 = new Ocjene(75, 87, 77, 76, 80, 72, 78, 80);
		Igrac igrac5 = new Igrac("Bastian", "Schweinsteiger", ocjeneIgrac5, 31);
		dodajIgraca(igrac5);
		Ocjene ocjeneIgrac6 = new Ocjene(72, 85, 77, 74, 86, 70, 83, 76);
		Igrac igrac6 = new Igrac("Xabi", "Alonso", ocjeneIgrac6, 3);
		dodajIgraca(igrac6);
		Ocjene ocjeneIgrac7 = new Ocjene(80, 75, 71, 68, 75, 66, 77, 79);
		Igrac igrac7 = new Igrac("David", "Alaba", ocjeneIgrac7, 27);
		dodajIgraca(igrac7);
		Ocjene ocjeneIgrac8 = new Ocjene(85, 77, 74, 65, 75, 67, 85, 80);
		Igrac igrac8 = new Igrac("Phillip", "Lahm", ocjeneIgrac8, 21);
		dodajIgraca(igrac8);
		Ocjene ocjeneIgrac9 = new Ocjene(74, 75, 62, 83, 70, 65, 84, 76);
		Igrac igrac9 = new Igrac("Jerome", "Boateng", ocjeneIgrac9, 17);
		dodajIgraca(igrac9);
		Ocjene ocjeneIgrac10 = new Ocjene(71, 72, 57, 81, 73, 50, 79, 75);
		Igrac igrac10 = new Igrac("Santos", "Dante", ocjeneIgrac10, 4);
		dodajIgraca(igrac10);
		Ocjene ocjeneIgrac11 = new Ocjene(75, 72, 53, 75, 52, 42, 77, 64);
		Igrac igrac11 = new Igrac("Manuel", "Neuer", ocjeneIgrac11, 1);
		dodajIgraca(igrac11);
				
		//Osoblje kluba
		Osoba predsjednik = new Osoba("Karl", "Hopfner", "hpf@hotmail.com", "predsjednik");
		Osoba trener = new Osoba("Pep", "Guardiola", "ppg@hotmail.com", "trener");
		Osoba fiz = new Osoba("Francisco", "Coppado", "cpd@hotmail.com", "fizioterapeut");
		Osoba menager= new Osoba("Martino", "Martes", "mrt@hotmail.com", "menadžer");
		Osoba doktor = new Osoba("Pedro", "Gonzales", "pgl@hotmail.com", "doktor");
		Osoba psi = new Osoba("Luis", "Rodriguez", "lis@hotmail.com", "psiholog");
		dodajOsobu(predsjednik);
		dodajOsobu(trener);
		dodajOsobu(menager);
		dodajOsobu(doktor);
		dodajOsobu(psi);
		dodajOsobu(fiz);
	}
}
