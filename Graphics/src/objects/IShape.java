package objects;

public interface IShape {
	public static final IShape PLANE = new IShape() {
		public boolean getInPlane(Vector2 point) {
			return true;
		}
	};
	public static final IShape SQUARE = new IShape() {
		public boolean getInPlane(Vector2 point) {
			return point.x>=0 && point.x<=1 && point.y>=0 && point.y<=1;
		}
	};
	public static final IShape TRIANGLE = new IShape() {
		public boolean getInPlane(Vector2 point) {
			return point.x>=0 && point.y>=0 && (point.x+point.y)<=1;
		}
	};
	
	public boolean getInPlane(Vector2 point);
}
