package com.choa.util;

public class PageMaker {
	
	private int perPage;
	private int perBlock;
	private int curPage;
	private MakePage makePage;
	private RowMaker rowMaker;
	
	public PageMaker(int perPage, int curPage, int perBlock){
		this.perPage=perPage;
		this.perBlock=perBlock;
		this.curPage=curPage;
	}
	public PageMaker(int perPage, int curPage){
		this(perPage,curPage, 5);
	}
	public PageMaker(int curPage){
		this(10,curPage);
	}
	
	public MakePage getMakePage(int totalCount) {
		MakePage makePage = new MakePage();
		makePage.makePage(totalCount, curPage, perPage, perBlock);
		return makePage;
	}
	public RowMaker getRowMaker(String kind, String search) {
		RowMaker rowMaker = new RowMaker();
		rowMaker.setRow(curPage, perPage);
		rowMaker.setKind(kind);
		rowMaker.setSearch(search);
		return rowMaker;
	}
	public RowMaker getRowMaker() {
		RowMaker rowMaker = new RowMaker();
		rowMaker.setRow(curPage, perPage);
		return rowMaker;
	}

}
