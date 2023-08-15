package main.java.com.georgescuconstantin.designpatterns.behaviorals.chain_of_responsability;

import main.java.com.georgescuconstantin.designpatterns.behaviorals.chain_of_responsability.middleware.Middleware;
import main.java.com.georgescuconstantin.designpatterns.behaviorals.chain_of_responsability.middleware.RoleCheckMiddleware;
import main.java.com.georgescuconstantin.designpatterns.behaviorals.chain_of_responsability.middleware.ThrottlingMiddleware;
import main.java.com.georgescuconstantin.designpatterns.behaviorals.chain_of_responsability.middleware.UserExitsMiddleware;
import main.java.com.georgescuconstantin.designpatterns.behaviorals.chain_of_responsability.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoChainOfResponsibilityPattern {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.println("Enter email: ");
            String email = reader.readLine();
            System.out.println("Insert password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        // All checks are linked. Client can build various chains using the same
        // components.
        Middleware middleware = new ThrottlingMiddleware(2);
        middleware
                .linkWith(new UserExitsMiddleware(server))
                .linkWith(new RoleCheckMiddleware());
        // Server gets a chain from client code.
        server.setMiddleware(middleware);
    }
}
