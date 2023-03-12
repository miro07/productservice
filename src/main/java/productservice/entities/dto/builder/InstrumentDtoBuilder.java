package productservice.entities.dto.builder;

import productservice.entities.Instrument;
import productservice.entities.dto.InstrumentDto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class InstrumentDtoBuilder {

    InstrumentDto instrumentDto;

    public InstrumentDtoBuilder() {
        instrumentDto = new InstrumentDto();
    }

    public InstrumentDtoBuilder withProductId(Long productId){
        instrumentDto.setProductId(productId);
        return this;
    }
    public InstrumentDtoBuilder withPublishDate(LocalDateTime publishDate) {
        instrumentDto.setPublishDate(publishDate);
        return this;
    }
    public InstrumentDtoBuilder withModelDate(LocalDate modelDate) {
        instrumentDto.setModelDate(modelDate);
        return this;
    }
    public InstrumentDtoBuilder withRentCost(BigDecimal rentCost) {
        instrumentDto.setRentCost(rentCost);
        return this;
    }
    public InstrumentDtoBuilder withPrice(BigDecimal price) {
        instrumentDto.setPrice(price);
        return this;
    }
    public InstrumentDtoBuilder withInstrumentName(String instrumentName) {
        instrumentDto.setInstrumentName(instrumentName);
        return this;
    }
    public InstrumentDtoBuilder withInstrumentType(String instrumentType) {
        instrumentDto.setInstrumentType(instrumentType);
        return this;
    }
    public InstrumentDtoBuilder withInstrumentBrand(String instrumentBrand) {
        instrumentDto.setInstrumentBrand(instrumentBrand);
        return this;
    }
    public InstrumentDto build(){
        return instrumentDto;
    }
    public static InstrumentDto responseInstrumentDtoBuilder(Instrument instrument){
        return new InstrumentDtoBuilder()
                .withProductId(instrument.getProductId())
                .withPublishDate(instrument.getPublishDate())
                .withModelDate(instrument.getModelDate())
                .withPrice(instrument.getPrice())
                .withRentCost(instrument.getRentCost())
                .withInstrumentName(instrument.getInstrumentName())
                .withInstrumentType(instrument.getInstrumentType())
                .withInstrumentBrand(instrument.getInstrumentBrand())
                .build();
    }
}