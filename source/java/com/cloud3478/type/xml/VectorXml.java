package java.com.cloud3478.type.xml;

import java.com.cloud3478.type.value.Vector;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "vector")
public class VectorXml {

	private double x, y;

	public VectorXml() {
		x = y = 0;
	}

	public VectorXml(Vector v) {
		x = v.x();
		y = v.y();
	}

	@XmlElement
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	@XmlElement
	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Vector asVector() {
		return Vector.of(x, y);
	}

}