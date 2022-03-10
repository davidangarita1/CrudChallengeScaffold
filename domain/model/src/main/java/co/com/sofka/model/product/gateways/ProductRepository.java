package co.com.sofka.model.product.gateways;

import co.com.sofka.model.product.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductRepository {
    Mono<String> create(Product product);
    Mono<Product> read(String id);
    Mono<String> update(String id, Product product);
    Mono<Void> delete(String id);
    Flux<Product> getAll();
}
