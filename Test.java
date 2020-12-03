package com;

import java.io.*;
import java.util.*;;


public class Test {
	public static void Student() throws IOException{ 
		
		String name;       //学生的姓名 
	  int num;           //学生的学号
	  String sex;           //学生的性别
	  int age;        //学生的年龄
	  String grade;       //学生的班级
	  
		 Scanner sc= new Scanner(System.in);
		  System.out.println("姓名：");
		     name=sc.next();
		  System.out.println("编号：");
		     num=sc.nextInt();
		  System.out.println("性别：");
		     sex=sc.next();
		  System.out.println("年龄");
		     age=sc.nextInt();
		  System.out.println("班级：");
		     grade=sc.next();

		    
		     System.out.println("姓名："+name+"编号："+num+"性别："+sex+"年龄："+age+"班级："+grade);
		     
	}
	public static void txt(){
		try (FileReader fInputStream = new FileReader("F:\\changhenge\\changhenge.txt");//输入流文件
			FileWriter fOutputStream  = new FileWriter("F:\\changhenge\\changhenge1.txt")){
		   StringBuffer st=new StringBuffer();
		   char[] ch=new char[14];//设置有14个字符

		while ((fInputStream.read(ch)) !=-1) {
		    st.append(ch, 0,7);
		    st.append("，");
		    st.append(ch, 7, 7);
		    st.append("。");
		    st.append("\n");
		    
		  }
		 
		  System.out.println(st);
		  
	      fOutputStream.write(new String(st));
		}catch (IOException e) {
			e.printStackTrace();
		}
		
}
			
	}

