package lotte.com.a.dto;

import java.util.List;

public class BbsListResponseDto {
	String choice;
	String search;
	List<BbsDto> list;
	int bbsPage;
	int pageNumber;
	
	public BbsListResponseDto() {}
	
	public BbsListResponseDto(String choice, String search, List<BbsDto> list, int bbsPage, int pageNumber) {
		this.choice = choice;
		this.search = search;
		this.list = list;
		this.bbsPage = bbsPage;
		this.pageNumber = pageNumber;
	}

	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public List<BbsDto> getList() {
		return list;
	}

	public void setList(List<BbsDto> list) {
		this.list = list;
	}

	public int getBbsPage() {
		return bbsPage;
	}

	public void setBbsPage(int bbsPage) {
		this.bbsPage = bbsPage;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	@Override
	public String toString() {
		return "BbsListResponseDto [choice=" + choice + ", search=" + search + ", list=" + list + ", bbsPage=" + bbsPage
				+ ", pageNumber=" + pageNumber + "]";
	}
	
	
}
