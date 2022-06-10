import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_readingwriting {

	public static void main(String[] args) throws IOException {
		//File f=new File("C:\\Users\\DSSundar\\Desktop\\sasikala_file\\sasi\\arun\\sasi.txt");
		FileWriter writer=new FileWriter("C:\\Users\\DSSundar\\Desktop\\sasikala_file\\sasi.txt");
        writer.write(65);
        writer.write("sasikala is a good girl");
        writer.write('c');
        writer.flush();
        writer.close();
        FileReader reader=new FileReader("C:\\Users\\DSSundar\\Desktop\\sasikala_file\\sasi.txt");
       int r= reader.read();
       int count=0;
       while(r!=-1) {
    	   count++;
    	   System.out.print((char)r);
    	   r= reader.read();
       }
       System.out.println(count);
	}
}
