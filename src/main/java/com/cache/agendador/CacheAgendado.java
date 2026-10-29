package com.cache.agendador;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Component 
@Log4j2 
public class CacheAgendado {

    @Scheduled(fixedDelay = 30, timeUnit = TimeUnit.SECONDS)
    @CacheEvict("empresas")
    public void limparCacheEmpresa(){
        log.info("Cache de empresas limpo: " + LocalDateTime.now());
    }
}
