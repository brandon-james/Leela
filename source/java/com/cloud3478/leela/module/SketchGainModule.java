package java.com.cloud3478.leela.module;

public class SketchGainModule {

	public SketchGainModule() {
	}

	int frameSize = 128;

	double[] level = new double[frameSize];

	public double[][] process(final double[][] input, final double[][] output) {
		
		int numInputChannels = input.length;
		int numOutputChannels = output.length;
		
		int numChannels = Math.min(numInputChannels, numOutputChannels);
		
		for (int channel = 0; channel < numChannels; channel++) {
			for (int sample = 0; sample < frameSize; sample++) {
				output[channel][sample] = input[channel][sample] * level[sample];
			}
		}
		if (numOutputChannels > numChannels) {
			for (int channel = numChannels; channel < numOutputChannels; channel++) {
				for (int sample = 0; sample < frameSize; sample++) {
					output[channel][sample] = 0;
				}
			}
		}
		return output;
	}

}
