package article;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import article.dto.GetTime;

public class Main {
	public static void main(String[] args) {
		List<Article> articles = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int lastArticleId = 0;
		
		System.out.println("===== 프로그렘 시작 =====");
		while(true) {
			System.out.print("명령어 ) "); 
			
			String cmd = sc.nextLine();
			
			if (cmd.startsWith("article write")) {
				System.out.printf("게시물 제목 : ");
				String title = sc.nextLine();
				System.out.printf("게시물 내용 : ");
				String body = sc.nextLine();
				int id = lastArticleId+1;
				Article article = new Article(id, title, body);
				articles.add(article);
				lastArticleId = id;
				System.out.printf("%d 번째 게시물이 생성되었습니다. %n", article.id);
			}else if (cmd.startsWith("exit")) {
				System.out.printf("프로그램을 종료합니다. %n");
				sc.close();
				break;
			}
		}
	}
}

class Article{
	int id;
	String regDate;
	String title;
	String body;
	
	Article(int id, String title, String body){
		this.id = id;
		this.title = title;
		this.body = body;
		this.regDate = GetTime.regDate();
	}
		
//	Article(){
//		this(lastId + 1, "2023-12-12 12:12:12");
//		lastId++;
//	}
}
	

