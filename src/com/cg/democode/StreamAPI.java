package com.cg.democode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {

public static void main(String[] args) {
		
//		//stream can be created with static data
//		Stream<String> stream = Stream.of("I","G","A","T","E","\n");	
//		stream.forEach((location)->System.out.print(location));
//		
//		
//		//stream can be acquired from array or collections
//		List<String> locations = Arrays.asList(new String[]{"Pune","Mumbai","Chennai","Banglore","Noida"});
//		stream = locations.stream();
//		stream.forEach(System.out::println);
//		
//	}
//}
	Stream<String> str = Stream.of("s","o","n","u","\n");
	str.forEach((location) -> System.out.println(location));
	
	List<String> location = Arrays.asList(new String[] {"hgfds","qwgj","jwerf"});
	str = location.stream();
	str.forEach(System.out::println);
}
}