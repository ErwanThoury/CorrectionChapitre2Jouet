package sio.testjouet;

public class jouet {
    private String nom;
    public double prix;
    private int categorie;
    private String matiere;


    public jouet(String nom, double prix, int categorie , String matiere) {
        this.nom = nom;
        this.prix = prix;
        this.categorie = categorie;
        this.matiere = matiere;
    }

    public void afficher()
    {
        System.out.println("Le nom de votre jouet est  : " + this.nom);
        System.out.println("Le prix de votre jouet est de  : " + this.prix);
        System.out.println("La categorie de votre jouet est : " + this.categorie);
        System.out.println("La matiere de votre jouet est : " + this.matiere);
    }

    public void multiplier(double pourcentage)
    {
        this.prix = prix * ( 1 + pourcentage / 100);
    }

    public static void intervertirCategories(jouet jouet1, jouet jouet2) {
        int tempCategorie = jouet1.getCategorie();
        jouet1.setCategorie(jouet2.getCategorie());
        jouet2.setCategorie(tempCategorie);
    }

    public int getCategorie() {
        return this.categorie;
    }

    public void setCategorie(int categorie) {
        this.categorie = categorie;
    }
}
