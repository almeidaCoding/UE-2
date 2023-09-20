package POO;

// Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza
// se necesita saber el tamaño - mediana o familiar - el tipo - margarita, cuatro
// quesos o funghi - y su estado - pedida o servida. La clase debe almacenar
// información sobre el número total de pizzas que se han pedido y que se
// han servido. Siempre que se crea una pizza nueva, su estado es “pedida”

public class PedidosPizza {
    public static void main(String[] args) {
       Pizza pizzaCliente1 = new Pizza("Mediana, ", "Margarita, ");
       Pizza pizzaCliente2 = new Pizza("Familiar, ", "Hawaiana, ");
       Pizza pizzaCliente3 = new Pizza("Mediana, ", "Pepperonni, ");
       Pizza pizzaCliente4 = new Pizza("Familiar, ", "Margarita, ");

       pizzaCliente1.setTotalPizzasPedidas();
       pizzaCliente2.setTotalPizzasPedidas();
       pizzaCliente3.setTotalPizzasPedidas();
       pizzaCliente4.setTotalPizzasPedidas();
       System.out.println(Pizza.getTotalPedidas());

       System.out.println(pizzaCliente1.getDatosPizza() + "\n" + pizzaCliente2.getDatosPizza() + "\n" + pizzaCliente3.getDatosPizza() + "\n" + pizzaCliente4.getDatosPizza());

       pizzaCliente1.setTotalPizzasServidas();
       pizzaCliente2.setTotalPizzasServidas();
       pizzaCliente3.setTotalPizzasServidas();
       System.out.println(Pizza.getTotalServidas());
    
    }
}

class Pizza{
    private String tamaño;
    private String tipo;
    private String estado;


    private static int totalPizzasPedidas;
    private static int totalPizzasServidas;

    public Pizza(String tamaño, String tipo){
        this.tamaño = tamaño;
        this.tipo = tipo;
        estado = "Pedida";
    }

    public void setTotalPizzasPedidas(){
        if(estado.equals("Pedida")){
            totalPizzasPedidas++;
        }else{
            System.out.println("No se han realizado pedidos");
        }
    }

    public void setTotalPizzasServidas(){
        if(estado.equals("Pedida")){
            estado = "Servida";
            totalPizzasServidas++;
        }else{
            System.out.println("Aún no se han servido las pizzas pedidas");
        }
    }

    public static String getTotalServidas(){
        return "El número total de pizzas servidas es: " + totalPizzasServidas;
    }

    public static String getTotalPedidas(){
        return "El número total de pizzas pedidas es: " + totalPizzasPedidas;
    }

    public String getDatosPizza(){
        return "Especificaciones de la pizza: " + tamaño + tipo + estado + ".";
    }
}


    

    

    


