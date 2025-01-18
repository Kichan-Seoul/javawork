package _03_StringBuffer_Builder;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class T02_StringBuilder {

	public static void main(String[] args) {
		// StringBuffer와 사용방법 동일
		StringBuilder sb = new StringBuilder();
		
		sb.append("Kichan");
		sb.append(" Kim");
		System.out.println(sb);
		
		sb.insert(6, " the King");
		System.out.println(sb);
		
		sb.insert(sb.length()-6, " is the World");
		System.out.println(sb);
	}

}
