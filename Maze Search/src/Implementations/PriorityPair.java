package Implementations;

import Interfaces.Pair;

/*
 * Written by Bryce Summers on 6/6/2015.
 */

public class PriorityPair<Data> implements Pair<Integer, Data>, Comparable<PriorityPair<Data>>
{

	// -- Constructor.
	public PriorityPair(int priority, Data elem)
	{
		// Implement Me Please;
		// Create fields and store the two pieces of data in them.
	}

	public Integer getPriority()
	{
		// Implement Me Please;
		return null;		
	}
	
	public Data getData()
	{
		// Implement Me Please;
		return null;
	}
	
	@Override
	public Integer val1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Data val2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int compareTo(PriorityPair<Data> other)
	{
		// TODO Auto-generated method stub
		return 0;
	}
	
}
