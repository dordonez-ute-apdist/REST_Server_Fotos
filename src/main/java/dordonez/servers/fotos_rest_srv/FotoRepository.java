package dordonez.servers.fotos_rest_srv;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FotoRepository extends JpaRepository<Foto, Long> {
    @Query("SELECT f.id, f.titulo, f.descripcion FROM Foto f")
    public List<Object[]> getList();
}
