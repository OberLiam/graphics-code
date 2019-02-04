package objects;

public class TexColor implements ITexture
{
	public Vector3 color;
	public TexColor(Vector3 color) {
		this.color = color;
	}
	
	@Override
	public Vector3 getColor(Vector2 UVPoint) {
		return color;
	}
}
