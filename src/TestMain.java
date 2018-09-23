

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		   List<String> warnings = new ArrayList<String>();
		   boolean overwrite = true;
		   File configFile = new File("aa.xml");
		   ConfigurationParser cp = new ConfigurationParser(warnings);
		   Configuration config;
		try {
			config = cp.parseConfiguration(configFile);
		   DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		   MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		   myBatisGenerator.generate(null);
		   
		   for(String string : warnings){
			   System.out.println(string);
		   }
		   
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//		List<Long> deList = new ArrayList<Long>();
//		List<Long> list1 = new ArrayList<Long>();
//		list1.add((long) 1);
//		list1.add((long) 2);
//		list1.add((long) 3);
//		list1.add((long) 4);
//		list1.add((long) 5);
//
//		List<Long> list2 = new ArrayList<Long>();
//		list2.add((long)2);
//		list2.add((long)4);
//		list2.add((long)6);
//		list2.add((long)7);
//		
//		List<Long> list11 = new ArrayList<Long>(list1);
//		List<Long> list22 = new ArrayList<Long>(list2);
//		//de
//		list1.removeAll(list2);
//		for(Long l:list1){
//			System.out.print(l+" ,");
//		}
//
//		//add
//		list22.removeAll(list11);
//		
//		System.out.println("hh");
//		for(Long l:list22){
//			System.out.print(l+" ,");
//		}
//
//	}

}
