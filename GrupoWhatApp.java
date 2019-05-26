import java.util.ArrayList;

public class GrupoWhatApp {
	private String nomeGrupo;
	private ArrayList<Contato> membros = new ArrayList<Contato>();
    private ArrayList<String> mensagensGrupop= new ArrayList<String>();
	
    
    public String getNomeGrupo() {
		return nomeGrupo;
	}
	public void setNomeGrupo(String nomeGrupo) {
		this.nomeGrupo = nomeGrupo;
	}
	public ArrayList<Contato> getMembros() {
		return membros;
	}
	public void setMembros(ArrayList<Contato> membros) {
		this.membros = membros;
	}
	public ArrayList<String> getMensagensGrupop() {
		return mensagensGrupop;
	}
	public void setMensagensGrupop(ArrayList<String> mensagensGrupop) {
		this.mensagensGrupop = mensagensGrupop;
	}
    
    
    
	
	
	
	
	
	
}
