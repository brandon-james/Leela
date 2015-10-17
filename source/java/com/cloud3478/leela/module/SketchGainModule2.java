package java.com.cloud3478.leela.module;

public class SketchGainModule2 {

	public SketchGainModule2() {
	}

	int frameSize = 128;


	public double[][] process(final double[][] input, final double[][] output) {
		
		double[] level = input[0];
		
		int numInputChannels = input.length - 1;
		int numOutputChannels = output.length;
		
		int numChannels = Math.min(numInputChannels, numOutputChannels);
		
		for (int channel = 0; channel < numChannels; channel++) {
			for (int sample = 0; sample < frameSize; sample++) {
				output[channel][sample] = input[channel+1][sample] * level[sample];
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
