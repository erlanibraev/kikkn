package kik.KN.service.impl;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Создал Ибраев Ерлан 07.01.17.
 */
public abstract class AbstractParser {

    protected Element getPaginator(Document doc) throws IOException {
        return doc
                .select(".paginator")
                .first();
    }

    protected String getNextPageGref(Element paginator) {
        String result = null;
        Element next = paginator
                .select(".next")
                .first();
        result = next != null ? next.attr("abs:href") : null;
        return result;
    }

    protected String getHref(Element element) {
        String result = null;
        Element href= element
                .select("a[href]")
                .first();
        result = href != null ? href.attr("abs:href") : null;
        return result;
    }

    protected List<String> getItemsUrls(Document doc) throws IOException {
        List<String> result = new ArrayList<>();
        doc
                .select(".results-list")
                .forEach(element -> {
                    element.select(".results-item")
                            .forEach(element1 -> {
                                String href = getHref(element1);
                                if(href != null && !href.isEmpty()) {
                                    result.add(href);
                                }
                            });

                });
        return result;
    }

    protected Document getDocument(String url) throws IOException {
        return Jsoup.connect(url).timeout(10000).get();
    }

}
