package com.ipartek.formacion.soap;

import java.util.ArrayList;

public class FrasesMotivacion {

	ArrayList<String> frases = null;
	int numeroAleatorio;

	public FrasesMotivacion() {
		super();
		this.frases = new ArrayList<String>();
		this.frases.add("Solo hay una felicidad en la vida - amar y ser amado-George Sand");
		this.frases.add("Siempre es temprano para rendirse-Norman Vincent Peale");
		this.frases.add("La fortuna favorece al valiente-Virgilio");
		this.frases.add("Estaba asi cuando llegue - Homer Simpson");
		this.frases.add("Ser un buen perdedor es aprender cómo ganar-Carl Sandburg");

	}

	public String dameFrase() {
		String resul = "Upppppppppppppppppppppppps";
		try {
			this.numeroAleatorio = (int) (Math.random() * (this.frases.size() - 1));
			resul = this.frases.get(this.numeroAleatorio);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return resul;
	}

	public String pedirFrase(int idFrase) {

		String resul = "NO se ha podido encontrar la frase con id:" + idFrase;
		try {

			resul = this.frases.get(idFrase);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return resul;
	}

}
