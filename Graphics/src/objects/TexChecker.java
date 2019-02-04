package objects;

public class TexChecker implements ITexture{
	
	Vector3 color1, color2;
	
	public TexChecker(Vector3 color1, Vector3 color2) {
		this.color1 = color1;
		this.color2 = color2;
		/**How does it work, if you create an (anonymous) class here that refers to e.g. x1, x2
		 * and at a later time (after the constructor ends) you refer to that anonymous class?
		 */
	}

	@Override
	public Vector3 getColor(Vector2 UVPoint) {
		return (gilt(UVPoint.x) + gilt(UVPoint.y)) % 2 == 0 ? color1 : color2;
	}
	
	public static int gilt(double x) {
		return (int)Math.floor(x);
	}
}
