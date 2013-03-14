public class TestRectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point point1, point2, point3;
		RectanglePlus rect1, rect2, rect3;

		point1 = new Point(1, 2);
		point2 = new Point(3, 4);
		point3 = new Point(2, 1);

		rect1 = new RectanglePlus(point1, 2, 4);
		rect2 = new RectanglePlus(point2, 3, 9);
		rect3 = new RectanglePlus(point3, 4, 2);

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

		if (rect1.isEqualTo(rect3)) {
			System.out.println("Rectangle 1 is equal in size to Rectangle 3!");
		}
		else {
			System.out.println("The two rectangles are not equal in area!");
		}

	}

}
