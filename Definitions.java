package com.example.MyProject1;

import java.util.List;

public class Definitions {
    String Definition ="";
    String Example ="";
    List<String> Synonyms = null;
    List<String> Antonyms = null;

    public List<String> getSynonyms() {
        return Synonyms;
    }

    public void setSynonyms(List<String> synonyms) {
        Synonyms = synonyms;
    }

    public List<String> getAntonyms() {
        return Antonyms;
    }

    public void setAntonyms(List<String> antonyms) {
        Antonyms = antonyms;
    }

    public String getDefinition() {
        return Definition;
    }

    public void setDefinition(String definition) {
        Definition = definition;
    }

    public String getExample() {
        return Example;
    }

    public void setExample(String example) {
        Example = example;
    }
}
