package classes;

public class controleRemoto implements Controlador {

	private int volume;
	private boolean ligado;
	private boolean tocando;

	public controleRemoto() {

		this.volume = 50;
		this.ligado = true;
		this.tocando = false;
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	 private boolean getTocando() {
		return tocando;
	}

	 private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	/* Métodos abstratos */

	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		System.out.println("--------------MENU-------------");
		System.out.println("Está ligado? " + this.getLigado());
		System.out.println("Está tocando? " + this.getTocando());
		System.out.println("volume: " + this.getVolume());
		for (int cont = 0; cont <= this.getVolume(); cont += 10) {
			System.out.println("|");
		}

	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando Menu...");

	}

	@Override
	public void aumentarVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() + 5);
		}else {
			System.out.println("Impossível aumentar volume");
		}

	}

	@Override
	public void diminuirVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() - 5);
		}else {
			System.out.println("Impossível diminuir volume");
		}

	}

	@Override
	public void ligarMudo() {
		if (this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}

	}

	@Override
	public void desligarMudo() {
		if (this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}

	}

	@Override
	public void play() {
		if (this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		}else {
			System.out.println("Não conseguir dar play");
		
		}

	}

	@Override
	public void pausar() {
		if (this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}else {
			System.out.println("Não consegui pausar");
		
		}

	}

}
