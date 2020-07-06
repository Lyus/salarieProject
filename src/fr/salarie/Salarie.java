package fr.salarie;

public class Salarie{
private int m_nMatricule , m_nCategorie, m_nService;
private String m_strNom;
private Double m_dSalaire;
protected  static int count = 0;
//Construct
public Salarie() {
	
}
//Construct v2
protected Salarie(int m_nMatricule, int m_nCategorie, int m_nService, String m_strNom, double m_dSalaire) {
	super();
	this.m_nMatricule = m_nMatricule; //matricules 
	this.m_nCategorie = m_nCategorie; //	categorie
	this.m_nService = m_nService; //service
	this.m_strNom = m_strNom; //nom
	this.m_dSalaire = m_dSalaire; //	salaire

}
//Function affichage du salaire
public void show(double salaire) {
	
	System.out.println("Le salaire de " + this.getM_strNom() + " est de " + salaire +"€ net" );
}

//Calcul salaire salariÃ© lambda
public double calculSalaire() {
	double	ret = this.getM_dSalaire() * 20 /100; //retenue
	double n_sn = this.getM_dSalaire()- ret;
	return n_sn;
}

//compteur du nombre d'instance
public int myCount(int count) {
	count = count + 1;
	return count;
	
}
//controller 
public  boolean isValid() {
	count = myCount(count);
	System.out.println("Création n°: " + count);
	try{
	    if (m_nMatricule < 0)
	        throw new Exception();
	}
	catch (Exception exception)
	{
	    System.out.println("Salaire doit Être > 0");        
	    return false;
	   
	}
	try{
	    if (m_nCategorie < 1 || m_nCategorie > 3)
	        throw new Exception();
	}
	catch (Exception exception)
	{
	    System.out.println("Categorie d'employé inconnue"); 
	    return false;
	 
	}
	setM_nMatricule(this.getM_nMatricule());
	setM_nCategorie(this.getM_nCategorie());
	setM_nService(this.getM_nService());
	setM_strNom(this.getM_strNom());
	setM_dSalaire(this.getM_dSalaire()); //	salaire
	double salaire = calculSalaire();
	show(salaire);
	return true;
}

@Override
public String toString() {
	return "Salarie [m_nMatricule=" + m_nMatricule + ", m_nCategorie=" + m_nCategorie + ", m_nService=" + m_nService
			+ ", m_strNom=" + m_strNom + ", m_dSalaire=" + m_dSalaire + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + m_nMatricule;
	result = prime * result + ((m_strNom == null) ? 0 : m_strNom.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Salarie other = (Salarie) obj;
	if (m_nMatricule != other.m_nMatricule)
		return false;
	if (m_strNom == null) {
		if (other.m_strNom != null)
			return false;
	} else if (!m_strNom.equals(other.m_strNom))
		return false;
	return true;
}
//getter setters
public int getM_nMatricule() {
	return m_nMatricule;
}
protected void setM_nMatricule(int m_nMatricule) {
	this.m_nMatricule = m_nMatricule;
}
public int getM_nCategorie() {
	return m_nCategorie;
}
protected void setM_nCategorie(int m_nCategorie) {
	this.m_nCategorie = m_nCategorie;
}
public int getM_nService() {
	return m_nService;
}
protected void setM_nService(int m_nService) {
	this.m_nService = m_nService;
}
public String getM_strNom() {
	return m_strNom;
}
protected void setM_strNom(String m_strNom) {
	this.m_strNom = m_strNom;
}
public Double getM_dSalaire() {
	return m_dSalaire;
}
protected void setM_dSalaire(Double m_dSalaire) {
	this.m_dSalaire = m_dSalaire;
}



}
