package Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

class Crawler implements Runnable{

    String startUrl;
    String hostname;
    HtmlParser htmlParser;
   public static Set<String> result;

    Crawler(String startUrl, String hostname,HtmlParser htmlParser){

        this.startUrl = startUrl;
        this.hostname = hostname;
        this.htmlParser = htmlParser;
    }
public void method1(){

   /* void method2(){

    }*/

}
    @Override
    public void run() {
        System.out.println("run method executed");
        if(startUrl.startsWith(hostname)&&(!result.contains(startUrl))){
            result.add(startUrl);
            List<Thread> threads = new ArrayList<>();

           for( String url :htmlParser.getUrls(startUrl)) {
               Crawler crawl = new Crawler(url, hostname, htmlParser);
               Thread t = new Thread(crawl);
               System.out.println(""+t.getName());
               t.start();
               threads.add(t);
           }
           //System.out.println(Thread.activeCount());
           for(Thread thread:threads){
               joinThreads(thread);
           }

        }
    }
    public void joinThreads(Thread thread){

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class WebCrawlerMultithreaded1242 {


    public List<String> crawl(String startUrl, HtmlParser htmlParser) {


        int index = startUrl.indexOf('/',7);

        String hostname = index == -1? startUrl:startUrl.substring(0,index);
        Crawler crawler = new Crawler(startUrl, hostname, htmlParser);
        ConcurrentHashMap<String,Boolean> visited= new ConcurrentHashMap<>();
        System.out.println("visited.newKeySet()="+visited.newKeySet());
        crawler.result = visited.newKeySet();
        Thread t1 = new Thread(crawler);
        t1.start();

        crawler.joinThreads(t1);
        return new ArrayList<>(crawler.result);
    }
    //startUrl = "http://news.yahoo.com"
    public static void main(String[] args){
    String startUrl = "http://news.yahoo.com";
    WebCrawlerMultithreaded1242 webCrawl = new WebCrawlerMultithreaded1242();
    HtmlParser parser = new HtmlParserImp();
    List<String> list= webCrawl.crawl(startUrl,parser);
    list.stream().forEach(System.out::println);
    }
}
