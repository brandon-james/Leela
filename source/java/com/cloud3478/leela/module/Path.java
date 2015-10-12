package java.com.cloud3478.leela.module;

import java.com.cloud3478.leela.parameter.Parameter;
import java.com.cloud3478.type.value.Identity;
import java.com.cloud3478.type.value.ImList;

public class Path {
	ImList<Identity> ids;
	
	private Path() {
		
		ids = ImList.of();
	}

	public static Path of(Parameter p){
		return new Path();
	}

	public static Path of(Module m){
		return new Path();
	}
}
