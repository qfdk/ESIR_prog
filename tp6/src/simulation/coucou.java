/*______________________________*/
/**
 * 
 */
package simulation;

import java.util.ArrayList;
import java.util.Date;

import messagerie.AbonneOperateur;
import messagerie.MessageSMS;
import messagerie.MessageVocal;
import messagerie.NumeroTelephone;
import messagerie.Operateur;

/**
 * @author qfdk
 * Cree le 2015年1月8日
 */
public class coucou
{

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException
	{

		//ArrayList <AbonneOperateur> listeAb= new ArrayList <AbonneOperateur> ();
        ArrayList <NumeroTelephone> listeNum=new ArrayList <NumeroTelephone> ();
        listeNum.add(new NumeroTelephone("123"));
        listeNum.add(new NumeroTelephone("345"));
        listeNum.add(new NumeroTelephone("3455"));
//        Operateur Vous= new Operateur("coucou",listeNum,listeAb);
        Operateur Vous= new Operateur("coucou");
		String[] noms =
		{ "Samuel", // +33(0)700000001
				"Sébastien", // 2
				"Aurélie", // 3
				"Léa", // 4
				"Pierre", // 5
				"Géraldine", // 6
				"Bastien", // 7
				"Claude", // 8
		};
        // add some subscribers to the list for the operator
        for (int i=0; i<2;i++){
                Vous.souscrire(noms[i], "Forfait1H");
        }// create 10 subscriber having the "A l'acte" package
        
        AbonneOperateur a=Vous.getListAbonnes().get(0);
        AbonneOperateur b=Vous.getListAbonnes().get(1);
    	System.out.println(a);
    	a.getTelephone().allumer();
    	b.getTelephone().allumer();
    	a.appeler(b.getNumeroTel().getNum(), "zzz", new Date(2015,1,16,20,3));
//    	Thread.sleep(3000);
    	a.cloreAppel(new Date(2015, 1, 16,22,0));
    	a.envoyerSMS(b.getNumeroTel().getNum(), "coucou", new Date());
    	System.out.println("----");
        Vous.facturation(a);
//        Vous.facturation(b);
        
        b.synchroniser();
    	System.out.println("----");
        for(MessageSMS s:b.getBoiteSMS().getListmeSms())
        {
        	System.out.println(s);
        }
    	System.out.println("----");
        for(MessageVocal s:b.getBoiteVocale().getListMessageVocals())
        {
        	System.out.println(s);
        }
	}

}

/*______________________________*/
/*___________FIN_______________*/
/*______________________________*/