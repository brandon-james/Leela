package java.com.cloud3478.leela.module;

import java.com.cloud3478.leela.parameter.Parameter;
import java.com.cloud3478.type.value.Identity;
import java.util.Set;

public interface Module {

	Module parent();

	Identity identity();

	Path path();

	Set<Parameter> parameters();

	Parameter parameter(String identity);

	double[][] audioCallback(double[][] input, double[][] output);
}
