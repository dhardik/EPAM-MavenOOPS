package com.hardikmishra.chocolates;

import java.util.Comparator;
import com.hardikmishra.chocolates.Chocolate;

public class SortChocolatePrice implements Comparator<Chocolate>
{
	public int compare(Chocolate a,Chocolate b)
	{
		if(a.getPrice() - b.getPrice()>0)
		{
			return 1;
		}
		else if(a.getPrice() - b.getPrice()<0)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
