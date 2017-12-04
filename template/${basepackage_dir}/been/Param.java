package ${basepackage}.been;

public class Param {

	private Integer pageSize;
	private Integer pageNo;
	private String keyword;
	private Long stratTime;
	private Long endTime;
	private String orderBy;
	private Integer lineStart;
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getPageNo() {
		return pageNo;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		if(pageSize!=null && pageNo!=null && pageSize!=0 && pageNo!=0) {
			setLineStart(pageSize*pageNo-1);
		}
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public Long getStratTime() {
		return stratTime;
	}
	public void setStratTime(Long stratTime) {
		this.stratTime = stratTime;
	}
	public Long getEndTime() {
		return endTime;
	}
	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public Integer getLineStart() {
		return lineStart;
	}
	public void setLineStart(Integer lineStart) {
		this.lineStart = lineStart;
	}

	
}
