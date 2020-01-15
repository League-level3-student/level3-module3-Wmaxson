package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {
	
	String t;
	public BackwardsString(String s) {
		super(s);
		t = "";
	}

	@Override
	public String funkifyText(String s) {
		t = "";
		for (int i = s.length()-1; i >= 0; i--) {
		t+=s.charAt(i);	
		}
		return t;
	}

} 
