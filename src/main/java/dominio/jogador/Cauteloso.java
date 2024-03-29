package dominio.jogador;

import dominio.Propriedade;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class Cauteloso extends Jogador {
  public Cauteloso(String nome) {
    super(nome);
  }

  @Override
  public Boolean deveComprar(Propriedade propriedade) {
    return this.getSaldo().compareTo(propriedade.getValorDaVenda()) >= 0
        && this.getSaldo().subtract(propriedade.getValorDaVenda()).compareTo(BigDecimal.valueOf(80)) >= 0;
  }
}
