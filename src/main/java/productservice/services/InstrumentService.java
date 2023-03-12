package productservice.services;

import productservice.dao.InstrumentDao;
import productservice.entities.Instrument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import productservice.entities.dto.InstrumentDto;

import static productservice.entities.dto.builder.InstrumentDtoBuilder.responseInstrumentDtoBuilder;

@Service
public class InstrumentService {


    @Autowired

    private InstrumentDao instrumentDao;

    public Instrument save(Instrument instrument){return instrumentDao.save(instrument);}

    public InstrumentDto findInstrumentByProductId(Long productId){
           InstrumentDto foundInstrument = responseInstrumentDtoBuilder(instrumentDao.findInstrumentByProductId(productId));
        return foundInstrument;
    }
}
