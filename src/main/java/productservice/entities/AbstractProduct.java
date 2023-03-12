package productservice.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
//abstraction

@MappedSuperclass
public abstract class AbstractProduct{

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long productId;
        @Column
        private LocalDateTime publishDate;

        @Column
        private LocalDate modelDate;

        @Column
        private BigDecimal rentCost;

        @Column
        private BigDecimal price;

        public AbstractProduct() {
        }

        public AbstractProduct(LocalDateTime publishDate, LocalDate modelDate, BigDecimal rentCost, BigDecimal price) {
                this.publishDate = publishDate;
                this.modelDate = modelDate;
                this.rentCost = rentCost;
                this.price = price;
        }

        public Long getProductId() {
                return productId;
        }

        public void setProductId(Long productId) {
                this.productId = productId;
        }

        public LocalDate getModelDate() {
                return modelDate;
        }

        public void setModelDate(LocalDate orderDate) {
                this.modelDate = orderDate;
        }


        public LocalDateTime getPublishDate() {
                return publishDate;
        }

        public void setPublishDate(LocalDateTime publishDate) {
                this.publishDate = publishDate;
        }

        public BigDecimal getRentCost() {
                return rentCost;
        }

        public void setRentCost(BigDecimal rentCost) {
                this.rentCost = rentCost;
        }

        public BigDecimal getPrice() {
                return price;
        }

        public void setPrice(BigDecimal price) {
                this.price = price;
        }

}