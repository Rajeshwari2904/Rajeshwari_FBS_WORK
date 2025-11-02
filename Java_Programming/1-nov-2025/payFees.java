package p1;

public interface payFees {
	
	public void payOnline();
	public default void payOffline() {
	}
	
}
