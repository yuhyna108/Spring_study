package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("sub2") /*����Ǵ� �κ� ǥ��*/
public class TestController {
	/*
	 * @GetMapping("/sub2/test5") public String test5() { return "result"; }
	 * 
	 * @GetMapping("/sub2/test6") public String test6() { return "result"; }
	 * 
	 * @GetMapping("/sub2/test7") public String test7() { return "result"; }
	 */
	
	@GetMapping("/test5")
	public String test5() {
		return "result";
	}
	
	@GetMapping("/test6")
	public String test6() {
		return "result";
	}
	
	@GetMapping("/test7")
	public String test7() {
		return "result";
	}
}
