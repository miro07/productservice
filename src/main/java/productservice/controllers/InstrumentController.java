package productservice.controllers;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import productservice.entities.Instrument;
import productservice.entities.dto.InstrumentDto;
import productservice.entities.dto.ProductDto;
import productservice.services.InstrumentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/instruments")
public class InstrumentController {

    private static final Logger log = LoggerFactory.getLogger(InstrumentController.class);

    @Autowired
    private InstrumentService instrumentService;

    @PostMapping("")
    public ResponseEntity<?> addInstrument(@RequestBody InstrumentDto instrumentDto) {
        log.info("Adding an instrument");

        try {
            Instrument instrument = new Instrument(LocalDateTime.now(), instrumentDto.getModelDate(), instrumentDto.getRentCost(), instrumentDto.getPrice()
                                                    , instrumentDto.getInstrumentName(), instrumentDto.getInstrumentType(), instrumentDto.getInstrumentBrand());
            Instrument savedInstrument = instrumentService.save(instrument);
            instrumentDto.setProductId(savedInstrument.getProductId());
            return ResponseEntity.ok(instrumentDto);
        } catch (Exception e) {
            log.error("Error occurred while adding an instrument: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/{productId}")
    public InstrumentDto getInstrumentByProductId(@PathVariable Long productId){
        log.info("get my instrument by user's id");
        return instrumentService.findInstrumentByProductId(productId);

    }


}
