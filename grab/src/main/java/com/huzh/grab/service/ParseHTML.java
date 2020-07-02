package com.huzh.grab.service;

import cn.hutool.http.HttpUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * @author huzh
 * @date 2020/7/2 9:46
 */
public class ParseHTML {

    public static void parseBook(String content, String TxtName) {

        Document document = Jsoup.parse(content);
        Element body = document.body();
        Elements bookList = body.getElementById("booklist").children();

        //设置一个容器，用于装各个属性
        StringBuilder sb = new StringBuilder();

        for (Element li : bookList) {
            String href = li.select("a").attr("href");
            String title = li.select("a").attr("title");
            System.out.println(href + " : " + title);

            String txt = parseBookTxt(href);
            //向容器中添加属性
            sb.append(title);
            sb.append("\r\n");
            sb.append(txt);
            sb.append("\r\n");

            try {
                WriteTo.writeTo(sb.toString(), TxtName);
                sb.setLength(0);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static String parseBookTxt(String txtUrl) {
        Document document = Jsoup.parse(HttpUtil.get(txtUrl));
        Element content = document.getElementById("content");
        String text = content.wholeText().trim();
        return text;
    }
}
