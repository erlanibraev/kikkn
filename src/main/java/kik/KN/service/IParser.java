package kik.KN.service;

import kik.KN.model.MKvartira;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Создал Ибраев Ерлан 10.01.17.
 */
public interface IParser<T> {
    public List<T> scan();
    public List<T> scanPages(String url) throws IOException;
    public Map<String, T> scanPage(Document current, Long regionId);
    public Map<String, T> getItems(Document current);
    public void setOneDay(Boolean oneDay);
}
