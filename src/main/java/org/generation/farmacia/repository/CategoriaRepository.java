package org.generation.farmacia.repository;

import java.util.List;
import org.generation.farmacia.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	
	public List<Categoria>findAllByTipoContainingIgnoreCase(@Param("tipo") String tipo);
}
