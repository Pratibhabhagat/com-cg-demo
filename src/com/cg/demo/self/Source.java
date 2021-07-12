package com.cg.demo.self;

class Email{
	Header header;
	String body;
	String greetings;

	public Email(Header header,String body,String greetings){
		this.header=header;
		this.body=body;
		this.greetings=greetings;
	}
}
class Header{
	String from;
	String to;

	public Header(String from, String to){
		this.from = from;
		this.to = to;
	}
}
class EmailOperations{
	
}
public class Source {
	public static void main(String args[] ) throws Exception {
	}
	}