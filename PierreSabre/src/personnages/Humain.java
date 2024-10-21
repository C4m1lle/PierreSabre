package personnages;

import java.lang.reflect.Constructor;

public class Humain {
	protected String nom;
	protected String boissonFav;
	protected int argent;
	
	
	public Humain(String nom, String boissonFav, int argent) {
		this.nom = nom;
		this.boissonFav = boissonFav;
		this.argent = argent;
	}
	private void parler(String texte) {
		System.out.println(nom+": " + texte);
	}
	
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	private void perdreArgent(int quantite){
		argent-=quantite;
	}
	private void gagnerArgent(int quantite){
		argent+=quantite;
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m’appelle "+ nom +" et j’aime boire du "+ boissonFav);
	}
	public void boire() {
		parler("Mmmm, un bon verre de"+ boissonFav + "! GLOUPS !");
	}
	public void acheter(String bien, int prix) {
		if (prix>argent) {
			parler("Je n'ai plus que "+40+" sous en poche. Je ne peux même pas m'offrir un "+bien+" à "+50+" sous.");
		}else {
			parler("J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir un "+bien+" à "+prix+" sous.");
			perdreArgent(prix);
		}
		
	}
	
}
