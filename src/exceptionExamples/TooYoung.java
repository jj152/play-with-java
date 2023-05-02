package exceptionExamples;

@SuppressWarnings("serial")
public class TooYoung extends RuntimeException {
	TooYoung(String msg){
		super(msg);
	}
}
