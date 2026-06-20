public class ProductNotFoundException extends RuntimeException {
    private final Long id;

    public ProductNotFoundException(Long id) {
        super("Product not found: " + id);
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}