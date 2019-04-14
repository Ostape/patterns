package com.robosh.copy;

public class WikiFactory {
    private WikiPage wikiPage;

    public WikiFactory(WikiPage wikiPage) {
        this.wikiPage = wikiPage;
    }

    public void setWikePage(WikiPage wikiPage) {
        this.wikiPage = wikiPage;
    }

    public WikiPage clonePage() {
        return (WikiPage) wikiPage.copy();
    }

    public WikiPage getNotChangedWikiPage() {
        return (WikiPage) wikiPage.copy();
    }
}
