package Demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo {

	public static void main(String[] args) throws IOException {
		Properties props =new Properties();
		FileInputStream Prop_fis = new FileInputStream(System.getProperty("user.dir")+"/Application.properties");
		props.load(Prop_fis);
		String name = props.getProperty("MobileTesting");
		System.out.println(name);
		System.out.println(props.getProperty("EmailTextBox"));
	}
}
