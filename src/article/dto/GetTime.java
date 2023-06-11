package article.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetTime {
	public static String regDate() {
		Date date = new Date();
		SimpleDateFormat dateForm = new SimpleDateFormat("YYYY-MM-DD hh:mm:ss");
		String regDate = dateForm.format(date);
		System.out.printf("%s입니다.", regDate);
		return regDate;
	}
}
