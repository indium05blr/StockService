package com.oms.stock.stock.repo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class StockPriceUpdateEvent {
    private String symbol;
    private BigDecimal newPrice;
    private LocalDateTime updatedAt;

    public StockPriceUpdateEvent(String symbol, BigDecimal newPrice, LocalDateTime updatedAt) {
        this.symbol = symbol;
        this.newPrice = newPrice;
        this.updatedAt = updatedAt;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public BigDecimal getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(BigDecimal newPrice) {
        this.newPrice = newPrice;
    }
}
