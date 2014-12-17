public class Chelsea extends Tim{

	//Unos podataka za klub
	
	public Chelsea()
	{
		super("Chelsea", "West London");
		// igrači
		Ocjene ocjeneIgrac1 = new Ocjene(80, 77, 77, 85, 77, 85, 71, 79);
		Igrac igrac1 = new Igrac("Diego", "Costa", ocjeneIgrac1, 19);
		dodajIgraca(igrac1);
		Ocjene ocjeneIgrac2 = new Ocjene(84, 82, 88, 72, 83, 77, 72, 81);
		Igrac igrac2 = new Igrac("Eden", "Hazard", ocjeneIgrac2, 10);				
		dodajIgraca(igrac2);
		Ocjene ocjeneIgrac3 = new Ocjene(80, 78, 77, 75, 83, 76, 73, 77);
		Igrac igrac3 = new Igrac("Andre", "Schurrle", ocjeneIgrac3, 14);
		dodajIgraca(igrac3);
		Ocjene ocjeneIgrac4 = new Ocjene(80, 81, 83, 73, 83, 76, 71, 78);
		Igrac igrac4 = new Igrac("Santos", "Oscar", ocjeneIgrac4, 8);
		dodajIgraca(igrac4);
		Ocjene ocjeneIgrac5 = new Ocjene(77, 87, 81, 71, 82, 72, 71, 76);
		Igrac igrac5 = new Igrac("Cesc", "Fabregas", ocjeneIgrac5, 4);
		dodajIgraca(igrac5);
		Ocjene ocjeneIgrac6 = new Ocjene(69, 72, 68, 88, 83, 67, 83, 86);
		Igrac igrac6 = new Igrac("Nemanja", "Matić", ocjeneIgrac6, 21);
		dodajIgraca(igrac6);
		Ocjene ocjeneIgrac7 = new Ocjene(77, 75, 71, 68, 75, 66, 77, 77);
		Igrac igrac7 = new Igrac("Filipe", "Luis", ocjeneIgrac7, 27);
		dodajIgraca(igrac7);
		Ocjene ocjeneIgrac8 = new Ocjene(75, 73, 72, 85, 75, 67, 85, 77);
		Igrac igrac8 = new Igrac("Branislav", "Ivanović", ocjeneIgrac8, 2);
		dodajIgraca(igrac8);
		Ocjene ocjeneIgrac9 = new Ocjene(71, 68, 62, 87, 70, 65, 85, 76);
		Igrac igrac9 = new Igrac("John", "Terry", ocjeneIgrac9, 26);
		dodajIgraca(igrac9);
		Ocjene ocjeneIgrac10 = new Ocjene(68, 72, 57, 81, 73, 50, 79, 75);
		Igrac igrac10 = new Igrac("Gary", "Cahill", ocjeneIgrac10, 24);
		dodajIgraca(igrac10);
		Ocjene ocjeneIgrac11 = new Ocjene(75, 71, 53, 74, 51, 52, 76, 64);
		Igrac igrac11 = new Igrac("Petr", "Cech", ocjeneIgrac11, 1);
		dodajIgraca(igrac11);
				
		//Osoblje kluba
		Osoba predsjednik = new Osoba("Roman", "Abramovic", "abram@hotmail.com", "predsjednik");
		Osoba trener = new Osoba("Jose", "Mourinho", "thespecialone@hotmail.com", "trener");
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
