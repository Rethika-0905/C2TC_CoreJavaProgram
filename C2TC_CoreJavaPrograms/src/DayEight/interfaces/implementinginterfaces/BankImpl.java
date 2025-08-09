package DayEight.interfaces.implementinginterfaces;

public class BankImpl implements Bank{
	 @Override
	 public void deposite(Account account, double amount) {
		 if (amount > DEPOSITE_LIMIT)
				System.err.println("Deposit not possible.. exceeds Deposit Limit");
			else
				account.setBalance(account.getBalance()+amount);
	     System.out.println("Deposited " + amount + " into account: " + account.getAccNo());
	 }

	 @Override
	 public void withdraw(Account account, double amount) {
		 if (account.getBalance() - amount >= MIN_BALANCE)
		 {
				account.setBalance(account.getBalance()-amount);
				System.out.println("Withdrawn " + amount + " from account: " + account.getAccNo());
		 }
		 else
			 System.out.println("Insufficient balance in account: " + account.getAccNo());
	 }
}
