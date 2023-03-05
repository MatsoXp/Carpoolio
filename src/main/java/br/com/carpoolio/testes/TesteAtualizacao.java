package br.com.carpoolio.testes;

import br.com.carpoolio.Entity.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class TesteAtualizacao {

	public static void main(String[] args) {
		EntityManager em = null;
		
		try {
			em = Persistence.createEntityManagerFactory("carpoolio").createEntityManager();
			
			Usuario consultaUsuario = em.find(Usuario.class, 1);
					
			consultaUsuario.setNome("joaozinho");
			consultaUsuario.setEmail("novoemail@gmail.com");
			consultaUsuario.setSenha("senhanova");
			consultaUsuario.setTelefone("44444444444");
			consultaUsuario.setCreditos(1500);
			
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
