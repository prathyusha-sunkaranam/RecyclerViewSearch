package com.example.mansopresk01.recyclerviewsearch;

import java.io.Serializable;

/**
 * Created by Mansopresk01 on 3/13/2018.
 */

public class Model implements Serializable {
    private String name;
    private String version;

    public Model(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
