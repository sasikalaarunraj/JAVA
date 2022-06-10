import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Iostream_readwrite {

	public static void main(String[] args) {
		FileWriter writer;
		try {
			writer = new FileWriter("C:\\Users\\DSSundar\\Desktop\\sasikala_file\\sasi.txt");
			BufferedWriter w=new BufferedWriter(writer);
			w.write("tamil is a my first language.");
			w.newLine();
			w.write("English is secong language.");
			w.newLine();
			w.write("maths i like it most.");
			w.newLine();
			w.flush();
			w.close();
			FileReader reader=new FileReader("C:\\Users\\DSSundar\\Desktop\\sasikala_file\\sasi.txt");
			BufferedReader r=new BufferedReader(reader);
			String line=r.readLine();
			int linecount=0,sentencecount=0,wordcount=0,charcount=0;
			while(line!=null) {
				String[] s=line.split("[.]");
				sentencecount=sentencecount+s.length;
				String[] s1=line.split(" ");
				wordcount=wordcount+s1.length;
				System.out.println(line);
				charcount=charcount+line.length();
				linecount++;
				line=r.readLine();
			}
			System.out.println(linecount);
			System.out.println(sentencecount);
			System.out.println(wordcount);
			System.out.println(charcount);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}


