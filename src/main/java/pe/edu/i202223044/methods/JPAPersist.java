package pe.edu.i202223044.methods;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202223044.entity.City;
import pe.edu.i202223044.entity.Country;
import pe.edu.i202223044.entity.CountryLanguage;
import pe.edu.i202223044.entity.CountryLanguageId;
import java.util.List;

public class JPAPersist {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();

        Country img_Alfheim = new Country();
        img_Alfheim.setCode("ALF");
        img_Alfheim.setName("Alfheim");
        img_Alfheim.setContinent("Oceania");
        img_Alfheim.setRegion("AlfeidRegion");
        img_Alfheim.setSurfaceArea(21453.7);
        img_Alfheim.setIndepYear(null);
        img_Alfheim.setPopulation(100000);
        img_Alfheim.setLifeExpectancy(85);
        img_Alfheim.setGnp(5000.0);
        img_Alfheim.setGnpOld(null);
        img_Alfheim.setLocalName("Alfhe");
        img_Alfheim.setGovernmentForm("Monarquia");
        img_Alfheim.setHeadOfState("Luna D' King");
        img_Alfheim.setCapital(126);
        img_Alfheim.setCode2("AL");

        //CIUDADES
        City city1 = new City(null,"Libertiny",img_Alfheim,"Liberland",50000);
        City city2 = new City(null,"Amestris",img_Alfheim,"Amesteris",30000);
        City city3 = new City(null,"Norwwy",img_Alfheim,"Northwis",20000);
        img_Alfheim.setCities(List.of(city1,city2,city3));

        //LENGUAJES
        CountryLanguage first_leng = new CountryLanguage(new CountryLanguageId("ALF","Alflist"),"T",14.6,img_Alfheim);
        CountryLanguage second_leng = new CountryLanguage(new CountryLanguageId("ALF","Neris"),"F",2.6,img_Alfheim);
        img_Alfheim.setLanguages(List.of(first_leng,second_leng));

        //PERSIST
        em.getTransaction().begin();
        em.persist(img_Alfheim);
        em.getTransaction().commit();
        em.close();
        emf.close();
        System.out.println("PAIS IMAGINARIO AGREGADO CON EXITO");
    }
}
