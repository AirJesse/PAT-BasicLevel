package Ä£Äâ¿¼;

import java.io.IOException;
import java.io.InputStreamReader;

public class Í³¼Æ×Ö·û1 {
	public static void main(String[] args) throws IOException {
		int letter = 0, blank = 0, digit = 0, other = 0;
		InputStreamReader isr = new InputStreamReader(System.in);
		for (int i = 0; i < 11; i++) {
			char c = (char) isr.read();
			if (c >= 'A' && c <= 'z')
				letter++;
			else if (c == ' ' || c == '\r')
				blank++;
			else if (c >= '0' && c <= '9')
				digit++;
			else if(c == '\n'){}
			else
				other++;
		}
		System.out.printf("letter = %d, blank = %d, dight = %d, other = %d",letter,blank,digit,other);
		


	}
}
