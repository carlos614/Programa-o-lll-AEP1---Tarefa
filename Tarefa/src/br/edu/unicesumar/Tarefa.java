package br.edu.unicesumar;

public class Tarefa {
	
	private int id;
	private String descricao;
	private String dataCriacao;
	private String situacao;
	private String responsavel;
	private String horasEstimadas;
	
	public enum Status{
		
		NAO_INICIADA,
		EM_PROGRESSO,
		TERMINADA,
		BLOQUEADA;
		
	}
	
	private Status status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public String getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(String horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	
	

}
