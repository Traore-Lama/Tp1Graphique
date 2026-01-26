package graphique.tp1graphique.model;

public class Contact
{
    // Ici on defini les infos de chaque contact
    private String nom;
    private String prenom;
    private int age;

    public Contact(String nom, int age, String prenom)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    // Tous les get ==> permet de recuperer et set ==> definir ou modifier une valeur

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }


    public String getPrenom()
    {
        return prenom;
    }

    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }


    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

}
