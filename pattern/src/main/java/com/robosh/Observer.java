package com.robosh;

import java.util.List;

public interface Observer {
    public void handleEvent(List<String> newspapers);
}
