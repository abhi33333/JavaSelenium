package encapsulation;
/*Concept: Object value cannot change after creation.
  Problem: Create immutable class User.
 */

final class immutableClassUser {
	
	private final String username;

    public immutableClassUser(String username) {

        this.username = username;
    }

    public String getUsername() {

        return username;
    }

}
