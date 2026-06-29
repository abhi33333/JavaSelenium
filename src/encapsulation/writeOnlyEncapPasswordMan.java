package encapsulation;

/* Concept: Data can only be modified, not viewed.
   Problem: Create class PasswordManager.
             Password should be settable but not retrievable.*/

class writeOnlyEncapPasswordMan {
	
	private String password;

    public void setPassword(String password) {

        this.password = password;
    }

}
