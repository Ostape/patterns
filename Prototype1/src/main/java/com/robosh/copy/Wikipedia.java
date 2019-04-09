package com.robosh.copy;

import java.util.HashMap;

public class Wikipedia {

    private HashMap<Integer, WikiPage> wikiPages;

    public Wikipedia(HashMap<Integer, WikiPage> wikiPages) {
        wikiPages = new HashMap<Integer, WikiPage>();
        this.wikiPages = wikiPages;
    }

    public Wikipedia(){
        wikiPages = new HashMap<Integer, WikiPage>();
    }

    public HashMap<Integer, WikiPage> getWikiPages() {
        return wikiPages;
    }

    public void setWikiPages(HashMap<Integer, WikiPage> wikiPages) {
        this.wikiPages = wikiPages;
    }

    public void deletePage(int id){
        wikiPages.remove(id);
    }

    public void addWikiPages(WikiPage wikiPage){
        wikiPages.put(wikiPage.getId(),wikiPage);
    }
}
