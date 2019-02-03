package Task4;
/**
 * Class Depositor
 * Implements Depositor thread class.
 *
 * @author Malek Barhoush, mbarhoush@hotmail.com;
 * 
 *
 * $Revision: 1.0 $
 * $Last Revision Date: 2019/01/06
 */

public class Depositor extends Thread {
	private Account account ;
	public Depositor(Account account){
		this.account = account;
	}
	
	public void run(){
			for (int i=0;i<10000000;i++)
			{
				synchronized(this.account){
					account.deposit(10);
				}
			}	
		
	}

}
