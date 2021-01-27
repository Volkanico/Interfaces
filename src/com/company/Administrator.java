package com.company;

public class Administrator implements Management {

    private String nom;
    private String project;

    public Administrator(String nom, String project) {
        this.nom = nom;
        this.project = project;
    }

    public void plan() {
        System.out.println(this.nom + " ha fet una planificacióp del projecte " + this.project);
    }

    public void hire(Employee e) {

    }

}
