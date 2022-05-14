public class App {
    public static void main(String[] args) throws Exception {
        //PRIMO METODO
        // int[] numeri = new int[3];
        Persona[] persone = new Persona[3];
        Persona persona1 = new Persona("Luca", "Rossi", 25, "blue");
        Persona persona2 = new Persona("Luca", "Rossi", 25, "blue");
        Persona persona3 = new Persona("Luca", "Rossi", 25, "blue");

        persone[0] = persona1;
        persone[1] = persona2;
        persone[2] = persona3;
        
        //SECONDO METODO
        // int[] prova = {1, 2, 3};
        //Persone[] persona = {pesona1, persona2, persona3}; 

        System.out.println(persone[0].nome);


    }
}
