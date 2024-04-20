public class Main {
    public static void main(String[] args) {
        // Crear instancias de diferentes tipos de vehículos
        Car sedan = new Sedan("123456", "Toyota", "Camry", 50000);
        Car utilityVehicle = new UtilityVehicle("789012", "Jeep", "Wrangler", 30000, true);
        Car truck = new Truck("345678", "Ford", "F-150", 70000, 10000.0);

        // Mostrar información de los vehículos
        System.out.println(sedan.getInfo());
        System.out.println(utilityVehicle.getInfo());
        System.out.println(truck.getInfo());

        IntArrayList arrayList = new IntArrayList();
        arrayList.add(5);
        arrayList.add(10);
        System.out.println("Element at index 0 in IntArrayList: " + arrayList.get(0));

        IntVector vector = new IntVector();
        vector.add(15);
        vector.add(20);
        System.out.println("Element at index 1 in IntVector: " + vector.get(1));

        TvSeries tvSeries = new TvSeries("Breaking Bad", 45, 62);
        Movie movie = new Movie("Inception", 148, 8.8);

        System.out.println("TV Series Info:");
        System.out.println(tvSeries.getInfo());

        System.out.println("\nMovie Info:");
        System.out.println(movie.getInfo());

        
    }
}

