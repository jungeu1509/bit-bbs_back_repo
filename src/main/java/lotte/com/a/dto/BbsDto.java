package lotte.com.a.dto;

// Bulletin Board System
public class BbsDto {
	
	private int seq; // 중복되지 않는 증가되는 숫자
	private String id; // 작성자

	private int ref; // 그룹번호 -> 부모 ref
	private int step; // 행 번호(그룹의 순번) -> (부모 step) + 1
	private int depth; // 깊이 -> (부모 depth) + 1

	private String title;
	private String content;
	private String wdate; // 작성일

	private int del; // 글이 삭제되어있는가/
	private int readcount;

	public BbsDto() {
	}

	public BbsDto(String id, String title, String content) {
		this.id = (id);
		this.title = (title);
		this.content = (content);
	}

	public BbsDto(int seq, String id, String title, String content) {
		this.seq = seq;
		this.id = (id);
		this.title = (title);
		this.content = (content);
	}

	public BbsDto(int seq, String id, int ref, int step, int depth, String title, String content, String wdate, int del,
			int readcount) {
		this.seq = seq;
		this.id = (id);
		this.ref = ref;
		this.step = step;
		this.depth = depth;
		this.title = (title);
		this.content = (content);
		this.wdate = wdate;
		this.del = del;
		this.readcount = readcount;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getRef() {
		return ref;
	}

	public void setRef(int ref) {
		this.ref = ref;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public int getReadcount() {
		return readcount;
	}

	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}

	@Override
	public String toString() {
		return "BbsDto [seq=" + seq + ", id=" + id + ", ref=" + ref + ", step=" + step + ", depth=" + depth + ", title="
				+ title + ", content=" + content + ", wdate=" + wdate + ", del=" + del + ", readcount=" + readcount
				+ "]";
	}

}
