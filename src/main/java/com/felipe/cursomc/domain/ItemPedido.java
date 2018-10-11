package com.felipe.cursomc.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class ItemPedido {
		
		@EmbeddedId
		private ItemPedidoPK id = new ItemPedidoPK();
		
		private Double desconto;
		private Integer quantidade;
		private Double preco;
		
		public ItemPedido() {
			
		}

		public ItemPedido(Pedido pedido,Produto produto, Double desconto, Integer quantidade, Double preco) {
			super();
			id.setPedido(pedido);
			id.setProduto(produto);
			this.desconto = desconto;
			this.quantidade = quantidade;
			this.preco = preco;
		}
		
		public Produto getProduto() {
			return id.getProduto();
		}
		
		public Pedido getPedido() {
			return id.getPedido();
		}	
		
		public ItemPedidoPK getId() {
			return id;
		}
	 	public void setId(ItemPedidoPK id) {
			this.id = id;
		}
}
