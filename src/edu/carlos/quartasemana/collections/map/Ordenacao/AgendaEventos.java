package edu.carlos.quartasemana.collections.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    //atributos
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;

        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);

        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data: " + proximaData);
                break;
            }

        }

    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JUNE, 02), "Calourada da Federa", "bebidas");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.OCTOBER, 15), "InterUnir", "competição");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.APRIL, 10), "Semana da computação", "programação");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();

    }
}
