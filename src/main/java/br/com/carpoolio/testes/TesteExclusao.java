package br.com.carpoolio.testes;

import br.com.carpoolio.Entity.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class TesteExclusao {

	public static void main(String[] args) {
		EntityManager em = null;
		
		try {
			em = Persistence.createEntityManagerFactory("carpoolio").createEntityManager();
			
			Usuario consultaUsuario = em.find(Usuario.class, 1);
			
			em.remove(consultaUsuario);
			
			em.getTransaction().begin();
			em.getTransaction().commit();
		
		}catch (Exception e) {
			if(em != null && em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			e.printStackTrace();
		}finally {
			if(em != null) {
				em.close();
			}
			System.exit(0);
			
		}
	}

}
