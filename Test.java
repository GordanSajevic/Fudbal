
public class Test {

	public static Tim Juventus(Tim juventus)
	{
		// igrači
		Ocjene ocjeneTevez = new Ocjene(85, 78, 88, 65, 79, 75);
		Igrac tevez = new Igrac("Carlos", "Tevez", ocjeneTevez, 10);
		juventus.dodajIgraca(tevez);
		Ocjene ocjeneLlorente = new Ocjene(70, 75, 75, 90, 77, 85);
		Igrac llorente = new Igrac("Fernando", "Llorente", ocjeneLlorente, 14);
		juventus.dodajIgraca(llorente);
		Ocjene ocjenePogba = new Ocjene(78, 85, 83, 80, 90, 75);
		Igrac pogba = new Igrac("Paul", "Pogba", ocjenePogba, 6);
		juventus.dodajIgraca(pogba);
		Ocjene ocjeneVidal = new Ocjene(80, 82, 77, 76, 83, 85);
		Igrac vidal = new Igrac("Arturo", "Vidal", ocjeneVidal, 23);
		juventus.dodajIgraca(vidal);
		Ocjene ocjeneMarchisio = new Ocjene(77, 88, 80, 71, 79, 75);
		Igrac marchisio = new Igrac("Claudio", "Marchisio", ocjeneMarchisio, 8);
		juventus.dodajIgraca(marchisio);
		Ocjene ocjenePirlo = new Ocjene(71, 95, 84, 65, 89, 70);
		Igrac pirlo = new Igrac("Andrea", "Pirlo", ocjenePirlo, 21);
		juventus.dodajIgraca(pirlo);
		Ocjene ocjeneAsamoah = new Ocjene(77, 82, 85, 73, 79, 72);
		Igrac asamoah = new Igrac("Kwadwo", "Asamoah", ocjeneAsamoah, 22);
		juventus.dodajIgraca(asamoah);
		Ocjene ocjeneLichtsteiner = new Ocjene(80, 75, 71, 77, 71, 75);
		Igrac lichtsteiner = new Igrac("Stephan", "Lichtsteiner", ocjeneLichtsteiner, 26);
		juventus.dodajIgraca(lichtsteiner);
		Ocjene ocjeneChiellini = new Ocjene(65, 72, 62, 88, 70, 58);
		Igrac chiellini = new Igrac("Giorgio", "Chiellini", ocjeneChiellini, 3);
		juventus.dodajIgraca(chiellini);
		Ocjene ocjeneBonucci = new Ocjene(72, 76, 67, 82, 70, 52);
		Igrac bonucci = new Igrac("Leonardo", "Bonucci", ocjeneBonucci, 19);
		juventus.dodajIgraca(bonucci);
		Ocjene ocjeneBuffon = new Ocjene(75, 72, 55, 81, 52, 40);
		Igrac buffon = new Igrac("Gianluigi", "Buffon", ocjeneBuffon, 1);
		juventus.dodajIgraca(buffon);
		
		//Osoblje kluba
		Osoba agnelli = new Osoba("Andrea", "Agnelli", "aagnelli@hotmail.com", "predsjednik");
		Osoba allegri = new Osoba("Massimilliano", "Allegri", "aallegri@hotmail.com", "trener");
		Osoba francesco = new Osoba("Francesco", "Domizzi", "domizzi@hotmail.com", "fizioterapeut");
		Osoba marotta = new Osoba("Giuseppe", "Marotta", "marotta@hotmail.com", "menadžer");
		Osoba luigi = new Osoba("Luigi", "Biglia", "biglia@hotmail.com", "doktor");
		Osoba capricosa = new Osoba("Pizza", "Capricosa", "capricosa@hotmail.com", "psiholog");
		juventus.dodajOsobu(agnelli);
		juventus.dodajOsobu(allegri);
		juventus.dodajOsobu(francesco);
		juventus.dodajOsobu(marotta);
		juventus.dodajOsobu(luigi);
		juventus.dodajOsobu(capricosa);
		return juventus;
	}
	
	public static void main(String[] args) {
		Tim juventus = new Tim("Juventus", "Torino");
		juventus = Juventus(juventus);
		System.out.println(juventus.toString());
		
	}

}
