import java.util.Scanner;

public class CaesarCipher 
{
	public String encryption(String strE)
	{
		String Encrypt="";
		for(int i=0;i<strE.length();i++)
		{
			if(strE.equals(strE.toUpperCase()))
			{
				int Ascii=(((int)strE.charAt(i)+3-65)%26)+65;
				Encrypt=Encrypt+Character.toString((char)Ascii);
			}
			else
			{
				int Ascii=(((int)strE.charAt(i)+3-97)%26)+97;
				Encrypt=Encrypt+Character.toString((char)Ascii);
			}
		}
		return Encrypt;
	}
	
	public String decryption(String strD)
	{
		String Decrypt="";
		for(int i=0;i<strD.length();i++)
		{
			if(strD.equals(strD.toUpperCase()))
			{
                                        int Ascii=(((int)strD.charAt(i)-3-65+26)%26)+65;
					Decrypt=Decrypt+Character.toString((char)Ascii);
		         }
			else
			{
	                        int Ascii=(((int)strD.charAt(i)-3-97+26)%26)+97;
				Decrypt=Decrypt+Character.toString((char)Ascii);
			}
		}
		return Decrypt;
		
	}
	
	public static void main(String[] args) 
	{
		int choice;
		Scanner sc=new Scanner(System.in);
		CaesarCipher C=new CaesarCipher();
		System.out.println("\n **************Caesar Cipher*************");
		
			System.out.println("\n Please enter 1 to ENCRYPT a text \n or enter 2 to DECRYPT a text");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("\n Please enter String to encode");
				String Estr=sc.next();
				System.out.println("Cipher text = "+C.encryption(Estr));
				break;
			case 2:
				System.out.println("\n Please enter String to decode");
				String Dstr=sc.next();
				System.out.println("Plain text = "+C.decryption(Dstr));
				break;
			default:
				System.out.println("\n Please try again :) ");
				break;
			}			
	}
}
