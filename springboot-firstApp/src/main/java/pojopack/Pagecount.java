package pojopack;

public class Pagecount {

	private int pageSize;
	private int page;
	private String country;
	private String category;
	 
	@Override
	public String toString() {
		return "Pagecount [pageSize=" + pageSize + ", page=" + page + ", country=" + country + ", category=" + category
				+ "]";
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
}
