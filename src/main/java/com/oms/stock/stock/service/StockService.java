package com.oms.stock.stock.service;

import com.oms.stock.stock.entity.Stock;
import com.oms.stock.stock.repo.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    public List<Stock> getAllStocks() {
        return stockRepository.findAll();
    }

    public Optional<Stock> getStockById(int id) {
        return stockRepository.findById(id);
    }

    public Stock addOrUpdateStock(Stock stock) {
        return stockRepository.save(stock);
    }

}
