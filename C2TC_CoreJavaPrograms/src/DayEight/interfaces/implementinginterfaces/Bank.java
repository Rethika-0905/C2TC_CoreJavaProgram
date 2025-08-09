package DayEight.interfaces.implementinginterfaces;

public interface Bank {
	double MIN_BALANCE = 1000;
	double DEPOSITE_LIMIT = 25000;
	double INTEREST_RATE = 7.8;
	
	void deposite(Account account, double amount);
	void withdraw(Account account, double amount);
}


