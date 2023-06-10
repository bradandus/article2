package article;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Article> articles = new ArrayList<>();
		articles.add(new Article());

		articles.add(new Article());
		articles.add(new Article());

		for (int i = 0 ; i < articles.size() ; i++) {
			Article article = articles.get(i);
			System.out.println(article.id);
		}
	}
}

class Article{
	static int lastId;
	int id;
	String regDate;
	static {
		lastId = 0;
	}
	Article(int id, String regDate){
		this.id = id;
		this.regDate = regDate;
	}
	Article(){
		this(lastId + 1, "2023-12-12 12:12:12");
		lastId++;
	}
}
	
