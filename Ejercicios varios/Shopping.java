/* Una tienda de ropa está ofreciendo una promoción en la que se aplica un descuento del 15% sobre el precio original de cada prenda. Si una camiseta cuesta $25 y un pantalón cuesta $30, ¿Cuál será el precio total de ambas prendas después de aplicar el descuento? Además, si se compra una segunda camiseta, se aplica un descuento adicional del 5% sobre el precio ya descuento de la primera camiseta. */

public class Shopping
{
    public static void main(String[] args) {
        float discount = 0.85f;
        final int TSHIRT = 25;
        final int PANTS = 30;
        
        float withDiscount = ((TSHIRT + PANTS) * discount);
        System.out.println("El total de ambas con el descuento es: $" + withDiscount);
        
        //Compra una segunda camiseta
        float discountTshirt = TSHIRT*discount;
        discount += 0.1;
        float total = discountTshirt + (discountTshirt*discount);
        
        System.out.println("El precio de las camisas es: $" + total);
        
        
        
    }
}