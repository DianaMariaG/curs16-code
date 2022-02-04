package ro.fasttrackit.curs16.generics;

public class GenericMethod {
    public static <T extends Number> String append(String message, T count) { //T nu la niv de clasa, ci doar metoda vrea sa primeasca si int si double si etc
        return message + " " + count.intValue();
    }

//    public void altaMetoda(T input){ //nu recunoaste pe T aici
//    }
}
