package ejerciciosTema5;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{
        public void  save(Coche coche){
            System.out.println("Imprimiendo metodo save");
        }

    @Override
    public List<Coche> findAll() {
        System.out.println("Imprimiendo metodo findAll");
        return null;
    }

    @Override
    public void delete(Coche coche) {
        System.out.println("Imprimiendo metodo delete");
    }


}



