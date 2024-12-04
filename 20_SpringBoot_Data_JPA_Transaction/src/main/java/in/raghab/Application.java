package in.raghab;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.raghab.service.MoneyTransferService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);

		MoneyTransferService transferService = ctxt.getBean(MoneyTransferService.class);
		
		Scanner sc=null;
		try {
			sc = new Scanner(System.in);

//			// Sender
//			System.out.println("\n\nEnter Sender Account Details...");
//			System.out.print("Sender_Holder_Name: ");
//			String sender = sc.nextLine();
//			System.out.print("Sender_PhoneNO: ");
//			Long senderPhone = sc.nextLong();
//			System.out.print("Sender_Principal_Amount: ");
//			Double senderPA = sc.nextDouble();
//
//			sc.nextLine();
//			// Receiver
//			System.out.println("\nEnter Receiver Account Details...");
//			System.out.print("Receiver_Holder_Name: ");
//			String receiver = sc.nextLine();
//			System.out.print("Sender_PhoneNO: ");
//			Long receiverPhone = sc.nextLong();
//			System.out.print("Sender_Principal_Amount: ");
//			Double receiverPA = sc.nextDouble();
//
//			transferService.saveRecieverAcc(receiver, receiverPhone, receiverPA);
//			transferService.saveSenderAcc(sender, senderPhone, senderPA);

			System.out.print("Enter Sender Acc.NO: ");
			Integer senderAccNo = sc.nextInt();
			System.out.print("Enter Receiver Acc.NO: ");
			Integer receiverAccNo = sc.nextInt();
			System.out.print("Enter Sending Amount to Receiver: ");
			Double amount = sc.nextDouble();
			
			transferService.transactionSenderReciever(senderAccNo, receiverAccNo, amount);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sc != null) {
				sc.close();
			}
		}
	}

}
