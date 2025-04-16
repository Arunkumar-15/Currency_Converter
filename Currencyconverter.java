import java.util.HashMap;
import java.util.*;
public class Currencyconverter{
	public static void main(String [] args)
	{
		HashMap<Integer,String> CurrencyCodes = new HashMap<>();
		
		CurrencyCodes.put(1,"USD");
		CurrencyCodes.put(2,"CAD");
		CurrencyCodes.put(3,"EUR");
		CurrencyCodes.put(4,"HKD");
		CurrencyCodes.put(5,"IND");
		
		String fromCode,toCode;
		double amount;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Welcome to currency converter"); 
		
		System.out.println("Currencyconverting from ");
		System.out.println("1: USD(dollar)\t 2: CAD(canadian dollar)\t 3: EUR(euro)\t 4: HKD(honkong dollar)\t 5: INR(rupee)");
		fromCode = CurrencyCodes.get(s.nextInt());
		
		System.out.println("Currency converting to");
		System.out.println("1: USD(dollar)\t 2: CAD(canadian dollar)\t 3: EUR(euro)\t 4: HKD(honkong dollar)\t 5: INR(rupee)");
		toCode = CurrencyCodes.get(s.nextInt());
		
		System.out.println("Amount you wish to conver?");
		amount = s.nextInt();
		
		//sendHttpGETrequest("fromCode,toCode,amount");
		
		
		
		}
		/*
		private static void sendHttpGETrequest(String fromCode, String toCode, double amount)throws IOException{
			String GET_URL = 
		}
		*/
	}
	
