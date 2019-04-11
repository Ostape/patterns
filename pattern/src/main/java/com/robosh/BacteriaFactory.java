package com.robosh;

import java.util.HashMap;
import java.util.Map;

public class BacteriaFactory {
    private static final Map<String, Bacteria> bacterias = new HashMap<String, Bacteria>();

    public Bacteria getBacteria(String typeBacteria){
        Bacteria bacteria = bacterias.get(typeBacteria);

        if (bacteria == null){
            switch (typeBacteria){
                case "Actinobacteria":
                    bacteria = new Actinobacteria();
                    break;

                case "Chloroflexi":
                    bacteria = new Chloroflexi();
                    break;

                case "Firmicutes":
                    bacteria = new Firmicutes();
                    break;

                case "Spirochaetes":
                    bacteria = new Spirochaetes();
                    break;
            }
            bacterias.put(typeBacteria, bacteria);
        }
        return bacteria;
    }

}
