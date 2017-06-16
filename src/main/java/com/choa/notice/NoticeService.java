package com.choa.notice;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.choa.util.MakePage;
import com.choa.util.PageMaker;
import com.choa.util.RowMaker;


@Service
//NoticeService noticeService = new NoticeService();
public class NoticeService {

	@Inject
	private NoticeDAO noticeDAO;
	
	public void test(){
		System.out.println(noticeDAO);
	}
	
	
	/*public NoticeService(){
		
	}
	
	//Constructor 생성자
	public NoticeService(NoticeDAO noticeDAO){
		this.noticeDAO = noticeDAO;
	}
	
	//setter
	public void setNoticeDAO(NoticeDAO noticeDAO) {
		this.noticeDAO = noticeDAO;
	}*/
	
	
	
	//View
	public NoticeDTO noticeView(int num) throws Exception{
		
		return noticeDAO.noticeView(num);
	}
	

	//List
	public List<NoticeDTO> noticeList(int curPage) throws Exception{
		

		PageMaker pageMaker = new PageMaker(curPage);
		
		/*int totalCount =noticeDAO.noticeCount();
		MakePage makePage = pageMaker.getMakePage(totalCount);*/
		
		return noticeDAO.noticeList(pageMaker.getRowMaker());
	}
	
	//Write
	public int noticeWrite(NoticeDTO noticeDTO) throws Exception{
		
		return noticeDAO.noticeWrite(noticeDTO);
	}
	
	//Update
	public int noticeUpdate(NoticeDTO noticeDTO) throws Exception{
		
		return noticeDAO.noticeUpdate(noticeDTO);
	}
	
	
	//Delete
	public int noticeDelete(int num) throws Exception{
		
		return noticeDAO.noticeDelete(num);
	}
	
	
}
