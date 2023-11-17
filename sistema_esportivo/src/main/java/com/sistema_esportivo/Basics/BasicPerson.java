package com.sistema_esportivo.Basics;

public class BasicPerson {

    protected String name;
    protected String age;
    protected String nationality;

    @Override
    public String toString() {
        return  "Nome da Pessoa: " + name + '\n' +
                "Idade: " + age + '\n' +
                "Nacionalidade: " + nationality + '\n';
    }

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    public String getAge() { return this.age; }
    public void setAge(String age) { this.age = age; }

    public String getNationality() { return this.nationality; }
    public void setNationality(String nationality) { this.nationality = nationality; }
}
