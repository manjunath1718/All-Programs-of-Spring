package com.telusko;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.dao.JobSeeker;
import com.telusko.service.JobSeekerService;

@SpringBootApplication
public class SpringDataJpa2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa2Application.class, args);
		JobSeekerService service = container.getBean(JobSeekerService.class);
		

//		JobSeeker jobSeeker=new JobSeeker();
//		jobSeeker.setName("viraj");
//		jobSeeker.setCity("mumbai");
//		jobSeeker.setDob(LocalDate.of(2000, 02, 15));
//		
//		byte[] image=null;
//		char[] textFile=null;
//		
//		FileInputStream inputStream = null;
//		FileReader reader = null;
//		
//		try {
//			inputStream=new FileInputStream("D:\\IO\\FileHandling\\beluru.png");		
//			image=new byte[inputStream.available()];
//			inputStream.read(image);
//			
//			File file=new File("D:\\IO\\FileHandling\\jobSeekserInfo.txt");
//			reader=new FileReader(file);
//			textFile=new char[(int) file.length()];
//			reader.read(textFile);
//			
//		} catch (FileNotFoundException e) {
//			
//			e.printStackTrace();
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}finally {
//			
//			try {
//				reader.close();
//				inputStream.close();
//			} catch (IOException e) {
//				
//				e.printStackTrace();
//			}
//		}
//		
//		jobSeeker.setImage(image);
//		jobSeeker.setTextFile(textFile);
//		String msg = service.registerJobSeeker(jobSeeker);
//		System.out.println(msg);

		Integer id=2;
		Optional<JobSeeker> optional = service.fetchJobSeekeerById(id);
	
		if(optional.isPresent()) {
			JobSeeker js = optional.get();
			System.out.println(js.getName()+" : "+js.getCity()+" : "+js.getDob());
			
			FileOutputStream outputStream = null;
			FileWriter writer = null;
			
			try {
				outputStream=new  FileOutputStream("jobSeekerimage.JPG");
				outputStream.write(js.getImage());
				outputStream.flush();
				
				writer=new FileWriter("resume.txt");
				writer.write(js.getTextFile());
				writer.flush();
				
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}finally {
				try {
					outputStream.close();
					writer.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
			
			
			
		}else {
			System.out.println("JobSeeker details Not Found with Id "+id);
		}
	}

}
