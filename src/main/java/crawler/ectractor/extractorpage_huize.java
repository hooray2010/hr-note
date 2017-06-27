package crawler.ectractor;

import crawler.utils.GetDoc;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extractorpage_huize {

  public static Map<String, String> getQuesAns(List<String> list) {
    Map<String, String> map = new HashMap<>();
    for (String str : list) {
      Document doc = GetDoc.getdoc(str, 3000, 0, 2);
      String question = doc.title();
      Pattern p = Pattern.compile("(.+)(-慧择保险网)");
      Matcher matcher = p.matcher(question);
      if (matcher.find()) {
        question = matcher.group(1);
      }
      doc.select("p[class=fc8]").remove();
      Elements div = doc.select("div[class=qas-r3 mt10 pl10]").select("p");
      String answer = "";
      for (Element temp : div) {
        answer += temp.text();
      }
      map.put(question, answer);
    }
    return map;
  }

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("http://xuexi.huize.com/insurancefaq/detal-209322.html");
    Map<String, String> map = getQuesAns(list);
    for (Map.Entry<String, String> entry : map.entrySet()) {
      System.out.println(entry.getKey() + "---" + entry.getValue());
    }
  }
}
