public class Point2DTester
{
	public static void main(String[] args)
	{
		Point2D p1 = new Point2D(1,1);
		System.out.printf("point1: %s\n",p1);
		p1.moveBy(10.0, 20.0);
		System.out.printf("point1 using moveBy() method: %s\n",p1);
		
		Point2D p2 = new Point2D(4,3);
		System.out.printf("point2: %s\n",p2);
		p2.moveTo(2, 4);
		System.out.printf("point2 using moveTo() method: %s\n",p2);
		
		double distance = p1.distance(p2);
		System.out.printf("distance: %f\n",distance);
		
		

	}
}