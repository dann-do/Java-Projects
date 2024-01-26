/**
Name: Dan Do
Question: Question #2
**/

public class TokenizePhoneNumber{
	public static String convertPhoneNumber(String phoneNumber) {
		String[] splitNumber = phoneNumber.split(" ");  // => ["(504)", "123-4567"]
		
		//Splitting into differnt parts
		String areaCode = splitNumber[0];
		String formatAreaCode = areaCode.substring(1, areaCode.length()-1);  // "504"
		
		String numbers = splitNumber[1];
		String formatNumbers = numbers.replace("-", "");	//123-4567
		
		String returnNumber = formatAreaCode + formatNumbers; 
		
		return returnNumber;
	}

    public static void main(String[] args){
        System.out.println(TokenizePhoneNumber.convertPhoneNumber("(504) 123-4567")); //expected output 5041234567
    }
	

}