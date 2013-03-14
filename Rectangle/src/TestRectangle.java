
public class TestRectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point point1, point2;
		RectanglePlus rect1, rect2;
		
		point1 = new Point(1,2);
		point2 = new Point(3,4);
		
		rect1 = new RectanglePlus(point1, 2, 4);
		rect2 = new RectanglePlus(point2, 3, 9);
		
		if (rect2.isLargerThan(rect1)) {
			System.out.println("Rectangle 2 is larger than rectangle 1.");
			
		} else {
			System.out.println("Rectangle 2 is not larger than rectangle 1");
		}
		
		Rectangle x;
		// x = (Rectangle)rect2;
		
		// System.out.println(x.getArea());
		
		// System.out.println(rect2.isLargerThan(rect1));
		
		x = new RectanglePlus().findSmaller(rect1, rect2);
		System.out.println(x.getArea());
		x = new RectanglePlus().findLarger(rect1, rect2);
		System.out.println(x.getArea());
		
	}

}
