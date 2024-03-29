package path;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AA_CreatePath {

	public static void main(String[] args) {
		
		Path p1=Paths.get("java", "temario.txt");
		Path p2=FileSystems.getDefault().getPath("java", "temario.txt");
		Path p3=Paths.get(System.getProperty("user.home"), "documents","java","teamrio.txt");
		System.out.println(p1.toAbsolutePath());
		System.out.println(p2.toAbsolutePath());
		System.out.println(p3.toAbsolutePath());
	}

}
