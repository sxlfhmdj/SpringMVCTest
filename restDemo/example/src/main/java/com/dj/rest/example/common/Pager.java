package com.dj.rest.example.common;

import java.io.Serializable;
import java.util.List;


public class Pager<T> implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * <p>Discription:[默认分页大小]</p>
	 **/
	public static final int DEFAULT_PAGESIZE = 10;

	/**
	 * <p>Discription:[分页数据]</p>
	 **/
	private List<T> records;

	/**
	 * <p>Discription:[当前页]</p>
	 **/
	private int current = 1;

	/**
	 * <p>Discription:[每页显示记录数]</p>
	 **/
	private int size = 10;

	/**
	 * <p>Discription:[当前页起始记录]</p>
	 **/
//	private int offset;

	/**
	 * <p>Discription:[总页数]</p>
	 **/
	private int pages;

	/**
	 * <p>Discription:[总记录数]</p>
	 **/
	private Integer total;//
	
	//=============datatables专用 start==================
	private Integer draw; //怎么传过来，怎么返回
	private Integer start = 1;
	private Integer length = 20;
	//=============datatables专用 end==================
	
	public Pager(){
	}
	/**
	 * @param current 当前页
	 * @rows 每页记录数大小
	 */
	public Pager(int current, int size){
		this.current = current;
		this.size = size;
	}

	/**
	 * @param current 当前页
	 */
	public Pager(int current){
		this.setCurrent(current);
	}

	public int getOffset() {
		//return (current - 1) * size;
		return start;
	}

//	public void setOffset(int offset) {
//		this.offset = offset;
//	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		if( current > 0 ){
			this.current = current;
		}
	}

	public int getSize() {
//		return size;
		return length;
	}

	public void setSize(int size) {
		if( size > 0 ){
			this.size = size;
		}
	}


	public List<T> getRecords() {
		return records;
	}

	public void setRecords(List<T> records) {
		this.records = records;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
		if (this.size == 0) {
			this.pages = 0;
		}
		this.pages = (int)(this.total / this.size);
		if (this.total % this.size != 0) {
			this.pages++;
		}
	}

	public int getPages() {
		return this.pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	public Integer getDraw() {
		return draw;
	}
	public void setDraw(Integer draw) {
		this.draw = draw;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}

}
