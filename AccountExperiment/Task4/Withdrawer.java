package Task4;
/**
 * Class Withdrawer
 * Implements Withdrawer thread class.
 *
 * @author Malek Barhoush, mbarhoush@hotmail.com;
 * 
 *
 * $Revision: 1.0 $
 * $Last Revision Date: 2019/01/06
 */

public class Withdrawer extends Thread {
	private Account account ;
	public Withdrawer(Account account){
		this.account = account;
	}
	
	public void run(){
	
		// Withdraw 10 CAD into instance variable account
		
			for (int i=0;i<10000000;i++)
			{
				account.withdraw(10);
			}		
	}

}
