package com.choa.ex2;

import java.util.List;

import javax.inject.Inject;

import org.junit.runners.Parameterized.Parameters;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.choa.notice.NoticeDTO;
import com.choa.notice.NoticeService;

@Controller
@RequestMapping(value="/notice/**") 
public class NoticeController {
	
	
	@Inject //type
	private NoticeService noticeService;
	
	
	@RequestMapping(value="test")
	public void test(){
		System.out.println(noticeService);
		noticeService.test();
	}
	
	//List
	@RequestMapping(value="noticeList", method=RequestMethod.GET)
	public void noticeList(@RequestParam(defaultValue="1")Integer curPage, Model model) throws Exception{
		
		List<NoticeDTO> ar =noticeService.noticeList(curPage);
		model.addAttribute("list", ar);
		
	}
	//View
	@RequestMapping(value="noticeView", method=RequestMethod.GET)
	public void noticeView(@RequestParam(defaultValue="324")Integer num, Model model) throws Exception{
		
		NoticeDTO noticeDTO = noticeService.noticeView(num);
		model.addAttribute("dto", noticeDTO);
				
	}
	//Write
	@RequestMapping(value="noticeWrite", method=RequestMethod.GET)
	public void noticeWrite(Model model){
		model.addAttribute("path", "Write");
	}
	//Write
	@RequestMapping(value="noticeWrite", method=RequestMethod.POST)
	public String noticeWrite(RedirectAttributes redirectAttributes,NoticeDTO noticeDTO) throws Exception{
		
		int result = noticeService.noticeWrite(noticeDTO);
		
		String message = "FAIL";
		if(result > 0){
			message = "SUCCESS";
		}
		redirectAttributes.addFlashAttribute("message", message);
		return "redirect:noticeList";
		
	}
	//Update
	@RequestMapping(value="noticeUpdate", method=RequestMethod.GET)
	public String noticeUpdate(Model model,Integer num) throws Exception{
		NoticeDTO noticeDTO = noticeService.noticeView(num);
		
		model.addAttribute("dto", noticeDTO);
		model.addAttribute("path", "Update");
		return "notice/noticeWrite";
	}
	
	
	//Update
	@RequestMapping(value="noticeUpdate", method=RequestMethod.POST)
	public String noticeUpdate(RedirectAttributes redirectAttributes, NoticeDTO noticeDTO) throws Exception{
		
		int result = noticeService.noticeUpdate(noticeDTO);
		String message = "FAIL";
		if(result > 0){
			message = "SUCCESS";
		}
		redirectAttributes.addFlashAttribute("message", message);
		return "redirect:/notice/noticeList";
		
	}
	//Delete
	@RequestMapping(value="noticeDelete", method=RequestMethod.GET)
	public String noticeDelete(RedirectAttributes redirectAttributes,Integer num) throws Exception{
		
		int result = noticeService.noticeDelete(num);
		String message = "FAIL";
		if(result > 0){
			message = "SUCCESS";
		}
		redirectAttributes.addFlashAttribute("message", message);
		return "redirect:/notice/noticeList";
	}

}
