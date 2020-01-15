package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}
	String t;
	@Override
	public String funkifyText(String s) {
		s = s.toLowerCase();
		t = "";
		for (int i = 0; i <= s.length()-1; i++) {
			if (i%2==0) {
				t += s.charAt(i);
			} else {
				t += Character.toUpperCase(s.charAt(i));
			}
			
		}
		return t;
	}

}
