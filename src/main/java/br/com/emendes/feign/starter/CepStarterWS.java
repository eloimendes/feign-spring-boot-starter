package br.com.emendes.feign.starter;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="cepStarter", url="${cep.endpoint}")
public interface CepStarterWS {

    @GetMapping("/{cep}/json/")
    Cep findByCep(@PathVariable("cep") String cep);
}
