package topMusic;

public class Cancion {
	private String titulo;
	private String artista;
	private int anno;
	
	
	//constructor
	public Cancion(String titulo, String artista, int anno) {
		setTitulo(titulo);
		setArtista(artista);
		setAnno(anno);
	}
	
	
	//Gets y Sets
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	
}
