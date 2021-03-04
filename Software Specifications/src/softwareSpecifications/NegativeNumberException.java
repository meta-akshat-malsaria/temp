package softwareSpecifications;


public class NegativeNumberException extends Exception{
	
	public NegativeNumberException(){
		super("Dimension can never be negative or zero.");
	}

	
}
