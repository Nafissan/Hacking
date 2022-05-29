public class Compte{

	private String login;
	private String password;

	public Compte(){

	}

	public void setLogin(String t_log){
		this.login=t_log;
	}
	public void setPass(String mdp){
		this.password=mdp;
	}

	String getLogin(){
		return this.login;
	}

	String getPass(){
		return this.password;
	}

	Boolean Test(String code,Compte com){
		if(this.password.equals(code)){
			return true;
		}
		return false;


	}
}