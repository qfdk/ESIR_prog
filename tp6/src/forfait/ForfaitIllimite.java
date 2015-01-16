/* ______________________________ */
/**
 * 
 */
package forfait;

/**
 * @author qfdk Cree le 2015年1月6日
 */
public class ForfaitIllimite extends AbsForfait
{

	public static final float PRIX_BASE=40;
	
	/**
	 * consturcteur
	 * @param nom ilimite
	 */
	protected ForfaitIllimite(String nom)
	{
		super(nom);
	}

	/**
	 * ForfaitIlimite
	 */
	public ForfaitIllimite()
	{
		this("ForfaitIllimite");
	}


	/* (non-Javadoc)
	 * @see forfait.AbsForfait#getPrixSMS()
	 */
	@Override
	public float getPrixSMS()
	{
		return 0;
	}

	/* (non-Javadoc)
	 * @see forfait.AbsForfait#getPrixAppel()
	 */
	@Override
	public float getPrixAppel()
	{
		return 0;
	}

	/* (non-Javadoc)
	 * @see forfait.AbsForfait#estHorsforfait()
	 */
	@Override
	public boolean estHorsforfait()
	{
		return false;
	}

}

/* ______________________________ */
/* ___________FIN_______________ */
/* ______________________________ */