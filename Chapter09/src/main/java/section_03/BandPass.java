package section_03;

/**
 * @Author ZhangGJ
 * @Date 2019/04/17
 */
class Waveform {
		private static long counter;
		private final long id = counter++;
		public String toString() { return "Waveform " + id; }
} ///:~
//: interfaces/filters/Filter.java
class Filter {
		public String name() {
				return getClass().getSimpleName();
		}
		public Waveform process(Waveform input) { return input; }
} ///:~
//: interfaces/filters/LowPass.java
class LowPass extends Filter {
		double cutoff;
		public LowPass(double cutoff) { this.cutoff = cutoff; }
		public Waveform process(Waveform input) {
				return input; // Dummy processing
		}
} ///:~
//: interfaces/filters/HighPass.java
class HighPass extends Filter {
		double cutoff;
		public HighPass(double cutoff) { this.cutoff = cutoff; }
		public Waveform process(Waveform input) { return input; }
} ///:~
//: interfaces/filters/BandPass.java
public class BandPass extends Filter {
		double lowCutoff, highCutoff;
		public BandPass(double lowCut, double highCut) {
				lowCutoff = lowCut;
				highCutoff = highCut;
		}
		public Waveform process(Waveform input) { return input; }
}
