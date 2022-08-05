package lotte.com.a.dto;

public class BbsListRequestDto{
	private String search;
	private String choice;
	private int pageNumber;

	public BbsListRequestDto() {};
	public BbsListRequestDto(String search, String choice, int pageNumber) {
		this.search = search;
		this.choice = choice;
		this.pageNumber = pageNumber;
	}
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	public String getChoice() {
		return choice;
	}
	public void setChoice(String choice) {
		this.choice = choice;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
}
