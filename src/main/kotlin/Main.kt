class Product(val id: Int, val name: String, val price: Double, val description: String)

class ProductCatalog {
    private val products = mutableListOf<Product>()
    fun addProduct(product: Product) {
        products.add(product)
    }
    fun getProductById(id: Int): Product? {
        return products.find { it.id == id }
    }
    fun getProductByName(name: String): Product? {
        return products.find { it.name == name }
    }
    fun printCatalog() {
        products.forEach {
            println("Product ID: ${it.id}")
            println("Product Name: ${it.name}")
            println("Product Price: ${it.price}")
            println("Product Description: ${it.description}")
        }
    }
}

fun main(){
    val catalog = ProductCatalog()
    catalog.addProduct(Product(1, "Shampoo", 4.99, "A good shampoo"))
    catalog.addProduct(Product(2, "Toothpaste", 2.99, "A good toothpaste"))
    catalog.addProduct(Product(3, "Soap", 2.5, "A good Soap"))
    println("Product catalog:")
    catalog.printCatalog()
    val product=catalog.getProductByName("Shampoo")
    if(product!=null)
        println("\nProduct details of Shampoo: ${product.name}  ${product.price}")
    else
        println("product not found")
}