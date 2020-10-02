package projetointer;

public class Multa extends Motorista{
    private String valor;
    private String tipoMulta;
    private String vencimento;
    private String placam;

    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * @return the tipoMulta
     */
    public String getTipoMulta() {
        return tipoMulta;
    }

    /**
     * @param tipoMulta the tipoMulta to set
     */
    public void setTipoMulta(String tipoMulta) {
        this.tipoMulta = tipoMulta;
    }

    /**
     * @return the vencimento
     */
    public String getVencimento() {
        return vencimento;
    }

    /**
     * @param vencimento the vencimento to set
     */
    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public String getPlacam() {
        return placam;
    }

    /**
     * @param veiculo the veiculo to set
     */
    public void setPlacam(String veiculo) {
        this.placam = veiculo;
    }
   
}
