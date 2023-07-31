import java.io.FileNotFoundException;

public class Exam extends Exception {
	private final int eCode;

	public Exam(int eCode, Throwable cause) {
		super(cause);
		this.eCode = eCode;
	}

	public Exam(int eCode, String msg, Throwable cause) {
		super(msg, cause);
		this.eCode = eCode;
	}

	public String getMessage() {
		return this.eCode + ":" + super.getMessage() + "-" + this.getCause().getMessage();
	}

	public static void main(String[] args) {
	}
}

class ExSub extends Exam {
	ExSub(int eCode, String msg, Throwable cause) {
		super(eCode, msg, cause);
	}
}
