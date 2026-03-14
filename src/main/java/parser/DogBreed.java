package parser; //DTO (Data Transfer Object) - объект для передачи данных

public class DogBreed{

    private String name;
    private String description;
    private String picture;

    public DogBreed(){} //конструктор создающий объекты вручную при парсинге. данные заполняются постепенно и могут быть нулптр

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getDescription() {return description;}
    public void setDescription(String description) { this.description = description;}

    public String getPicture() {return picture;}
    public void setPicture(String picture) {this.picture = picture;}
}
