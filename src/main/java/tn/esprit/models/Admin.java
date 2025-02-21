package tn.esprit.models;

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> origin/jasser
public class Admin extends Utilisateur {

    public Admin() {
        super();
        this.setRole("ADMIN");
    }

    public Admin(int id_user, String nom, String prenom, String email, int cin, String motDePasse) {
        super(id_user, nom, prenom, email, cin, motDePasse, "ADMIN");
    }

    public Admin(String nom, String prenom, String email, int cin, String motDePasse) {
        super(nom, prenom, email, cin, motDePasse);
        this.setRole("ADMIN");
    }
<<<<<<< HEAD
}
=======
public class Admin {
    private int id_user;
    private String nom;
    private String prenom;
    private int age;

    public Admin() {}

    public Admin(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public int getid_user() {
        return id_user;
    }

    public void setid_user(int id_user) {
        this.id_user = id_user;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }


    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id_user=" + id_user +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                "}\n";
    }
}
>>>>>>> origin/may
=======
}
>>>>>>> origin/jasser
