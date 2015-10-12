package java.com.cloud3478.leela.parameter;

import java.com.cloud3478.leela.module.Module;
import java.com.cloud3478.type.value.Identity;
import java.com.cloud3478.type.value.Vector;

public class NumberParameter extends Parameter {
	private final Vector bounds;

	public NumberParameter(final Module parent, final Identity identity, final Vector bounds) {
		super(parent, identity);
		this.bounds = bounds;
	}

	public double value() {
		return (normal() * bounds.range()) + bounds.x();
	}

	public void assign(final double value) {
		assignNormal((value - bounds.x()) / bounds.range());
	}

	public Vector bounds() {
		return bounds;
	}

}
