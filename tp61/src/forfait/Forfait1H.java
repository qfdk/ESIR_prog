/* ______________________________ */
/**
 * 
 */
package forfait;

/**
 * @author qfdk Cree le 2015年1月6日
 */
public class Forfait1H extends AbsForfait
{

	/**
	 * @param nom
	 */
	private Forfait1H(String nom)
	{
		super(nom);
	}

	/**
	 * Forfait1H
	 */
	public Forfait1H()
	{
		this("Forfait1H");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see messagerie.AbsForfait#calculerPrix()
	 */
	@Override
	public float calculerPrix()
	{
		return 20;
	}

}

/* ______________________________ */
/* ___________FIN_______________ */
/* ______________________________ */