package pe.edu.i202223044.methods;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202223044.entity.Country;

public class JPARemove {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();

        Country img_Alfheim = em.find(Country.class, "ALF");

        if (img_Alfheim != null) {
            em.getTransaction().begin();
            em.remove(img_Alfheim);
            em.getTransaction().commit();
            System.out.println("PAIS IMAGINARIO FUE ELIMINIADO DE MANERA EXITOSA");
        } else {
            System.out.println("El país con el código ALF no se encontró.");
        }

        em.close();
        emf.close();
    }
}
