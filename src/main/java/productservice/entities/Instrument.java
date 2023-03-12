package productservice.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Instrument extends AbstractProduct implements Serializable {


    public Instrument() {
    }

    public Instrument(LocalDateTime publishDate, LocalDate modelDate, BigDecimal rentCost, BigDecimal price, String instrumentName, String instrumentType, String instrumentBrand) {
        super(publishDate, modelDate, rentCost, price);
        this.instrumentName = instrumentName;
        this.instrumentType = instrumentType;
        this.instrumentBrand = instrumentBrand;
    }

    @Column
    private String instrumentName;

    @Column
    @NotBlank
    private String instrumentType;

    @Column
    private String instrumentBrand;




    public String getInstrumentName() {
        return instrumentName;
    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    public String getInstrumentBrand() {
        return instrumentBrand;
    }

    public void setInstrumentBrand(String instrumentBrand) {
        this.instrumentBrand = instrumentBrand;
    }
}
