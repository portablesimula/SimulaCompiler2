import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.nio.charset.Charset;

public class ConsoleTesting {
	public static void main(String[] args) { 
        // Create the console object 
        Console console = System.console(); 
  
        if (console == null) { 
            System.out.println("No console available"); 
            return; 
        } 
        System.out.println("SystemConsole charset = " + console.charset());
        System.out.println("SystemConsole isTerminal = " + console.isTerminal());
  
//        test1();
//        test2();
//        test3();
//        test4();
        test5();
    } 
	
	public static void test1() { 
        // Create the console object 
        Console console = System.console(); 
  
        // Read line 
        String str = console.readLine("TEST1 - Enter string: "); 
  
        // Print 
        System.out.println("You entered: " + str); 
     } 

	
	public static void test2() { 
        // Create the console object 
        Console console = System.console(); 
  
        console.print("TEST2 - Enter second string: ");
        String str = console.readLine();
        System.out.println("You entered: " + str); 
    } 
	
	public static void test3() { 
        Console console = System.console(); 
        PrintWriter writer = console.writer();
        Reader reader = console.reader();
        reader = new BufferedReader(reader);
        
        try {
        writer.print("TEST3 - Enda en gang: "); writer.flush();
		String str = readLine(reader);
        System.out.println("You entered: " + str); 
		} catch (IOException e) {
			e.printStackTrace();
		}
    } 
	
	public static void test4() { 
		try {
			System.out.print("TEST4 - SKRIV NOE: ");
			// Read line 
			String str = readLine();
	        System.out.println("You entered: " + str); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
     } 
	
	public static void test5() { 
		try {
			System.out.print("TEST5 - SKRIV NOE: ");
			Charset _CHARSET = Charset.defaultCharset();
			Reader reader = new InputStreamReader(System.in, _CHARSET);

			// Read line 
			String str = readLine(reader);
	        System.out.println("You entered: " + str); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
     } 
	
	public static String readLine(Reader reader) throws IOException {
		StringBuilder s = new StringBuilder();
		int c;
		while((c=reader.read()) != '\n') {
			if(c != '\r') s.append((char)c);
		}
		return s.toString();
	}
	
	public static String readLine() throws IOException {
		StringBuilder s = new StringBuilder();
		int c;
		while((c=System.in.read()) != '\n') {
			if(c != '\r') s.append((char)c);
		}
		return s.toString();
	}
	
}
