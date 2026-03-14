package parser;

import org.jsoup.Jsoup; //основная библиотека парсинга. отсюда: connect(),  get().
import org.jsoup.nodes.Element; //штмль. отсюда: тип для найденных элементов
import org.jsoup.nodes.Document; //отсюда: Тип переменной doc - Document (HTML документ)
import java.io.IOException; //обработка ошибок сети. try-catch тсюда
import models.DogBreed;

public class DogBreedParser {
    private static final String base_url = "https://www.purina.ru"; //базовый урл сайта. для формирования полных ссылок

    public DogBreed parseDog(String url){ //принимает урл конкретной породы и возвр заполненный объект models.DogBreed
        try{
            Document doc = Jsoup.connect(url).get(); //загружает HTML страницу по URL
            models.DogBreed breed = new models.DogBreed();

            //ищем конкретный штмль элемент, находя первый подходящий элемент и извлекая текстовое содержимое.
            Element nameDog = doc.selectFirst("#block-ttt-mainpagecontent > div > div.breed-details > div.component-wrapper > div > div > div > div > div.hero-small--content-area-wrapper > div.hero-small--content-area.hero-small--breed.hero-small--breed__dog > div > h1");
            if (nameDog != null){ //нашел ли Jsoup элемент на странице
                String name = nameDog.text();
                breed.setName(name); //сохраняет название в объект модели DogBreed
            }else{
                System.out.println("Не удалось найти название породы((");}


            Element descriptionDog = doc.selectFirst("#block-ttt-mainpagecontent > div > div.breed-details > div.component-wrapper > div > div > div > div > div.hero-small--content-area-wrapper > div.hero-small--content-area.hero-small--breed.hero-small--breed__dog > div > div.hero-small--content-area-intro > div > p");
            if (descriptionDog != null){
                String description = descriptionDog.text();
                breed.setDescript(description);
            }else{
                System.out.println("Не удалось найти описание породы((");}


            //получает значение атрибута src (ссылка на изображение)
            Element picture = doc.selectFirst("#block-ttt-mainpagecontent > div > div.breed-details > div.component-wrapper > div > div > div > div > div.hero-small--image > div > picture > img");
            if (picture != null){
                breed.setPict(base_url + picture.attr("src")); //формируем полный урл
            }else{
                System.out.println("Не удалось найти картиночку породы((");}
            return breed;

        }catch(IOException e){ //ловит все исключения и возвр нулл в случае ошибки
            e.printStackTrace();
            return null;
        }
    }
}
