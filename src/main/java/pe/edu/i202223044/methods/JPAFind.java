package pe.edu.i202223044.methods;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202223044.entity.Country;
import pe.edu.i202223044.entity.City;

import java.util.ArrayList;
import java.util.List;

public class JPAFind {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();

        //CODIGO PA BUSCAR
        Country peru = em.find(Country.class, "PER");

        if (peru != null) {
            List<City> ciudades = peru.getCities();
            List<String> ciudadPopulares = new ArrayList<>();
            for (City city : ciudades) {
                if (city.getPopulation() > 700000) {
                    ciudadPopulares.add(city.getName());
                }
            }
            if (!ciudadPopulares.isEmpty()) {
                System.out.println("CIUDADES PERUANAS CON MAYOR POBLACIÓN A 700 000: ");
                ciudadPopulares.forEach(System.out::println);
            } else {
                System.out.println("NO HAY CIUDADES PERUANOS CON MAYOR POBLACIÓN A 700 000.");
            }
        } else {
            System.out.println("NO SE ENCONTRO EL PAIS CON EL CODE 'PER'");
        }

        em.close();
        emf.close();
    }
}
