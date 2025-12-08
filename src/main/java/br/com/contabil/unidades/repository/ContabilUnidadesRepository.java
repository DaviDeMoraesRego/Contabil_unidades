package br.com.contabil.unidades.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.contabil.unidades.entity.ContabilUnidadesEntity;

@Repository
public interface ContabilUnidadesRepository extends JpaRepository<ContabilUnidadesEntity, Integer>{

	@Query(value = "SELECT * FROM tab_unidades WHERE course_id = :courseId ORDER BY ordem ASC", nativeQuery = true)
	List<ContabilUnidadesEntity> findAllByCourseId (@Param("courseId") int courseId);
}
