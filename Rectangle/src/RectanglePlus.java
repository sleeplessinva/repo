public class RectanglePlus extends Rectangle 
    implements RelatablePlus {
    public int width = 0;
    public int height = 0;
    public Point origin;

    // four constructors
    public RectanglePlus() {
        origin = new Point(0, 0);
        width = 0;
        height = 0;
    }
    public RectanglePlus(Point p) {
        origin = p;
        width = 0;
        height = 0;
    }
    public RectanglePlus(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }
    public RectanglePlus(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }

    // a method for moving the origin of rectangle
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    // a method for computing
    // the area of the rectangle
    public int getArea() {
        return width * height;
    }
    
    // a method required to implement
    // the Relatable interface
    public boolean isLargerThan(Relatable other) {
        RectanglePlus otherRect = (RectanglePlus)other;
        
        if (this.getArea() < otherRect.getArea()) {
            return false;
        }
        else
        	return true;
    }
    
    public boolean isEqualTo(Relatable other) {
        RectanglePlus otherRect = (RectanglePlus)other;
        if (this.getArea() == otherRect.getArea()) {
        	return true;
        }
        else return false;    	
    }
    
     
    public RectanglePlus findLarger(RectanglePlus object1, RectanglePlus object2) {
    	   Relatable obj1 = (Relatable)object1;
    	   Relatable obj2 = (Relatable)object2;
    	   if ((obj1).isLargerThan(obj2))
    	      return object1;
    	   else 
    	      return object2;
    	}
    
    public RectanglePlus findSmaller(RectanglePlus object1, RectanglePlus object2) {
 	   Relatable obj1 = (Relatable)object1;
 	   Relatable obj2 = (Relatable)object2;
 	   if (!(obj1).isLargerThan(obj2))
 	      return object1;
 	   else 
 	      return object2;
 	}
 	
}