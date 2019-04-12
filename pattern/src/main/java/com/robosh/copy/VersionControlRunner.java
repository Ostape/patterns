package com.robosh.copy;

public class VersionControlRunner {
    public static void main(String[] args) {
        Wikipedia wikipedia = new Wikipedia();
        wikipedia.addWikiPages(
                new WikiPage(1, "Flowers", "A flower, sometimes known as a " +
                        "bloom or blossom,is the reproductive structure found in flowering plants")
        );
        wikipedia.addWikiPages(
                new WikiPage(2, "Cars", "A car (or automobile) is a wheeled " +
                        "motor vehicle used for transportation. ")
        );
        wikipedia.addWikiPages(
                new WikiPage(3, "Songs", "A song is a single (and often standalone) " +
                        "work of music that is typically")
        );


        System.out.println("Wiki-pages before changes");
        System.out.println(wikipedia.getWikiPages());


        WikiFactory wikiFactory = new WikiFactory(wikipedia.getWikiPages().get(1));//save
        wikipedia.deletePage(1);

        WikiPage temp = wikiFactory.clonePage();
        temp.setTitle("Another page");
        wikipedia.addWikiPages(temp);

        System.out.println("Wiki-pages after modify");
        System.out.println(wikipedia.getWikiPages());

        System.out.println("Show 'saved' in buffer page");
        System.out.println(wikiFactory.getNotChangedWikiPage());
    }

}
