
import java.util.List;

public class AccountManager {
	public static double computeAccountBalanceSum(List<Employee> emps) {
		//implement
		double totalBalance = 0.0;
		for(Employee e : emps){
		 for(Account account : e.getAccounts()){
			 totalBalance = totalBalance + account.getBalance();
		 }
		}
		return totalBalance;
	}
}
