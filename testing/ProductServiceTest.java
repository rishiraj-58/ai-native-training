public class ProductServiceTest {
    @Mock
    ProductRepository productRepository;
    @InjectMocks
    ProductService productService;

    @Test
    void shouldReturnProductWhenFound() {
        Product product = new Product(1L, "Laptop");
        when(productRepository.findById(1L)).thenReturn(Optional.of(product));
        Product result = productService.findProduct(1L);
        assertEquals(product, result);
    }

    @Test
    void shouldThrowExceptionWhenNotFound() {
        when(productRepository.findById(1L)).thenReturn(Optional.empty());
        assertThrows(ProductNotFoundException.class, () -> productService.findProduct(1L));
    }
}