package main.java.com.georgescuconstantin.designpatterns.behaviorals.chain_of_responsability.middleware;

/**
 * ConcreteHandler. Check's a user role.
 */
public class RoleCheckMiddleware extends Middleware {

    @Override
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Hello admin!");
            return true;
        }
        System.out.println("Hello user!");
        return checkNext(email, password);
    }
}
