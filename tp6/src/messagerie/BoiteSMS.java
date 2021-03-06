/* ______________________________ */
/**
 * 
 */
package messagerie;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qfdk Cree le 2015年1月13日
 */
public class BoiteSMS
{
	private List<MessageSMS> listmeSms;

	/**
	 * 
	 */
	public BoiteSMS()
	{
		listmeSms = new ArrayList<MessageSMS>();
	}

	/**
	 * @param list
	 */
	public BoiteSMS(List<MessageSMS> list)
	{
		listmeSms = list;
	}

	/**
	 * Pour obtenir la valeur de listmeSms
	 * 
	 * @return la valeur de listmeSms
	 */
	public List<MessageSMS> getListmeSms()
	{
		return listmeSms;
	}

	/**
	 * Pour modifier la valeur de listmeSms
	 * 
	 * @param listmeSms la nouvelle valeur de listmeSms
	 */
	public void setListmeSms(List<MessageSMS> listmeSms)
	{
		this.listmeSms = listmeSms;
	}

	/**
	 * ajouter d'un message
	 * @param sms un message
	 */
	public void ajouterSMS(MessageSMS sms)
	{
		listmeSms.add(sms);
	}

	/**
	 * supprimer tous sms
	 */
	public void supprimerSMS()
	{
		listmeSms.clear();
	}

	/**
	 * affichier tous les messages
	 */
	public void lireSMS()
	{
		for (MessageSMS m : listmeSms)
		{
			System.out.println(m);
		}

	}
}

/* ______________________________ */
/* ___________FIN_______________ */
/* ______________________________ */