package controllers;

import models.Vuelo;
import play.libs.Json;
import play.mvc.*;

import views.html.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {

        List<Vuelo> vuelos = new ArrayList<>();

        for(int i = 0; i < 100; i++){
            int aleatorio = Integer.parseInt("" + Math.round(Math.random())) * 100;
            vuelos.add(new Vuelo(new Date(System.currentTimeMillis() - 1000*i*aleatorio), Vuelo.estados[aleatorio%3]));
        }

        return ok(Json.toJson(vuelos));
    }

}
