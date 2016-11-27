package trabalhop2;

import java.util.*;

public class Colecao_metodos {
    Collection<Integer> lista;
    
    Colecao_metodos (Collection<Integer> obj) {
       lista = obj;
    }
   
    public void remover(Integer obj) {
        lista.remove(obj);
    }
    
    public void remover(int index) {
        lista.remove(index);
    }
    
    public void inserir(Integer obj) {
        lista.add(obj);
    }
    
    public boolean buscar(Integer obj) {
        return lista.contains(obj);
    }
    
    public void imprimir() {
        System.out.println(lista.toString());
    }
    
    public void ordenar() {
        ArrayList<Integer> ordenado = new ArrayList<Integer>();
        ordenado.addAll(lista);
        Collections.sort(ordenado);
        lista.clear();
        lista.addAll(ordenado);
    }
    
    public long tempo_ordenar(String arr[]) {
        long inicio, fim;
        inicio = System.currentTimeMillis();
        //System.out.println("Inicio: " + inicio);
        for(int i=0; i< arr.length; i++) {
            this.inserir(Integer.valueOf(arr[i]));
        }
        this.ordenar();
        //System.out.println(lista);
        // *** Descomentar para aumentar o tempo de carregamento: 
        /*for(int i=0;i< 100000; i++) {
            this.inserir((int)Math.random()*1000);
        }*/
        fim = System.currentTimeMillis();
        //System.out.println("Fim: " + fim);
        return fim - inicio;
    }
}