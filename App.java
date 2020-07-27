package WebCrawler;

import java.io.IOException;

public class App {

    public static void main(String[] args) {


        String root = "http://www.bbc.com";

        WebCrawler bfs = new WebCrawler();
        bfs.discoverWeb(root);
    }



}
