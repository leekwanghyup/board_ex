package com.jafa.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PageMaker {
	Criteria criteria; 
	int totalCount; 
	int startPage; 
	int endPage;
	int displyaPageNum = 10;
	boolean prev; 
	boolean next; 
	
	public void setTotalCount(int totalCount ) {
		this.totalCount = totalCount; 
		calcData(); 
	}
	
	private void calcData() {
		endPage = (int) Math.ceil(criteria.getPage() /(double)displyaPageNum) * displyaPageNum;
		startPage = endPage-displyaPageNum+1;
		
		int tempEndPage = (int) Math.ceil(totalCount / (double)criteria.getPerPageNum());
		if(endPage>tempEndPage) endPage=tempEndPage;
		prev = startPage != 1; 
		next = endPage < tempEndPage;
	}
}
