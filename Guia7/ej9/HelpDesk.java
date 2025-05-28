package Guias.Guia7.ej9;

import java.util.*;

public class HelpDesk {
    private final Map<ClientType, Queue<HelpTicket>> map = new EnumMap<>(ClientType.class);


    public HelpDesk openTicket(ClientType clientType, String name, String query) {
        map.putIfAbsent(clientType, new LinkedList<>());
        map.get(clientType).offer(new HelpTicket(name, query));
        return this;
    }

    public HelpTicket getNextTicket(ClientType clientType) {
        Queue<HelpTicket> list = map.get(clientType);
        if(list == null || list.isEmpty())
            throw new NoSuchElementException();
        return list.poll();
    }

    public HelpTicket getNextTicket(){ //Las prioridades ya estan definidas en el enum con el orden de declaracion
        for(Queue<HelpTicket> l : map.values()){
            if(!l.isEmpty())
                return l.poll();
        }
        throw new NoSuchElementException();
    }

    public boolean hasTickets() {
        for(Queue<HelpTicket> l : map.values()){
            if(!l.isEmpty())
                return true;
        }
        return false;
    }


    public static class HelpTicket {
        private final String name, query;

        public HelpTicket(String name, String query){
            this.name = name;
            this.query = query;
        }

        @Override
        public String toString(){
            return "Help Ticket for " + name + " asking " + query;
        }

    }
}
