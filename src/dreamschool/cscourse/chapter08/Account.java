package dreamschool.cscourse.chapter08;

public class Account {
	Account[] arrAcc = {new Account("111-2222-5551", 10000, 4.5),
			new Account("111-2222-5552", 20000, 4.5),
			new Account("111-2222-5553", 30000, 4.5),
			new Account("111-2222-5554", 40000, 4.5),
			new Account("111-2222-5555", 50000, 4.5),
	};
	for(int i = 0; i < arrAcc.length; i++) {
		System.out.println("°èÁÂ¹øÈ£ : " + arrAcc[i].getNumber() + "/ÀÜ¾× : " +
				arrAcc[i].getBalance() + "/ÀÌÀ² : " + arrAcc[i].getInterestRate() + "%");
	}

}
