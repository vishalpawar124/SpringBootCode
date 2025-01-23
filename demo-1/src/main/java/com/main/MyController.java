package com.main;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/JavaTpoint")
public class MyController {
	@RequestMapping(value = "/java", method = RequestMethod.GET)
	public String FirstApi() {
		return "Java is a popular programming language, created in 1995.\r\n" + "\r\n"
				+ "It is owned by Oracle, and more than 3 billion devices run Java.\r\n" + "\r\n"
				+ "It is used for:\r\n" + "\r\n" + "Mobile applications (specially Android apps)\r\n"
				+ "Desktop applications\r\n" + "Web applications\r\n" + "Web servers and application servers\r\n"
				+ "Games\r\n" + "Database connection\r\n" + "And much, much more!";
	}

	@RequestMapping(value = "/html", method = RequestMethod.POST)
	public String SecondApi() {
		return "What is SQL?\r\n" + "SQL stands for Structured Query Language\r\n"
				+ "SQL lets you access and manipulate databases\r\n"
				+ "SQL became a standard of the American National Standards Institute (ANSI) in 1986, and of the International Organization for Standardization (ISO) in 1987\r\n"
				+ "What Can SQL do?\r\n" + "SQL can execute queries against a database\r\n"
				+ "SQL can retrieve data from a database\r\n" + "SQL can insert records in a database\r\n"
				+ "SQL can update records in a database\r\n" + "SQL can delete records from a database\r\n"
				+ "SQL can create new databases\r\n" + "SQL can create new tables in a database\r\n"
				+ "SQL can create stored procedures in a database\r\n" + "SQL can create views in a database\r\n"
				+ "SQL can set permissions on tables, procedures, and views";
	}

	@RequestMapping(value = "/js", method = RequestMethod.DELETE)
	public String ThirdApi() {
		return "What is JavaScript?\r\n" + "JavaScript is the programming language of the web.\r\n" + "\r\n"
				+ "It can update and change both HTML and CSS.\r\n" + "\r\n"
				+ "It can calculate, manipulate and validate data.\r\n" + "\r\n" + "Why Study JavaScript?\r\n"
				+ "JavaScript is one of the 3 languages all web developers must learn:\r\n" + "\r\n"
				+ "   1. HTML to define the content of web pages\r\n" + "\r\n"
				+ "   2. CSS to specify the layout of web pages\r\n" + "\r\n"
				+ "   3. JavaScript to program the behavior of web pages";
	}

	@RequestMapping(value = "/react", method = RequestMethod.PUT)
	public String FouthApi() {
		return "What is React?\r\n"
				+ "React, sometimes referred to as a frontend JavaScript framework, is a JavaScript library created by Facebook.\r\n"
				+ "\r\n" + "React is a tool for building UI components.\r\n" + "\r\n" + "How does React Work?\r\n"
				+ "React creates a VIRTUAL DOM in memory.\r\n" + "\r\n"
				+ "Instead of manipulating the browser's DOM directly, React creates a virtual DOM in memory, where it does all the necessary manipulating, before making the changes in the browser DOM.\r\n"
				+ "\r\n" + "React only changes what needs to be changed!";
	}

	@GetMapping("/java1")
	public String sixthApi() {
		return "Java is a popular programming language, created in 1995.\r\n" + "\r\n"
				+ "It is owned by Oracle, and more than 3 billion devices run Java.\r\n" + "\r\n"
				+ "It is used for:\r\n" + "\r\n" + "Mobile applications (specially Android apps)\r\n"
				+ "Desktop applications\r\n" + "Web applications\r\n" + "Web servers and application servers\r\n"
				+ "Games\r\n" + "Database connection\r\n" + "And much, much more!";
	}

	@PostMapping("/js1")
	public String eightthApi() {
		return "What is JavaScript?\r\n" + "JavaScript is the programming language of the web.\r\n" + "\r\n"
				+ "It can update and change both HTML and CSS.\r\n" + "\r\n"
				+ "It can calculate, manipulate and validate data.\r\n" + "\r\n" + "Why Study JavaScript?\r\n"
				+ "JavaScript is one of the 3 languages all web developers must learn:\r\n" + "\r\n"
				+ "   1. HTML to define the content of web pages\r\n" + "\r\n"
				+ "   2. CSS to specify the layout of web pages\r\n" + "\r\n"
				+ "   3. JavaScript to program the behavior of web pages";
	}

	@PutMapping("/sql1")
	public String ninethApi() {
		return "What is SQL?\r\n" + "SQL stands for Structured Query Language\r\n"
				+ "SQL lets you access and manipulate databases\r\n"
				+ "SQL became a standard of the American National Standards Institute (ANSI) in 1986, and of the International Organization for Standardization (ISO) in 1987\r\n"
				+ "What Can SQL do?\r\n" + "SQL can execute queries against a database\r\n"
				+ "SQL can retrieve data from a database\r\n" + "SQL can insert records in a database\r\n"
				+ "SQL can update records in a database\r\n" + "SQL can delete records from a database\r\n"
				+ "SQL can create new databases\r\n" + "SQL can create new tables in a database\r\n"
				+ "SQL can create stored procedures in a database\r\n" + "SQL can create views in a database\r\n"
				+ "SQL can set permissions on tables, procedures, and views";
	}

	@DeleteMapping("/react1")
	public String tenthApi() {
		return "What is React?\r\n"
				+ "React, sometimes referred to as a frontend JavaScript framework, is a JavaScript library created by Facebook.\r\n"
				+ "\r\n" + "React is a tool for building UI components.\r\n" + "\r\n" + "How does React Work?\r\n"
				+ "React creates a VIRTUAL DOM in memory.\r\n" + "\r\n"
				+ "Instead of manipulating the browser's DOM directly, React creates a virtual DOM in memory, where it does all the necessary manipulating, before making the changes in the browser DOM.\r\n"
				+ "\r\n" + "React only changes what needs to be changed!";
	}
}
