public class Juventus extends Tim{
	
	//Unos podataka za klub
	
	public Juventus()
	{
			super("Juventus", "Torino");
			// igrači
			Ocjene ocjeneTevez = new Ocjene(85, 78, 88, 65, 79, 75, 70, 87);
			Igrac tevez = new Igrac("Carlos", "Tevez", ocjeneTevez, 10);
			dodajIgraca(tevez);
			Ocjene ocjeneLlorente = new Ocjene(70, 75, 75, 90, 77, 85, 57, 75);
			Igrac llorente = new Igrac("Fernando", "Llorente", ocjeneLlorente, 14);				
			dodajIgraca(llorente);
			Ocjene ocjenePogba = new Ocjene(78, 85, 83, 80, 90, 75, 86, 82);
			Igrac pogba = new Igrac("Paul", "Pogba", ocjenePogba, 6);
			dodajIgraca(pogba);
			Ocjene ocjeneVidal = new Ocjene(80, 82, 77, 76, 83, 85, 90, 90);
			Igrac vidal = new Igrac("Arturo", "Vidal", ocjeneVidal, 23);
			dodajIgraca(vidal);
			Ocjene ocjeneMarchisio = new Ocjene(77, 88, 80, 71, 79, 75, 78, 87);
			Igrac marchisio = new Igrac("Claudio", "Marchisio", ocjeneMarchisio, 8);
			dodajIgraca(marchisio);
			Ocjene ocjenePirlo = new Ocjene(71, 95, 84, 65, 89, 70, 70, 72);
			Igrac pirlo = new Igrac("Andrea", "Pirlo", ocjenePirlo, 21);
			dodajIgraca(pirlo);
			Ocjene ocjeneAsamoah = new Ocjene(77, 82, 85, 73, 79, 72, 77, 78);
			Igrac asamoah = new Igrac("Kwadwo", "Asamoah", ocjeneAsamoah, 22);
			dodajIgraca(asamoah);
			Ocjene ocjeneLichtsteiner = new Ocjene(80, 75, 71, 77, 71, 75, 79, 88);
			Igrac lichtsteiner = new Igrac("Stephan", "Lichtsteiner", ocjeneLichtsteiner, 26);
			dodajIgraca(lichtsteiner);
			Ocjene ocjeneChiellini = new Ocjene(65, 72, 62, 88, 70, 58, 92, 77);
			Igrac chiellini = new Igrac("Giorgio", "Chiellini", ocjeneChiellini, 3);
			dodajIgraca(chiellini);
			Ocjene ocjeneBonucci = new Ocjene(72, 76, 67, 82, 70, 52, 77, 75);
			Igrac bonucci = new Igrac("Leonardo", "Bonucci", ocjeneBonucci, 19);
			dodajIgraca(bonucci);
			Ocjene ocjeneBuffon = new Ocjene(75, 72, 55, 81, 52, 40, 70, 50);
			Igrac buffon = new Igrac("Gianluigi", "Buffon", ocjeneBuffon, 1);
			dodajIgraca(buffon);
				
			//Osoblje kluba
			Osoba agnelli = new Osoba("Andrea", "Agnelli", "aagnelli@hotmail.com", "predsjednik");
			Osoba allegri = new Osoba("Massimilliano", "Allegri", "aallegri@hotmail.com", "trener");
			Osoba francesco = new Osoba("Francesco", "Domizzi", "domizzi@hotmail.com", "fizioterapeut");
			Osoba marotta = new Osoba("Giuseppe", "Marotta", "marotta@hotmail.com", "menadžer");
			Osoba luigi = new Osoba("Luigi", "Biglia", "biglia@hotmail.com", "doktor");
			Osoba capricosa = new Osoba("Pizza", "Capricosa", "capricosa@hotmail.com", "psiholog");
			dodajOsobu(agnelli);
			dodajOsobu(allegri);
			dodajOsobu(francesco);
			dodajOsobu(marotta);
			dodajOsobu(luigi);
			dodajOsobu(capricosa);
	}
}
