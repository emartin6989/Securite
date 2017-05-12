package metier;

public class Client {
	private int id;
	private String nom;
	private String prenom;
	private String couleuryeux;
	private int age;
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getCouleuryeux() {
		return couleuryeux;
	}

	public void setCouleuryeux(String couleuryeux) {
		this.couleuryeux = couleuryeux;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", couleuryeux=" + couleuryeux + ", age="
				+ age + "]";
	}

}
