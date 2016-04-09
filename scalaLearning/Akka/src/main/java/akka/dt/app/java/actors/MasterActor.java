package akka.dt.app.java.actors;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.UntypedActor;
import akka.actor.UntypedActorFactory;
import akka.dt.app.java.messages.Result;

/**
 * Created by Variant on 16/4/9.
 */
public class MasterActor extends UntypedActor{
    private ActorRef aggregateActor = getContext().actorOf(
      new Props(AggregateActor.class),"aggregate"
    );

    private ActorRef reduceActor = getContext().actorOf(
       new Props(new UntypedActorFactory(){
           public UntypedActor create(){
               return new ReduceActor(aggregateActor);
           }
       }),"reduce"
    );

    private ActorRef mapActor = getContext().actorOf(
            new Props(new UntypedActorFactory(){
                public UntypedActor create(){
                    return new ReduceActor(mapActor);
                }
            }),"map"
    );

    @Override public void onReceive(Object message) throws Exception {
        if(message instanceof String){
            mapActor.tell(message);
        }else if(message instanceof Result){
            aggregateActor.tell(message);
        }else {
            unhandled(message);
        }
    }
}
