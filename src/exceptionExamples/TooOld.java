package exceptionExamples;

@SuppressWarnings("serial")
public class TooOld extends RuntimeException {
	TooOld(String msg){
		super(msg);
	}
}
