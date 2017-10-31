package org.springInAction.springIdol.stages;

import java.math.BigDecimal;

public class Ticket {

    private BigDecimal price;

    public Ticket(){
    }

    public Ticket(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
