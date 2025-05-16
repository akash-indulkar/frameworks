package com.akash.TEAM_MANAGEMENT;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
//    	Player p1 = new Player("Rohit Sharma", 45);
//    	Player p2 = new Player("Jasprit Bumrah", 18);
//    	List<Player> players = new ArrayList<Player>();
//    	players.add(p1);
//    	players.add(p2);
//    	Team t = new Team("Mumbai Indians", players);
    	Session session = new Configuration().configure().buildSessionFactory().openSession();
//    	Transaction tx = session.beginTransaction();
//    	session.persist(t);
//    	tx.commit();
    	Team t = session.getReference(Team.class, 2);
    	System.out.println(t);
    	session.close();
    }
}
