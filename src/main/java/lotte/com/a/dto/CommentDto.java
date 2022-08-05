package lotte.com.a.dto;

public class CommentDto {
	
	private int id; // 고유번호
	private int seq; // 글 번호
	
	private String memberId; // 작성자

	private String content;
	private String wdate; // 작성일

	private int del; // 댓글이 삭제되어있는가

	public CommentDto() {
	}

	public CommentDto(int seq, String memberId, String content) {
		this.seq = seq;
		this.memberId = memberId;
		this.content = content;
	}
	
	public CommentDto(int id, int seq, String memberId, String content, String wdate, int del) {
		super();
		this.id = id;
		this.seq = seq;
		this.memberId = memberId;
		this.content = content;
		this.wdate = wdate;
		this.del = del;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWdate() {
		return wdate;
	}

	public void setWdate(String wdate) {
		this.wdate = wdate;
	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}

	@Override
	public String toString() {
		return "ContentsDto [id=" + id + ", seq=" + seq + ", memberId=" + memberId + ", content=" + content + ", wdate="
				+ wdate + ", del=" + del + "]";
	}
	
}
