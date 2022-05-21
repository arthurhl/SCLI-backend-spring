package les.scli.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import les.scli.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer>{
    
}
