/*______________________________*/
/**
 * 
 */
package forfait;

/**
 * @author qfdk
 * Cree le 2015年1月6日
 */
public abstract class AbsForfait
{
	protected String nom;

	/**
	 * @param nom
	 */
	protected AbsForfait(String nom)
	{
		setNom(nom);
	}
	
	/**
	 * Pour obtenir  la valeur de nom
	 * @return la valeur de nom
	 */
	public String getNom()
	{
		return nom;
	}

	/**
	 * Pour modifier la valeur de nom
	 * @param nom la nouvelle valeur de nom
	 */
	protected void setNom(String nom)
	{
		this.nom = nom;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		StringBuilder sb=new StringBuilder();
		sb.append("Le forfait: ").append(getNom());
		return sb.toString();
	}

}

/*______________________________*/
/*___________FIN_______________*/
/*______________________________*/