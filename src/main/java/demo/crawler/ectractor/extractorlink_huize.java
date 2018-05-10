package demo.crawler.ectractor;

import demo.crawler.utils.Connect;
import demo.crawler.utils.GetDoc;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class extractorlink_huize {

  private static final String BASE_URL = "http://xuexi.huize.com/insurancefaq/questionsmallclass-2-21-1-";
  private static final String PREFIX = "http://xuexi.huize.com";
  private static int pageCount;

  static {
    pageCount = getPageCount();
  }

  public static List<String> getAllUrl() {
    List<String> list = new ArrayList<>();
    //max page number
    int pageNum = 696;
    for (int i = 1; i <= pageNum; i++) {
      String targetUrl = BASE_URL + i + ".html";
      list.addAll(getUrl(targetUrl));
    }
    return list;
  }

  private static List<String> getUrl(String targetUrl) {
    Document doc = GetDoc.getdoc(targetUrl, 3000, 0, 2);
    doc.select("span[class=qas-r2 mt20 pt20 bt-dd]").remove();
    Elements select = doc.select("div[class=fl qas-w6 pt10 pb20 lh26]").select("span[class^=qas-r2]");
    List<String> list = new ArrayList<String>();
    for (Element temp : select) {
      String url = temp.select("a").first().attr("href");
      list.add(PREFIX + url);
    }
    return list;
  }

  public static int getPageCount() {
    Document doc = Jsoup.parse(Connect.SendGET(BASE_URL + "1.html"));
    System.out.println(doc.select("input#maxRowCount").attr("value"));
    return Integer.valueOf(doc.select("input#maxRowCount").attr("value"));
  }
}
