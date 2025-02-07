package entity;

import java.util.ArrayList;
import java.util.List;

public class PanierEntity {
	
	private int id;
	private int userId;
	private List<ArticleEntity> articles = new ArrayList<>();

	
	// constructeurs
	public PanierEntity() {};
	
	public PanierEntity(int id, int userId) {
		this.id = id;
		this.userId= userId;
		this.articles = new ArrayList<>();
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public List<ArticleEntity> getArticles() {
		return articles;
	}

	public void setArticles(List<ArticleEntity> articles) {
		this.articles = articles;
	}

	

}
