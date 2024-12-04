package in.raghab.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.raghab.entity.RecieverAccount;
import in.raghab.entity.SenderAccount;
import in.raghab.repository.RecieverRepo;
import in.raghab.repository.SenderRepo;

@Service
public class MoneyTransferService {
	@Autowired
	private SenderRepo sender;
	
	@Autowired
	private RecieverRepo reciever;
	
	public void saveSenderAcc(String name,Long phone,Double amount) {
		SenderAccount senderAcc = new SenderAccount();
		senderAcc.setAccountHolder(name);
		senderAcc.setPhoneNo(phone);
		senderAcc.setAmount(amount);
		
		sender.save(senderAcc);
	}
	public void saveRecieverAcc(String name,Long phone,Double amount) {
		RecieverAccount recieverAcc = new RecieverAccount();
		recieverAcc.setAccountHolder(name);
		recieverAcc.setPhoneNo(phone);
		recieverAcc.setAmount(amount);
		
		reciever.save(recieverAcc);
	}
	
	@Transactional(rollbackFor = Exception.class)
	public void transactionSenderReciever(Integer senderAccNo,Integer recieverAccNo,Double sendAmount) {
		Optional<SenderAccount> senderOptional = sender.findById(senderAccNo);
		Optional<RecieverAccount>  recieverOptional= reciever.findById(recieverAccNo);
		
		if(senderOptional.isEmpty()) {
			System.out.println("Sender Account does not exist!!!");
			return;
		}if(recieverOptional.isEmpty()) {
			System.out.println("Reciever Account does not exist!!!");
			return;
		}else {
			SenderAccount senderAccount = senderOptional.get();
			RecieverAccount recieverAccount = recieverOptional.get();
			
			Double senderPresentAmount = senderAccount.getAmount();
			Double recieverPresentAmount = recieverAccount.getAmount();
			
			if(senderPresentAmount >= sendAmount) {
				senderAccount.setAmount(senderPresentAmount - sendAmount);
				sender.save(senderAccount);//1st Update Query
				
				
				recieverAccount.setAmount(recieverPresentAmount + sendAmount);
				reciever.save(recieverAccount);//2nd Update Query
			}else {
				System.out.println("Sufficient Balance is not present in your Acc!!!");
				return;
			}
		}
	}
	
}
