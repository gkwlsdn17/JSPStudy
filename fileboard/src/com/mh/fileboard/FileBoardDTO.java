package com.mh.fileboard;

public class FileBoardDTO {

	private String title;
	private String content;
	private String filename;
	private int idx;
	public FileBoardDTO() {
		
	}
	//alt+shift+s -> o 생성자 단축키
	public FileBoardDTO(String title, String content, String filename, int idx) {
		super();
		this.title = title;
		this.content = content;
		this.filename = filename;
		this.idx = idx;
	}
	//alt + shift + s -> r getter setter 단축키
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
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	@Override
	public String toString() {
		return "FileBoardDTO [title=" + title + ", content=" + content + ", filename=" + filename + ", idx=" + idx
				+ "]";
	}
	
	
}
