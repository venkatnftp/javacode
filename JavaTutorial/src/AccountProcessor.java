public class AccountProcessor {

	public static void main(String[] args) {
		try {
			deductAmount(10);
			deductAmount(15);
			deductAmount(100);
		} catch (InsufficientBalanceException e) {
			System.err.println("Cannot process transaction, Insufficent funds detected");
			e.printStackTrace();
		} finally {
			
		}

	}

	private static void deductAmount(int amt) throws InsufficientBalanceException {
		int balance = 30;
		if (amt > balance)
			throw new InsufficientBalanceException(balance, amt);
	}

}
