import java.io.File;

public class File_create {

	public static void main(String[] args) throws Exception {
		File f=new File("C:\\Users\\DSSundar\\Desktop");
		
		//create files,folder,subfolder and check wheather the file is present are not
		/*boolean p=f.exists();
		if(p==false) {
		f.mkdir();
		f.mkdirs();	
		f.createNewFile();*/	
		
		//rename the file
		
		/*File f1=new File("C:\\Users\\DSSundar\\Desktop\\sasikala_file\\sasi\\arun\\sasiarun.txt");
		f.renameTo(f1);*/ 
		
	//  printing file name
		
		/*String str=f.getName();
		System.out.println(str);*/ 
		
		/*print all the document present in the location
		 
		  String[] str1=f.list();
		 for(String s:str1)
		System.out.println(s);*/
		/* printing only files and folder names
		File[] f1=f.listFiles();
		for(File f2:f1)
			//if(f2.isFile()) 
			if(f2.isDirectory()){
				System.out.println(f2);
			}*/
		/*File[] f1=f.listFiles();
		for(File f2:f1)
	    if(f2.isFile()) {
		String str=f2.getName();
		int ch=str.lastIndexOf(".");
		String s=str.substring(ch+1);
		if(s.equalsIgnoreCase("docx")) {
			System.out.println(str);
		}	
		}*/
		/*File[] f1=f.listFiles();
		for(File f2:f1)
	    if(f2.isFile()) {
		long s=f2.length();
		if(s>=50000) {
			System.out.println(f2.getName()+" "+s);
		}
	    }*/
			
		}

	private static void substring() {
		// TODO Auto-generated method stub
		
	}
		
	}


