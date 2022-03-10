package co.com.sofka.usecase.product;

import co.com.sofka.model.product.Product;
import co.com.sofka.model.product.gateways.ProductRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class ProductUseCase {
    private ProductRepository repository;

    public Mono<String> create(Product product) {
        return repository.create(product);
    };

    public Mono<Product> read(String id) {
        return repository.read(id);
    };

    public Mono<String> update(String id, Product product) {
        return repository.update(id, product);
    };

    public Mono<Void> delete(String id) {
        return repository.delete(id);
    };

    public Flux<Product> getAll() {
        return repository.getAll();
    };
}
