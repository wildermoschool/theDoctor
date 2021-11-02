package com.wildcodeschool.theDoctor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class TheDoctorApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheDoctorApplication.class, args);
	}
	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "	<ul>\n" +
				"	<li>first doctor:  <a href='doctor/1'>William Hartnell</a></li>\n" +
				"	<li>secound doctor:<a href='doctor/2'>Patrick Troughton</a></li>\n" +
				"   <li>third doctor:  <a href='doctor/3'>Jon Pertwee</a></li>\n" +
				"   <li>fourth doctor: <a href='doctor/4'>Tom Baker</a></li>\n" +
				"	</ul>";
	}

	@RequestMapping("/doctor/1")
	@ResponseBody
	public String doctor1() {
		return "first doctor: <a href='https://en.wikipedia.org/wiki/William_Hartnell'>William Hartnell</a>";
	}
	@RequestMapping("/doctor/2")
	@ResponseBody
	public String doctor2() {
		return "secound doctor: <a href='https://en.wikipedia.org/wiki/Patrick_Troughton'>Patrick Troughton</a>";
	}
	@RequestMapping("/doctor/3")
	@ResponseBody
	public String doctor3() {
		return "third doctor: <a href='https://en.wikipedia.org/wiki/Jon_Pertwee'>Jon Pertwee</a>";
	}
	@RequestMapping("/doctor/4")
	@ResponseBody
	public String doctor4() {
		return "fourth doctor: <a href='https://en.wikipedia.org/wiki/Tom_Baker'>Tom Baker</a>";
	}
}
