package pl.edu.wsb_nlu.java.lecture8.annotations;

import java.util.List;

public class Deprecation {
    private final List<String> versions;
    @Deprecated
    public void addVersion(String version) {
        versions.add(version);
    }
    Deprecation(List<String> list) {
        this.versions = list;
    }
}
