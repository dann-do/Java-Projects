//Submitted by Dan Do 
//Problem 3: Logical Util

public class LogicalUtil
{
	public static boolean thereExists(boolean p, boolean q, boolean r)
	{
		/*static boolean: 
			thereExists(boolean p, boolean q, boolean r)
			Returns true if at least one condition is true */
			
		return (p || q || r);
		
	} //end boolean thereExists() method
	
	
	public static boolean forAll(boolean p, boolean q, boolean r)
	{
		/*static boolean: 
			forAll(boolean p, boolean q, boolean r)
			Returns true only if all conditions are true */
			
		return (p && q && r);
		
	} //end boolean forAll() method
	
	
	public static boolean majority(boolean p, boolean q, boolean r)
	{
		/*static boolean: 
			majority(boolean p, boolean q, boolean r)
			Returns true only if a majority of the conditions are true */
			
		return (p && q) || (q && r) || (p && r);
		
	} //end boolean majority() method
	
	
	public static boolean minority(boolean p, boolean q, boolean r)
	{
		/*static boolean: 
			minority(boolean p, boolean q, boolean r)
			Returns true only if a majority of conditions are false */
			
		return (!p && !q) || (!q && !r) || (!p && !r);
		
	} //end boolean minority() method
	
	
	public static boolean implies(boolean p, boolean q)
	{
		/*static boolean: 
			implies(boolean p, boolean q)
			Returns true unless p is true and q is false. This is: p implies q */
			
		return !(p && !q);
		
	} //end boolean implies() method
	
	
	public static boolean implies(boolean p, boolean q, boolean r)
	{
		/*static boolean: 
			implies(boolean p, boolean q)
			Returns true unless both p,q are true and r is false. This is: p implies q implies r */
			
		return !(p && q && !r);
		
	} //end boolean implies() method
	

} //end class