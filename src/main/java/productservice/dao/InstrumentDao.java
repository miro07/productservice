package productservice.dao;

import productservice.entities.Instrument;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstrumentDao extends JpaRepository<Instrument, Long> {
    Instrument findInstrumentByProductId(Long productId);
}
