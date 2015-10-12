package java.com.cloud3478.leela.parameter;

import java.com.cloud3478.leela.module.Module;
import java.com.cloud3478.type.value.Identity;
import java.com.cloud3478.type.value.ImList;

public class OptionParameter<T> extends Parameter {
	final ImList<T> options;

	public OptionParameter(final Module parent, final Identity identity, final ImList<T> options) {
		super(parent, identity);
		this.options = options;
	}

	public T value() {
		return options.element(index());
	}

	public void assign(final T value) {
		final int index = options.indexOf(value);
		if (index != -1) {
			assignNormal(indexToNormal(index));
		}
	}

	public int index() {
		return (int) (normal() * options.length());
	}
	
	public void assignIndex(final int index){
		assignNormal(indexToNormal(index));
	}

	private double indexToNormal(final int index) {
		return  index / (double) options.length();
	}

	

}
