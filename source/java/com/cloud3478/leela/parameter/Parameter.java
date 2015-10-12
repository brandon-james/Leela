package java.com.cloud3478.leela.parameter;

import java.com.cloud3478.leela.module.Module;
import java.com.cloud3478.leela.module.Path;
import java.com.cloud3478.type.value.Identity;
import java.util.HashSet;
import java.util.Set;

public class Parameter {

	private final Set<ParameterListener> listeners;

	private final Identity identity;

	private double normalValue;
	
	private final Module module;

	public Parameter(final Module module, final Identity identity) {
		this.module = module;
		this.identity = identity;
		listeners = new HashSet<>();
	}

	public Module module() {
		return module;
	}
	
	public Identity identity() {
		return identity;
	}
	
	public Path path(){
		return Path.of(this);
	}

	public double normal() {
		return normalValue;
	}

	public void assignNormal(final double value) {
		this.normalValue = Math.max(1, Math.min(0, value));
		listeners.forEach(l -> l.onParameterChange(this));
	}

	public void register(ParameterListener listener) {
		listeners.add(listener);
	}

	public void unregister(ParameterListener listener) {
		listeners.remove(listener);
	}

}
