package akka.dt.app.java;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.dt.app.java.actors.MasterActor;
import akka.dt.app.java.messages.Result;

/**
 * Created by Variant on 16/4/9.
 */
public class HelloActor {

    public static void main(String[] args) throws Exception{
        ActorSystem _system = ActorSystem.create("HelloAkka");

        ActorRef master  =_system.actorOf(new Props(MasterActor.class),"master");

        master.tell("Hi! my name is Rockey. I am so happy to be here ");
        master.tell("Today,I'm going to read an article for you");
        master.tell("I sincerelly hope you can like that");

        Thread.sleep(500);

        master.tell(new Result());

        Thread.sleep(500);

        _system.shutdown();
    }
}
