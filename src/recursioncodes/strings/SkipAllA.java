package recursioncodes.strings;

public class SkipAllA {
public static void main(String[] args) {
//	String ans = "";
//	ans = skipA("baccad" , 0);
//	System.out.println("ans : "+ans);
//	
//	System.out.println(skip( new StringBuilder() , "bccas"));
//	skips(new StringBuilder() , "bccas");
//	System.out.println(skipElement("assert"));
//	System.out.println(skipApple("bccappleert"));
System.out.println(skipAppNotApple("bccapp"));
	
}

public static String skipA(String str ,  int index ) {
	String ans = "";
	if(index == str.length()) {
		return ans;
	}
	if(str.charAt(index) != 'a') {
		ans += str.charAt(index);
	}
	String localAns = skipA(str , ++index);
	return ans + localAns;
	
}

// returning answer
public static StringBuilder skip(StringBuilder processed ,  String unprocessed ) {
	if(unprocessed.isEmpty()) {
		return processed;
	}
	char ch = unprocessed.charAt(0);
	if(ch == 'a') {
		return skip(processed , unprocessed.substring(1));
	}
	else {
		return skip(processed.append(ch), unprocessed.substring(1));
	}
	
}


// printing answer
public static void skips(StringBuilder processed ,  String unprocessed ) {
	if(unprocessed.isEmpty()) {
		System.out.println("Processed : "+processed);
		return;
	}
	char ch = unprocessed.charAt(0);
	if(ch == 'a') {
		skips(processed , unprocessed.substring(1));
	}
	else {
		skips(processed.append(ch), unprocessed.substring(1));
	}
	
}

public static String skipElement(String unprocessed ) {
	if(unprocessed.isEmpty()) {
		return unprocessed;
	}
	char ch = unprocessed.charAt(0) ;
	if(ch ==  'a') {
		return skipElement(unprocessed.substring(1));
	}
	else {
		return ch + skipElement( unprocessed.substring(1));
	}
	
}

public static String skipApple(String unprocessed ) {
	if(unprocessed.isEmpty()) {
		return unprocessed;
	}
	if(unprocessed.startsWith("apple")) {
		return skipApple(unprocessed.substring("apple".length()));
	}
	else {
		return unprocessed.charAt(0) + skipApple( unprocessed.substring(1));
	}
	
}

public static String skipAppNotApple(String unprocessed ) {
	if(unprocessed.isEmpty()) {
		return unprocessed;
	}
	if(unprocessed.startsWith("app") && !unprocessed.startsWith("apple")) {
		return skipAppNotApple(unprocessed.substring("app".length()));
	}
	else {
		return unprocessed.charAt(0) + skipAppNotApple( unprocessed.substring(1));
	}
	
}
}
