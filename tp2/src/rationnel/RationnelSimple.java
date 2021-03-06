/*______________________________*/
/**
 * 
 */
package rationnel;

import types.Rationnel;

/**
 * @author qfdk Cree le 2014年10月21日
 */
public class RationnelSimple implements Rationnel
{

	private int num;
	private int deno;

	/**
	 * initialiser un rationnel à partir d'un entier : nb/1
	 * @param num : valeur du numérateur
	 */
	public RationnelSimple(int num)
	{
		this.num = num;
		this.deno = 1;
	}

	/**
	 * initialiser un rationnel avec numerateur et dénominateur
	 * @param num : valeur du numérateur
	 * @param den : valeur du dénominateur
	 *  den != 0
	 *  fraction irréductible et dénominateur > 0
	 */
	public RationnelSimple(int num, int den)
	{
		assert den!=0:"le den ne peut pas etre 0";
        int g =getPGCD(num, den);
        this.num = num   / g;
        this.deno = den / g;
        if (den < 0) { this.deno = -den/g; this.num = -num/g; }	
     
	}

	/**
	 * initialiser un rationnel à partir d'un autre
	 * @param r : rationnel à dupliquer
	 */
	public RationnelSimple(Rationnel r)
	{
		this(r.getNumerateur(),r.getDenominateur());
	}

	/**
	 * comparer (égalité) deux rationnels
	 * @param r : rationnel à comparer au rationnel courant
	 * @return vrai si le rationnel courant est égal au rationnel paramètre
	 */
	public boolean equals(Rationnel r)
	{
		return ((this.num == r.getNumerateur())&& (this.deno == r
				.getDenominateur()));
	}
	
	private int getPGCD(int a, int b)
	{
        if (a < 0) a = -a;
        if (b < 0) b = -b;
        if (0 == b) return a;
        else return getPGCD(b, a % b);
	}
	
	/**
	 * additionner deux rationnels
	 * @param r : rationnel à additionner avec le rationnel courant
	 * @return nouveau Rationnel somme du rationnel courant et du rationnel
	 * paramètre
	 */
	@Override
	public Rationnel somme(Rationnel r)
	{
		return new RationnelSimple(this.num*r.getDenominateur()+this.deno*r.getNumerateur(),this.deno*r.getDenominateur());
	}

	/**
	 * inverser le rationnel courant
	 * @return nouveau Rationnel inverse du rationnel courant
	 *  numérateur != 0
	 */
	@Override
	public Rationnel inverse() 
	{
		assert this.num!=0:"inpossible";
		return new RationnelSimple(deno, num);
	}

	/**
	 * calculer la valeur réelle du rationnel courant
	 * @return valeur réelle du rationnel courant
	 */
	@Override
	public double valeur()
	{
		return this.num*1.00/this.deno;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see types.Rationnel#getNumerateur()
	 */
	@Override
	public int getNumerateur()
	{
		return this.num;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see types.Rationnel#getDenominateur()
	 */
	@Override
	public int getDenominateur()
	{
		return this.deno;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see types.Rationnel#compareTo(types.Rationnel)
	 */
	@Override
	public int compareTo(Rationnel autre)
	{
//		return (int) (this.valeur()-autre.valeur());
		if(this.valeur()-autre.valeur()==0)
		{
			return 0;
		}
		if(this.valeur()-autre.valeur()>0)
		{
			return 1;
		}else{
			return -1;
		}
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		StringBuilder sb=new StringBuilder();
		if(this.num==0)
		{
			sb.append("0");
		}
		else if(deno==1)
		{
			sb.append(this.num);
		}else
		{
			sb.append(this.num+"/"+this.deno);
		}
		return sb.toString();
	}
	
}

/* ______________________________ */
/* ___________FIN_______________ */
/* ______________________________ */