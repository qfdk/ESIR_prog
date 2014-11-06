/*______________________________*/
/**
 * 
 */
package rationnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import types.Rationnel;

/**
 * @author qfdk
 * Cree le 2014年10月22日
 */
public class MainTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
//		System.out.println(clientRationnel.lireRationnel(new Scanner(System.in)));
		clientRationnel.affichage();
	}
//	..... ?
	public static void affichage()
	{
		Rationnel r=new RationnelSimple(0,1);
		StringBuilder sb=new StringBuilder();
		Rationnel tmp=null;
		List<Rationnel> list= new ArrayList<Rationnel>();
		list.add(r);
		tmp=clientRationnel.lireRationnel(new Scanner(System.in));	
		while(tmp!=null){
			list.add(tmp);
			tmp=clientRationnel.lireRationnel(new Scanner(System.in));
		}
			int i=1;
			while(i<list.size())
			{
				sb.append("courant = ").append(list.get(i)).append(" ; ")
				.append(list.get(i)).append(" + ").append(list.get(i-1)).append(" = ").append(list.get(i).somme(list.get(i-1))).append(" ; ")
				.append("inverse = ").append(list.get(i).inverse()).append(" ; ")
				.append(" valeur = ").append(list.get(i).valeur()).append(" ; ");
				String equal="?";
				if(list.get(i).compareTo(list.get(i-1))<0)
				{
					equal=" < ";
				}else if(list.get(i).compareTo(list.get(i-1))>0){
					equal=" > ";
				}else{
					equal=" = ";
				}
				sb.append(list.get(i)).append(equal).append(list.get(i-1)).append(" ; ");
				String meme=" ≠ ";
				if(list.get(i).equals(list.get(i-1)))
				{
					meme=" = ";
				}
				sb.append(list.get(i)).append(meme).append(list.get(i-1)).append(" ; \n");
				i++;
			}
			System.out.println(sb.toString());

	}

}

/*______________________________*/
/*___________FIN_______________*/
/*______________________________*/