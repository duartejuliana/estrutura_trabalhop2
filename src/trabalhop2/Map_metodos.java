package trabalhop2;

import java.util.*;

public class Map_metodos {
    Map<Integer,Integer> listamap;
    
    Map_metodos(Map<Integer,Integer> obj) {
        listamap = obj;
    }
    
    public void inserir(int index, Integer valor) {
        listamap.put(index, valor);
    }
    
    public void remover(Integer valor) {
        listamap.remove(valor);
    }
    
    public void remover(int index) {
        listamap.remove(index);
    }
    
    public void ordenar() {
        ArrayList<Integer> ordenado = new ArrayList<Integer>();
        for(int i=0; i< listamap.size(); i++) {
            ordenado.add(listamap.get(i));
        }
        Collections.sort(ordenado);
        listamap.clear();
        for(int i=0; i< ordenado.size(); i++) {
            this.inserir(i, ordenado.get(i));
        }
    }
    
    public long tempo_ordenar(String arr[]) {
        long inicio, fim;
        inicio = System.currentTimeMillis();
        //System.out.println("Inicio: " + inicio);
        for(int i=0; i< arr.length; i++) {
            this.inserir(i, Integer.valueOf(arr[i]));
        }
        this.ordenar();
        //System.out.println(listamap);
        // *** Descomentar para aumentar o tempo de carregamento: 
        /*for(int i=0;i< 100000; i++) {
            this.inserir(i, (int)Math.random()*1000);
        }*/
        fim = System.currentTimeMillis();
        //System.out.println("Fim: " + fim);
        return fim - inicio;
    }
}