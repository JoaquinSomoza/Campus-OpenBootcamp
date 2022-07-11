package ejerciciosTema5;

public class Main {
    static CocheCRUD cocheCrud = new CocheCRUDImpl();

    public static void main(String[] args) {
        cocheCrud.save(new Coche());
        cocheCrud.findAll();
        cocheCrud.delete(new Coche());

    }
}
