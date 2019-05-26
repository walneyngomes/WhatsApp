import java.util.ArrayList;

public class Contato {
	ArrayList<GrupoWhatApp> grupos = new ArrayList<GrupoWhatApp>();
	private int numero;
	private String nome;

	public void addGrupo(GrupoWhatApp grupo) {
		grupo.getMembros().add(this);
		grupos.add(grupo);

	}

	public void sairGrupo(GrupoWhatApp grupo) {
		grupo.getMembros().remove(this);
		grupos.remove(grupo);
	}

	public void enviarMensagen(String texto, String nome) {
		for (GrupoWhatApp g : grupos) {
			if (g.getNomeGrupo().equals(nome)) {
				g.getMensagensGrupop().add(texto);
			}
		}

	}

	public ArrayList<GrupoWhatApp> getGrupos() {
		return grupos;
	}

	public void setGrupos(ArrayList<GrupoWhatApp> grupos) {
		this.grupos = grupos;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
