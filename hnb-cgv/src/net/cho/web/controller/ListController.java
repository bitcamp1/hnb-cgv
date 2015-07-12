package net.cho.web.controller;

import javax.servlet.ServletContext;

import  java.io.*;//File 
import java.util.List;

import net.cho.web.dao.BoardDAO;
import net.cho.web.model.BoardDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ListController {
	@Autowired
	BoardDAO  dao;
	
	@RequestMapping("/board_list.do")
	public String board_list( Model  model){     
		System.out.println("board_list(Model) 10:08");
		List<BoardDTO> list = dao.dbSelect();
		model.addAttribute("naver", list);
		String url="/views/board/board_list";
		return url;
	}//end
	
	@RequestMapping("/board_list2.do")
	public String board_list2( Model  model){     
		System.out.println("board_list(Model) 10:08");
		List<BoardDTO> list = dao.dbSelect();
		model.addAttribute("naver", list);
		String url="/views/board/board_list2";
		return url;
	}//end
}//ListController class end






