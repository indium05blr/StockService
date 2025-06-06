package com.oms.stock.stock.controller;

import com.oms.stock.stock.entity.Stock;
import com.oms.stock.stock.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/stocks")
public class StockController {

    @Autowired
    private StockService stockService;

    @GetMapping
    public List<Stock> getAllStocks() {
        return stockService.getAllStocks();
    }

    @GetMapping("/{id}")
    public Optional<Stock> getStockById(@PathVariable int id) {
        return Optional.ofNullable(stockService.getStockById(id)
                .orElseThrow(() -> new RuntimeException("Stock Not Found")));
    }

    @PostMapping("/save")
    public Stock addOrUpdateStock(@RequestBody Stock stock) {
        return stockService.addOrUpdateStock(stock);
    }
}
