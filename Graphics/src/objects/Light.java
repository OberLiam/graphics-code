package objects;

/**
 * @author Liam
 * A class for lights.
 * How do lights work?
 * How do colors even work?
 */
public class Light {
	public Vector3 position;
	public double luminosity;
//	public Vector3 lightIntensity; // a colorVector, but may be unbounded
	
	public Light(Vector3 position, double luminosity) {
		this.position = position;
		this.luminosity = luminosity;
	}
	
//	public Light(Vector3 position, Vector3 lightIntensity) {
//		this.position = position;
//		this.lightIntensity = lightIntensity;
//	}
}
