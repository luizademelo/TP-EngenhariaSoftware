package com.sistema_esportivo;

public class Rule {
    
    private String title;
    private String description;

    public Rule(String title, String description){
        this.title = title; 
        this.description = description; 
    }

    @Override
    public String toString(){
        return "Regra: " + this.title + "\nDescrição: " + this.description + "\n"; 
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
