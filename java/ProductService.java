public class ProductService {
    Map<Long, Product> db = Map.of(1L, new Product(1L, "Laptop"));
    public Product findProduct(Long id) {
            return db.get(id)
            .orElseThrow(() -> new ProductNotFoundException(id));
        
    }
}