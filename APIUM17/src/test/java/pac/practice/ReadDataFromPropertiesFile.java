package pac.practice;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataFromPropertiesFile {
      @Test
		public void readDataTest() throws Throwable {
			//Read the Data From Properties File
			FileInputStream fis=new FileInputStream("PropertyFile.properties");
			
			Properties pObject=new Properties();
			pObject.load(fis);
			String URL=pObject.getProperty("url");
			System.out.println(URL);
			

}
}

