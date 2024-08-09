import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LaunchJackson1 {

	public static void main(String[] args) throws JsonProcessingException {
		
		Alien a1=new Alien(101,"rahul","Mangaluru");
		System.out.println(a1);
		ObjectMapper objMapper=new ObjectMapper();
//		String json = objMapper.writeValueAsString(a1);
//		String json = objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(a1);
//		System.out.println(json);
		
		Alien a2=new Alien(102,"ross","newyork");
		Alien a3=new Alien(103,"rachel","vegas");
		
		List<Alien> list= List.of(a1, a2, a3);
		String json = objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(list);
		System.out.println(json);
		
		
	}
}