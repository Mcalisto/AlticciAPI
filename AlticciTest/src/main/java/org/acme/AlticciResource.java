package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.reactive.RestPath;

@Path("/alticci")
public class AlticciResource {

    private int result;
    private int[] cache = new int[1000];
    
    public void cache(){
        cache[0] = 0;
        cache[1] = 1;
        cache[2] = 1;
    }

    @GET
    @Path("/{n}")
    @Produces(MediaType.TEXT_PLAIN)
    public int alticci(@RestPath int n) {
            this.cache();
            return calculateSequence(n);
            
    }


    public int calculateSequence(int n){

        if(this.cache[n] != 0){
            return cache[n];
        }
        if (n == 0) {
            return 0;
        }else if (n == 1 || n == 2) {
            return 1;
        }else
            this.result = calculateSequence(n-3)+calculateSequence(n-2);

        this.cache[n] = this.result;
        return this.result;
    }


}