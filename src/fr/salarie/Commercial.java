package fr.salarie;

public class Commercial extends Salarie {
	private int m_pcCommission;  //commission en % 
	private double m_dChiffreAffaire; // chiffre d'affaire

	protected Commercial() {
		super();
		// TODO Auto-generated constructor stub
	}
	protected Commercial(int m_pcCommission, double m_dChiffreAffaire) {
		super();
		this.m_pcCommission = m_pcCommission;
		this.m_dChiffreAffaire = m_dChiffreAffaire;
	}
	
	protected Commercial(int m_nMatricule, int m_nCategorie, int m_nService, String m_strNom, double m_dSalaire, int m_pcCommission, double m_dChiffreAffaire) {
		super(m_nMatricule, m_nCategorie, m_nService, m_strNom, m_dSalaire);
		this.m_pcCommission = m_pcCommission;
		this.m_dChiffreAffaire = m_dChiffreAffaire;
	}
	
	//controller
	public  boolean isValid() {
		this.count = this.myCount(count);
		System.out.println("Création n°: " + count);
		try{
		    if (this.getM_dSalaire() < 0)
		        throw new Exception();
		}
		catch (Exception exception)
		{
		    System.out.println("Salaire doit Être > 0");        
		    return false;
		   
		}
		try{
		    if (this.getM_nCategorie() != 4 )
		        throw new Exception();
		   
		}
		catch (Exception exception)
		{
		    System.out.println("Categorie d'employé inconnue"); 
		    return false;
		 
		}
		
	this.setM_nMatricule(this.getM_nMatricule());
	this.setM_nCategorie(this.getM_nCategorie());
	this.setM_nService(this.getM_nService());
	this.setM_strNom(this.getM_strNom());
this.setM_dSalaire(this.getM_dSalaire());
		double salaire = this.calculSalaire();
		this.show(salaire);
		return true;
	}

	public double calculSalaire() {
		double new_brut =  this.getM_dSalaire() + (this.getM_dChiffreAffaire() * this.getM_pcCommission()/ 100 );
		double	ret = new_brut - (new_brut * 20 /100); //retenue
		return ret;
	}

	protected int getM_pcCommission() {
		return m_pcCommission;
	}

	protected void setM_pcCommission(int m_pcCommission) {
		this.m_pcCommission = m_pcCommission;
	}

protected double getM_dChiffreAffaire() {
		return m_dChiffreAffaire;
	}

	protected void setM_dChiffreAffaire(double m_dChiffreAffaire) {
		this.m_dChiffreAffaire = m_dChiffreAffaire;
	}

}
