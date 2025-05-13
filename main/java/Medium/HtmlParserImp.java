package Medium;

import java.util.ArrayList;
import java.util.List;

public class HtmlParserImp implements HtmlParser{
    @Override
    public List<String> getUrls(String a) {

        List<String> listUrls = new ArrayList<>();
        listUrls.add("http://news.yahoo.com");
        listUrls.add("http://news.yahoo.com/news");
        listUrls.add("http://news.yahoo.com/news/topics");
        listUrls.add("http://news.google.com");
        listUrls.add("http://news.yahoo.com/us");
        return listUrls;
    }
}
