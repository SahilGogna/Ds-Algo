package com.sahil.microservices.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sahil.microservices.currencyexchangeservice.ExchangeValue;

public interface CurrencyExchangeRepository extends JpaRepository<ExchangeValue, Long> {

	ExchangeValue findByFromAndTo(String from, String to);
}
