package com.felipe.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class PagamentoComBoleto extends Pagamento{
	
	@JsonFormat(pattern="dd/MM/yyyy HH:mm")
	private Date dataVencimento;
	
	@JsonFormat(pattern="dd/MM/yyyy HH:mm")
	private Date dataPagamento;
	
	public PagamentoComBoleto() {
		
	}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido,Date dataPagamento,Date dataVencimento) {
		super(id, estado, pedido);
		this.setDataPagamento(dataPagamento);
		this.setDataVencimento(dataVencimento);
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	
}
