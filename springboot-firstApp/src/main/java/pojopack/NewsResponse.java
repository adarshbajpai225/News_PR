package pojopack;

import java.util.Arrays;


public class NewsResponse {
	
	
	private String status;
    private int totalResults;
    private Article[] articles;
    @Override
	public String toString() {
		return "NewsResponse [status=" + status + ", totalResults=" + totalResults + ", articles="
				+ Arrays.toString(articles) + "]";
	}
    
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTotalResults() {
		return totalResults;
	}
	public void setTotalResults(int totalResults) {
		this.totalResults = totalResults;
	}
	public Article[] getArticles() {
		return articles;
	}
	public void setArticles(Article[] articles) {
		this.articles = articles;
	}

}
